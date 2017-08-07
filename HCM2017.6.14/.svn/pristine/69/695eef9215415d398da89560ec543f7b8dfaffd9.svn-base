package com.ssh.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Tree;
import com.ssh.service.impl.RightServiceImpl;

public class TestTree {

	@Test
	public void test() {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		RightServiceImpl rightServiceImpl = (RightServiceImpl) factory.getBean("rightServiceImpl");
		List<Tree> tList = rightServiceImpl.select();
		System.out.println(tList.size());
		for(Tree t:tList){
			System.out.println(t.toString());
		}
	}

}
