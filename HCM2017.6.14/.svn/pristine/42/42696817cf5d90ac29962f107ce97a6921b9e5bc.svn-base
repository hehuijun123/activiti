package com.ssh.test;


import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void testBean() throws Exception{
		
		//bean的名字 首字母小写
		ActionTest actionTest = (ActionTest) ac.getBean("actionTest");
		System.out.println(actionTest);
	}
	@Test
	public void testBean1() throws Exception{
		SessionFactory sessionFactory = (SessionFactory) ac.getBean("sessionFactory");
	    System.out.println(sessionFactory);
	}
}
