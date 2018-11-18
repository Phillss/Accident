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
		map.put("/course/**", "authc");
		map.put("/shiro/**", "anon");
		map.put("/Accident/**", "authc");
		map.put("/js/*", "anon");
		map.put("/eChar.jsp", "anon");
		map.put("/logup.jsp", "anon");
		map.put("/login.jsp", "anon");
		map.put("/WEB-INF/**", "authc");
		map.put("/index.jsp", "authc");
		map.put("/list.jsp", "user");
		map.put("/**", "authc");
		
		return map;
	}
}
