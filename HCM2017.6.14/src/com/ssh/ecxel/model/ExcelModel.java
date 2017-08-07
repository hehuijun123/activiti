package com.ssh.ecxel.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.service.impl.ExcelModelServiceImpl;


public class ExcelModel {
	
	//封装数据
	public Map excelData(){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		ExcelModelServiceImpl excelModelServiceImpl = (ExcelModelServiceImpl) factory.getBean("excelModelServiceImpl");	
		List<HazardousChemicalsExcel> listHz = new ArrayList<>();
		Map<String,Map<String,List<HazardousChemicalsExcel>>> mapType = new LinkedHashMap<>();
		Map<String,List<HazardousChemicalsExcel>> mapData = new LinkedHashMap<>();
		List<String> listType = excelModelServiceImpl.selectType();
		for(String type:listType){
			List<HazardousChemicalsExcel> list = excelModelServiceImpl.selectByType(type);
			for(HazardousChemicalsExcel hz:list){
				listHz = excelModelServiceImpl.selectByName(hz.getName());	
				mapData.put(hz.getName(), listHz);
			}
			
			mapType.put(type, mapData);
		}
		/*for(Map.Entry<String, Map<String, List<HazardousChemicalsExcel>>> entry : mapType.entrySet()){
			System.out.println("-----------------");
    		 Map<String, List<HazardousChemicalsExcel>> list = entry.getValue();	 
    		 for(Map.Entry<String, List<HazardousChemicalsExcel>> entrys : list.entrySet()){
        		 List<HazardousChemicalsExcel> lists = entrys.getValue();
        		 for(HazardousChemicalsExcel hz:lists){
     				System.out.println("危化物名称："+hz.getName()+"     危化物类型："+hz.getHtype()+"     适用场合"+hz.getHmethod());
     			}       		
        	 }	
    	 }*/
		
	/*	 for (Map<String,List<HazardousChemicalsExcel>> map : mapType.values()) {
			 for (List<HazardousChemicalsExcel> maps : map.values()) {
				 for(HazardousChemicalsExcel hz:maps){
	     				System.out.println("危化物名称："+hz.getName()+"     危化物类型："+hz.getHtype()+"     适用场合"+hz.getHmethod());
	     			} 
			       }
		       }*/
		 
	
			 for(String s:mapData.keySet()){
				 List<HazardousChemicalsExcel> maps = mapData.get(s);
				 for(HazardousChemicalsExcel hz:maps){
	     				System.out.println("危化物名称："+hz.getName()+"     危化物类型："+hz.getHtype()+"     适用场合"+hz.getHmethod());
	     			} 
			 }
			 
		 
		return mapType;		
	}
}
