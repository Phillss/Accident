package com.ssm.shiro.filter;

import java.util.LinkedHashMap;

public class FilterChainDefinitionBuilder {
	
	/**
	 * 访问数据表，获取权限，加入map中
	 * @return
	 */
	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map=new LinkedHashMap<>();
		map.put("/css/**", "anon");
		map.put("/img/**","anon");
		map.put("/list/**", "anon");
		map.put("/font.jsp", "anon");
		map.put("/course/**", "authc");				//课程页面
		map.put("/regulations/**", "authc");		//行业法规页面
		map.put("/record/**", "authc");				//记录管理页面
		map.put("/assortment/**", "authc");		 //分类管理页面
		map.put("/cartogram/**", "authc");    //统计图页面
		map.put("/accident/**", "authc");     //事故信息页面
		map.put("/shiro/**", "anon");
		map.put("/js/*", "anon");
		
		map.put("/Accident/**", "authc");	
		map.put("/userhandler/**","anon");
		
		map.put("/adminlogin.jsp", "anon");
		map.put("/logup.jsp", "anon");
		map.put("/login.jsp", "anon");
		map.put("/index.jsp", "authc");
		
		map.put("/WEB-INF/**", "authc");
//		map.put("/list.jsp", "user");
		map.put("/**", "authc");
		
		return map;
	}
}
