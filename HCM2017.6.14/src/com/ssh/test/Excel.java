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
			storehouse.setStype("��ը��");
			storehouse.setSname("����");
			storehouse.setSbeforeSurplus("1"+String.valueOf(i));
			storehouse.setSmonth("100"+String.valueOf(i));
			storehouse.setSall("200"+String.valueOf(i));
			storehouse.setSother("ʵ����");
			list.add(storehouse);
		}	
		for(int i = 0;i<4;i++){
			Storehouse storehouse = new Storehouse();
			storehouse.setSid((long)i);;
			storehouse.setSnum("00"+String.valueOf(i));
			storehouse.setStype("����");
			storehouse.setSname("þ");
			storehouse.setSbeforeSurplus("1"+String.valueOf(i));
			storehouse.setSmonth("100"+String.valueOf(i));
			storehouse.setSall("200"+String.valueOf(i));
			storehouse.setSother("ʵ����");
			list.add(storehouse);
		}	
		for(int i = 0;i<5;i++){
			Storehouse storehouse = new Storehouse();
			storehouse.setSid((long)i);;
			storehouse.setSnum("00"+String.valueOf(i));
			storehouse.setStype("Һ��");
			storehouse.setSname("��������");
			storehouse.setSbeforeSurplus("1"+String.valueOf(i));
			storehouse.setSmonth("100"+String.valueOf(i));
			storehouse.setSall("200"+String.valueOf(i));
			storehouse.setSother("ʵ����");
			list.add(storehouse);
		}	
		for(int i = 0;i<list.size();i++){
			Storehouse storehouse = list.get(i);
			String  type = storehouse.getStype();
			System.out.println(type);
			if(type.equals("ѹ�������Һ������")){
				System.out.println("------");
				(ty.getListGas()).add(storehouse);
			}
			if(type.equals("��ȼҺ��")){
				(ty.getListwater()).add(storehouse);
			}
			if(type.equals("��ȼ����")){
				(ty.getListstone()).add(storehouse);
			}
			if(type.equals("������")){
				System.out.println("------");
				(ty.getListO2()).add(storehouse);
			}
			if(type.equals("����Ʒ")){
				(ty.getListPoison()).add(storehouse);
			}
			if(type.equals("��������Ʒ")){
				(ty.getListEmit()).add(storehouse);
			}
			if(type.equals("��ʴƷ")){
				(ty.getListCorrosion()).add(storehouse);
			}
			if(type.equals("��ըƷ")){
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
		System.out.println("������"+object.getClass().getName()+"���ϴ�С��"+list.size());
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
			          //System.out.println("�� key ��"+entry.getKey()+" ֵvalue ��"+entry.getValue().size());
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
