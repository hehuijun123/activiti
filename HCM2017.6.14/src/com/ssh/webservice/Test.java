package com.ssh.webservice;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.ssh.entity.Storage;

public class Test {
	public static void main(String[] args) {
		
//		List<Storage> list = new ArrayList<Storage>();
//		for (int i = 0; i < 3; i++) {
//			Storage s = new Storage();
//			s.setScoding("a"+i);
//			s.setSmonth("b"+i);
//			s.setSsurplus("c"+i);
//			list.add(s);
//			
//		}
//		String s =  JSON.toJSONString(list);
//		System.out.println(s);
		
		String ss="[{\"scoding\":\"a0\",\"smonth\":\"b0\",\"ssurplus\":\"c0\"},]";
		Test t = new Test();
		t.aa(ss);
	}
	
	public void aa(String s){
		System.out.println(s);		
		List<Storage> lists = JSON.parseArray(s, Storage.class);
		System.out.println(lists.size());
		for(int i = 0;i<lists.size();i++){
			System.out.println(lists.get(0).getSnum());	
		}		
	}
}
