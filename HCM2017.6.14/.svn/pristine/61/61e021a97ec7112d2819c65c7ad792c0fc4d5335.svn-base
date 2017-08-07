package com.ssh.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.dao.impl.StoragehouseDaoImpl;
import com.ssh.entity.Consumer;
import com.ssh.entity.Resources;
import com.ssh.service.impl.RightServiceImpl;
import com.ssh.service.impl.StoragehouseServiceImpl;
import com.ssh.service.impl.UserServiceImpl;
import com.ssh.util.BinarySearchUtil;

public class TestSpeed {

	@Test
	public void test() {
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) factory.getBean("userServiceImpl");
		RightServiceImpl rightServiceImpl = (RightServiceImpl) factory.getBean("rightServiceImpl");
		//Map map = ActionContext.getContext().getSession();
		Consumer consumer = userServiceImpl.Login("zcm");
		//map.clear();			
		String qx = consumer.getCqx().replace(" ", "");
		try {
			if(qx!=null&&!"".equals(qx)){
				String[] str = qx.split(",");
				List<Resources> listrs = rightServiceImpl.search();
				long[] ids = new long[listrs.size()];
				for (int a = 0; a<listrs.size();a++) {
					ids[a] = listrs.get(a).getRid();
					}
					
			long start = System.currentTimeMillis();
			//BinarySearchUtil.binarySearch(ids, ss);
			BinarySearchUtil.listt(str, listrs,ids);
			long end = System.currentTimeMillis();
			System.out.println("时间："+(end-start));
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void tests(){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl userServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");
		Map<String,String> map = new HashMap<String, String>();
		map.put("value", "1");
		map.put("key", "jt");
		long start = System.currentTimeMillis();
		//BinarySearchUtil.binarySearch(ids, ss);
		userServiceImpl.searchAllPc("1","10","2017年5月",map,null);
		long end = System.currentTimeMillis();
		System.out.println("时间："+(end-start));
	}
	@Test
	public void testss(){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseDaoImpl userServiceImpl = (StoragehouseDaoImpl) factory.getBean("storagehouseDaoImpl");
		Map<String,String> map = new HashMap<String, String>();
		map.put("value", "1");
		map.put("key", "jt");
		long start = System.currentTimeMillis();
		//BinarySearchUtil.binarySearch(ids, ss);
		userServiceImpl.searchAdminPc("1","10","2017年5月",map,null);
		long end = System.currentTimeMillis();
		System.out.println("时间："+(end-start));
	}

}
