package com.ssh.test;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionContext;
import com.ssh.entity.Consumer;
import com.ssh.entity.Resources;
import com.ssh.service.impl.RightServiceImpl;
import com.ssh.service.impl.UserServiceImpl;
import com.ssh.util.BinarySearchUtil;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserServiceImpl userServiceImpl = (UserServiceImpl) factory.getBean("userServiceImpl");
		RightServiceImpl rightServiceImpl = (RightServiceImpl) factory.getBean("rightServiceImpl");
		Map map = ActionContext.getContext().getSession();
		Consumer consumer = userServiceImpl.Login("zcm");
		map.clear();			
		String qx = consumer.getCqx().replace(" ", "");
		try {
			if(qx!=null&&!"".equals(qx)){
				String[] str = qx.split(",");
				List<Resources> listrs = rightServiceImpl.search();
				long[] ids = new long[100];
				for (int a = 0; a<listrs.size();a++) {
					ids[a] = listrs.get(a).getRid();
					}
				
				for(int i = 0;i<str.length;i++){
					String s = str[i];
					int ss = Integer.valueOf(s);
					long start = System.currentTimeMillis();
					BinarySearchUtil.binarySearch(ids, ss);
					long end = System.currentTimeMillis();
					System.out.println("ʱ�䣺"+(end-start));break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	
	
	

}
