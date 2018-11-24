package com.ssm.shiro.filter;

import java.util.LinkedHashMap;

public class FilterChainDefinitionBuilder {
	
	/**
	 * 访问数据表，获取权限，加入map中
	 * @return
	 */
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map=new LinkedHashMap<>();
		//静态资源的访问（不需要认证）
		map.put("/css/**", "anon");
		map.put("/img/**","anon");
		map.put("/js/*", "anon");
		
		//不需要认证可以访问的资源
		map.put("/font.jsp", "anon");
		map.put("/adminlogin.jsp", "anon");
		map.put("/logup.jsp", "anon");
		map.put("/login.jsp", "anon");
		
		
		//需要认证才能访问的页面
		map.put("/index.jsp", "authc");             //默认首页
		map.put("/course/**", "authc");				//课程页面
		map.put("/regulations/**", "authc");		//行业法规页面
		map.put("/record/**", "authc");				//记录管理页面
		map.put("/assortment/**", "authc");		 //分类管理页面
		map.put("/cartogram/**", "authc");    //统计图页面
		map.put("/accident/**", "authc");     //事故信息页面
		map.put("/shiro/**", "anon");
		
		//需要超级管理员认证才能访问
		map.put("/userhandler/findAllUsers.action", "authc,roles[superadmin]");  //需要管理员权限
		map.put("/userhandler/findLikeUsers.action", "authc,roles[superadmin]");
		map.put("/userhandler/updatelist.action", "authc,roles[superadmin]");
		map.put("/userhandler/userupdate.action", "authc,roles[superadmin]");
		map.put("/userhandler/deleteUser.action", "authc,roles[superadmin]");
		
		//针对前端控制器的访问
		map.put("/Accident/**", "authc");	
		map.put("/userhandler/**","anon");
		
		//跳过以上认证的资源需要认证
		map.put("/WEB-INF/**", "authc");
		map.put("/**", "authc");
		
		return map;
	}
}
