package com.ssh.util;


import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Role;
import com.ssh.service.impl.RoleServiceImpl;

public class ChooseRole  {
	
	static BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	static RoleServiceImpl roleServiceImpl = (RoleServiceImpl) factory.getBean("roleServiceImpl");
	public static Map<String,String> chooseRole(String cid){
		Long cids = Long.valueOf(cid);
		Role role = roleServiceImpl.selectById(cids);
		Map<String,String> map = new HashMap<String, String>();
		Long id = role.getRid();
		String parent = role.getParents();
		if(parent!=null&&!"".equals(parent)){//不为空，说明是水厂用户或制水公司用户
			Role roles = roleServiceImpl.selectById(Long.valueOf(parent));
			if(roles.getParents()!=null&&!"".equals(roles.getParents())){//说明是水厂用户
				Role roless = roleServiceImpl.selectById(Long.valueOf(roles.getParents()));
				map.put("sc", String.valueOf(role.getRid()));
				map.put("zs", String.valueOf(roles.getRid()));	
				map.put("jt", String.valueOf(roless.getRid()));
			}else{//说明是制水公司用户
				map.put("zs", String.valueOf(role.getRid()));	
				map.put("jt", String.valueOf(roles.getRid()));
			}
		}else{//说明是集团用户
			map.put("jt", "0");
		}
		return map;	
	}
	
	public static Map<String,String> chooseWorkAndKey(String str){
		Long cids = Long.valueOf(str);
		Role role = roleServiceImpl.selectById(cids);
		Map<String,String> map = new HashMap<String, String>();
		Long id = role.getRid();
		String parent = role.getParents();
		if(parent!=null&&!"".equals(parent)){//不为空，说明是水厂用户或制水公司用户
			Role roles = roleServiceImpl.selectById(Long.valueOf(parent));
			if(roles.getParents()!=null&&!"".equals(roles.getParents())){
				Role roless = roleServiceImpl.selectById(Long.valueOf(roles.getParents()));
				map.put("value", str);			
				map.put("key", "sc");
			}else{//说明是制水公司用户
				map.put("value", str);	
				map.put("key","zs");
			}
		}else{//说明是集团用户
			map.put("value", str);
			map.put("key", "jt");
		}
		return map;	
	}
	
	public static Map<String,String> chooseWorkAndKey1(String str){
		Long cids = Long.valueOf(str);
		Role role = roleServiceImpl.selectById(cids);
		Map<String,String> map = new HashMap<String, String>();
		Long id = role.getRid();
		String parent = role.getParents();
		if(parent!=null&&!"".equals(parent)){//不为空，说明是水厂用户或制水公司用户
			Role roles = roleServiceImpl.selectById(Long.valueOf(parent));
			if(roles.getParents()!=null&&!"".equals(roles.getParents())){
				Role roless = roleServiceImpl.selectById(Long.valueOf(roles.getParents()));
				map.put("value", str);			
				map.put("key", "sc");
			}else{//说明是制水公司用户
				map.put("value", str);	
				map.put("key","zs");
			}
		}else{//说明是集团用户
			map.put("value", str);
			map.put("key", "jt");
		}
		return map;	
	}
}
