package com.ssm.shiro.realm;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssm.pojo.Vo.User_t_Vo;
import com.ssm.service.user.UserService;

//如果单纯认证 extends AuthenticatingRealm
//认证加授权继承AuthorizingRealm 并实现其中两个方法
//@Component
public class ShiroRealm extends AuthorizingRealm {

	@Autowired
	private UserService service;

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

		// 1、AuthenticationToken 转换为 UsernamePasspwodToken
		UsernamePasswordToken uptoken = (UsernamePasswordToken) token;
		// 2、从UsernamePasswordToken中获取username
		String username = uptoken.getUsername();
		// 3、数据库查询对应的用户记录
		System.out.println("验证" + username + "用户信息");
		// 4、若用户不存在，则可以抛出UnknowAccountException异常
		if ("unknow".equals(username)) {
			throw new UnknownAccountException("用户不存在");
		}
		// 5、是否要抛出其他的AuthenticationException异常
		if ("monster".equals(username)) {
			throw new AuthenticationException("用户被锁定");
		}
		// 6、根据用户情况，构建AuthenticationInfo对象并返回 实现类为 SimpleAuthenticationInfo
		// 从数据库中获取
		// principal 认证的实体信息
		// credentials 密码
		// realmName 当前realm的name 调用父类的 getname（）；
		Object principal = username;
		Object credentials = null;
		try {
			User_t_Vo user = service.serviceFindUserByName(username);
			credentials = user.getUs_passwd();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String realmName = getName();
		ByteSource credentialsSalt = ByteSource.Util.bytes(username);// 盐值要唯一 采用用户名
		SimpleAuthenticationInfo info = null;
		info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);
		return info;
	}

	// 授权会被shiro回调的方法
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principal) {

		// 从PrincipalCollection中获取登陆用户的信息
		// 获取principal 也是有顺序的
		Object principals = principal.getPrimaryPrincipal();
		// 从登陆信息中获取用户角色或权限（可能需要查询数据库）
		// 查询数据库 获取用户角色信息
		Integer role = null;
		try {
			role = service.serviceFindUserByName(principals.toString()).getUs_roles();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("用户角色是：" + role);
		Set<String> roles = new HashSet<String>();
		if (role == 0) {
			roles.add("user");
		}
		if (role == 1) {
			roles.add("employer");
		}
		if (role == 2) {
			roles.add("analyst");
		}
		if (role == 3) {
			roles.add("assessor");
		}
		if (role == 9) {
			roles.add("superadmin");
		}
		// 创建SimpleAuthorizationInfo,并设置其roles属性
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo(roles);
		return info;
	}

	// 生成带盐加密后的密码
	public String MD5salt(String pass, String user, int count) {
		String algorithmName = "MD5";
		Object source = pass;
		Object salt = ByteSource.Util.bytes(user);
		int hashIterations = count;
		Object result = new SimpleHash(algorithmName, source, salt, hashIterations);
		return result.toString();
	}

	/*
	 * @Test public void test() { System.out.println(MD5salt("1234", "admin",
	 * 1024)); }
	 */

}
