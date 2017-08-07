package com.ssh.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		List<String> size = new ArrayList<>();
		List<String> ll = new ArrayList<>();
		size.add("a");
		size.add("b");
		size.add("c");
		size.add("c");
		size.add("a");
		size.add("b");
		size.add("n");
		size.add("f");
		size.add("d");
		size.add("v");
		size.add("b");
		size.add("b");
		size.add("u");
		/*HashSet h = new HashSet(size);   
		size.clear();   
		size.addAll(h);   
		Iterator<String> iterator = h.iterator();//创建iterator对象
		while(iterator.hasNext()){//用while循环，判断是否有下一个
		String string=iterator.next();//转换为String类型
		System.out.println(string);}//打印
*/		
		for(int i = 0;i<size.size();i++){
			for(int j = size.size()-1;j>i;j--){
				String a =size.get(i) ;
				String b=size.get(j);
				if(a.equals(b)){				
					size.remove(j);
				}
			}
		}
		for(String str:size){
			System.out.println("str:"+str);
		}
	}
		
	

}
