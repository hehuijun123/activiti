package com.ssh.test;


import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Role;
import com.ssh.service.impl.RoleServiceImpl;
import com.ssh.util.ChooseRole;

public class TestRole {

	/*@Test
	public void test() {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleServiceImpl roleServiceImpl = (RoleServiceImpl) factory.getBean("roleServiceImpl");
		//Role role = roleServiceImpl.selectById((long)30);
		
		Map<String,String> map = ChooseRole.chooseRole("1");
		
		 for(Map.Entry<String, String> entry : map.entrySet()){
			 System.out.println("¼ü key £º"+entry.getKey()+" Öµvalue £º"+entry.getValue());
			 
		 }
	
	}*/
	
	@Test
	public void test1() {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleServiceImpl roleServiceImpl = (RoleServiceImpl) factory.getBean("roleServiceImpl");
		//Role role = roleServiceImpl.selectById((long)30);
		
		Map<String,String> map = ChooseRole.chooseWorkAndKey("10");
		
		 for(Map.Entry<String, String> entry : map.entrySet()){
			 System.out.println("¼ü key £º"+entry.getKey()+" Öµvalue £º"+entry.getValue()); 
		 }
	
	}

}
