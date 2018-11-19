package com.ssm.utils;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class CourseUtils {
	
	public void befores() {
		System.out.println("前置通知");
	}
	
	public void afters() {
		System.out.println("后置通知");
	}
	
	public Object caround(ProceedingJoinPoint join) {
		Object object=null;
		try {
			Date date=new Date();
			System.out.println("log:对课程执行操作"+date.toString());
			object=join.proceed();
			Date dates =new Date();
			System.out.println("log:课程操作操作完毕！"+dates.toString());
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return object;
	}
}
