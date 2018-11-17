package com.ssm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssm.pojo.PageBean;


public class Demo {
	/*ApplicationContext application;*/
	
	/*@Before
	public void signUp() {
		application=new ClassPathXmlApplicationContext("applicationConfig.xml");
	}*/
	@Test
	public void test() throws Exception {
		/*Service service=(Service) application.getBean("service");
		ItemsVo vo=new ItemsVo();
		Items items=new Items();
		items.setName("可乐");
		vo.setItems(items);
		List<ItemsImpl> list=service.findsItems(vo);
		for (ItemsImpl itemsImpl : list) {
			System.out.println(itemsImpl);*/
		int a=3;
		int b=10;
		System.out.println(Math.ceil(a/b));
		}
	}

