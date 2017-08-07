package com.ssh.test;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.ecxel.model.ExcelModel;
import com.ssh.entity.Storehouse;
import com.ssh.entity.Ty;
import com.ssh.service.impl.StoragehouseServiceImpl;
import com.ssh.util.CreatExcel;
import com.ssh.util.ExcelData;
import com.ssh.util.JxlExcelCreateTool;

public class Excel {

/*	@Test
	public void test() throws Exception {
		Map<String, List<Storehouse>> map = new HashMap();
		List<Storehouse> list= new ArrayList<>();
		Ty ty = new Ty();
		for(int i = 0;i<3;i++){
			Storehouse storehouse = new Storehouse();
			storehouse.setSid((long)i);;
			storehouse.setSnum("00"+String.valueOf(i));
			storehouse.setStype("爆炸物");
			storehouse.setSname("硫酸");
			storehouse.setSbeforeSurplus("1"+String.valueOf(i));
			storehouse.setSmonth("100"+String.valueOf(i));
			storehouse.setSall("200"+String.valueOf(i));
			storehouse.setSother("实验室");
			list.add(storehouse);
		}	
		for(int i = 0;i<4;i++){
			Storehouse storehouse = new Storehouse();
			storehouse.setSid((long)i);;
			storehouse.setSnum("00"+String.valueOf(i));
			storehouse.setStype("固体");
			storehouse.setSname("镁");
			storehouse.setSbeforeSurplus("1"+String.valueOf(i));
			storehouse.setSmonth("100"+String.valueOf(i));
			storehouse.setSall("200"+String.valueOf(i));
			storehouse.setSother("实验室");
			list.add(storehouse);
		}	
		for(int i = 0;i<5;i++){
			Storehouse storehouse = new Storehouse();
			storehouse.setSid((long)i);;
			storehouse.setSnum("00"+String.valueOf(i));
			storehouse.setStype("液体");
			storehouse.setSname("氢氧化钠");
			storehouse.setSbeforeSurplus("1"+String.valueOf(i));
			storehouse.setSmonth("100"+String.valueOf(i));
			storehouse.setSall("200"+String.valueOf(i));
			storehouse.setSother("实验室");
			list.add(storehouse);
		}	
		for(int i = 0;i<list.size();i++){
			Storehouse storehouse = list.get(i);
			String  type = storehouse.getStype();
			System.out.println(type);
			if(type.equals("压缩气体和液化气体")){
				System.out.println("------");
				(ty.getListGas()).add(storehouse);
			}
			if(type.equals("易燃液体")){
				(ty.getListwater()).add(storehouse);
			}
			if(type.equals("易燃固体")){
				(ty.getListstone()).add(storehouse);
			}
			if(type.equals("氧化剂")){
				System.out.println("------");
				(ty.getListO2()).add(storehouse);
			}
			if(type.equals("毒害品")){
				(ty.getListPoison()).add(storehouse);
			}
			if(type.equals("放射性物品")){
				(ty.getListEmit()).add(storehouse);
			}
			if(type.equals("腐蚀品")){
				(ty.getListCorrosion()).add(storehouse);
			}
			if(type.equals("爆炸品")){
				(ty.getListboom()).add(storehouse);
			}
		}
		map.put("1", ty.getListGas());
		map.put("2", ty.getListwater());
		map.put("3", ty.getListstone());
		map.put("4", ty.getListO2());
		map.put("5", ty.getListPoison());
		map.put("6", ty.getListEmit());
		map.put("7", ty.getListCorrosion());
		map.put("8", ty.getListboom());
		
		
		JxlExcelCreateTool.writeExcel(map);
		Object object = list.get(0);
		System.out.println("类名："+object.getClass().getName()+"集合大小："+list.size());
		for (Storehouse storehouse : list) {
			System.out.println(storehouse);
		}
		for(Map.Entry<String, List<Storehouse>> entry : map.entrySet()){
			System.out.println(entry.getValue());
					List<Storehouse> list1 = entry.getValue();
					for(int i = 0;i<list1.size();i++){
						Storehouse storehouse = list1.get(i);
						String  type = storehouse.getStype();
						System.out.println(i+":"+type);
					}
			          //System.out.println("键 key ："+entry.getKey()+" 值value ："+entry.getValue().size());
		}
	}*/
	
	
	@Test
	public void test1() throws Exception {		
		/*BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");						
		List<String> size = storagehouseServiceImpl.selectSize();
		for(String str:size){
			List<Storehouse> list= storagehouseServiceImpl.searchExcel(str);
			CreatExcel.create(list);
		}*/
		ExcelData excelData = new ExcelData();
		excelData.createSc();
		excelData.createJt();
		//CreatExcel.doExcel();		
	}
	
	@Test
	public void test2() throws Exception {		
		/*BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");						
		List<String> size = storagehouseServiceImpl.selectSize();
		for(String str:size){
			List<Storehouse> list= storagehouseServiceImpl.searchExcel(str);
			CreatExcel.create(list);
		}*/
		ExcelModel excelModel = new ExcelModel();
		excelModel.excelData();
		//CreatExcel.doExcel();		
	}
}
