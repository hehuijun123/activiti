package com.ssh.util;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Consumer;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Role;
import com.ssh.service.impl.RoleServiceImpl;

public class ChooseFactory {
	
	
	
	
	public static String chooseWork(String work){
		String hw = "";
		switch (work) {  
        case "1":  
        	 hw = "ÎåºÅ¹µ"; 
            break;
        case "2":  
        	hw = "°×Áú¸Û"; 
            break;
        case "3":  
        	
            break;  
        case "4":  
        	
            break;
        case "5":  
            System.out.println("case0"); 
            break;
        case "6":  
            System.out.println("case0"); 
            break;
        case "7":  
            System.out.println("case0");
            break;  
        case "8":  
            System.out.println("case3"); 
            break;
        case "9":  
            System.out.println("case0"); 
            break;
        case "10":  
            System.out.println("case0"); 
            break;
        case "11":  
            System.out.println("case0");
            break;  
        case "12":  
            System.out.println("case3"); 
            break;
        case "13":  
            System.out.println("case0"); 
            break;
        case "14":  
            System.out.println("case0"); 
            break;
        case "15":  
            System.out.println("case0");
            break;  
        case "16":  
            System.out.println("case3"); 
            break;
		}
		return hw;
		
	}
	
	public static String chooseNum(String work){
		String hw = "";
		switch (work) {  
        case "ÎåºÅ¹µ":  
        	 hw = "1"; 
            break;
        case "°×Áú¸Û":  
        	hw = "2"; 
            break;
        case "3":  
        	
            break;  
        case "4":  
        	
            break;
		}
		return hw;
		
	}
	
	
	public static String chooseRole(Consumer consumer){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleServiceImpl roleServiceImpl = (RoleServiceImpl) factory.getBean("roleServiceImpl");
		String company = consumer.getCsc();
		String jt = consumer.getCjt();
		String zs = consumer.getCzs();
		String str = "";
		if(company!=null&&!"".equals(company)){
			str = company;
		}else{
			if(zs!=null&&!"".equals(zs)){
				str = zs;
			}else{
				str = jt;
			}
			
		}
		Role role = roleServiceImpl.selectById(Long.valueOf(str));
		String name = role.getName();		
		return name;	
	}
	
	public static String chooseRoleId(Consumer consumer){
		String company = consumer.getCsc();
		String jt = consumer.getCjt();
		String zs = consumer.getCzs();
		String str = "";
		if(company!=null&&!"".equals(company)){
			str = company;
		}else{
			if(zs!=null&&!"".equals(zs)){
				str = zs;
			}else{
				str = jt;
			}
			
		}
		/*Role role = roleServiceImpl.selectById(Long.valueOf(str));
		String name = role.getName();	*/	
		return str;	
	}
	
	
	public static String chooseRoles(Consumer consumer){
		String company = consumer.getCsc();
		String jt = consumer.getCjt();
		String zs = consumer.getCzs();
		String str = "";
		if(company!=null&&!"".equals(company)){
			str = "sc";
		}else{
			if(zs!=null&&!"".equals(zs)){
				str = "zs";
			}else{
				str = "jt";
			}
			
		}
		/*Role role = roleServiceImpl.selectById(Long.valueOf(str));
		String name = role.getName();	*/	
		return str;	
	}
	public static String chooseIdName(String strs){
		System.out.println(strs);
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		RoleServiceImpl roleServiceImpl = (RoleServiceImpl) factory.getBean("roleServiceImpl");
		String name = "";
		if(strs!=null&&!"".equals(strs)){
			Role role = roleServiceImpl.selectById(Long.valueOf(strs));
		    name = role.getName();	
		}		
		return name;
		
		
	}

}
