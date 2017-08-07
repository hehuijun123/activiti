package com.ssh.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Storehouse;
import com.ssh.entity.Ty;
import com.ssh.service.impl.StoragehouseServiceImpl;

public class CreatExcel {
	public static void create(List<Storehouse> list) throws Exception {		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");		
		try {
			Map<String, List<Storehouse>> map = new HashMap();
			Ty ty = new Ty();	
			for(int i = 0;i<list.size();i++){
				Storehouse storehouse = list.get(i);			
				String  type = storehouse.getStype();
				String  junit = storehouse.getSunit();
				String month="";
				String all="";
				String befor="";
				if(storehouse.getSmonth()!=null&&!storehouse.getSmonth().equals("0")&&!"".equals(storehouse.getSmonth())){
					  month = storehouse.getSmonth()+junit;
				}else{
					month = "0";
				}
				if(storehouse.getSall()!=null&&!storehouse.getSall().equals("0")&&!"".equals(storehouse.getSall())){
					  all = storehouse.getSall()+junit;		
				}else{
					all = "0";
				}
				if(storehouse.getSbeforeSurplus()!=null&&!storehouse.getSbeforeSurplus().equals("0")&&!"".equals(storehouse.getSbeforeSurplus())){
					  befor = storehouse.getSbeforeSurplus()+junit;
				}else{
					befor = "0";
				}
				storehouse.setSbeforeSurplus(befor);
				storehouse.setSmonth(month);
				storehouse.setSall(all);			
				if(type.equals("压缩气体和液化气体")){
					(ty.getListGas()).add(storehouse);
				}
				if(type.equals("易燃液体")){
					(ty.getListwater()).add(storehouse);
				}
				if(type.equals("易燃固体")){
					(ty.getListstone()).add(storehouse);
				}
				if(type.equals("氧化剂")){
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
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void createjt(List<Storehouse> list) throws Exception {		
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");		
		Map<String, List<Storehouse>> map = new HashMap();
		Ty ty = new Ty();	
		for(int i = 0;i<list.size();i++){
			Storehouse storehouse = list.get(i);			
			String  type = storehouse.getStype();
			String  junit = storehouse.getSunit();
			String month="";
			String all="";
			String befor="";
			if(!storehouse.getSmonth().equals("0.0")){
				  month = storehouse.getSmonth()+junit;
			}else{
				month = "0";
			}
			if(!storehouse.getSall().equals("0.0")){
				  all = storehouse.getSall()+junit;		
			}else{
				all = "0";
			}
			if(!storehouse.getSbeforeSurplus().equals("0.0")){
				  befor = storehouse.getSbeforeSurplus()+junit;
			}else{
				befor = "0";
			}
			storehouse.setSbeforeSurplus(befor);
			storehouse.setSmonth(month);
			storehouse.setSall(all);			
			if(type.equals("压缩气体和液化气体")){
				(ty.getListGas()).add(storehouse);
			}
			if(type.equals("易燃液体")){
				(ty.getListwater()).add(storehouse);
			}
			if(type.equals("易燃固体")){
				(ty.getListstone()).add(storehouse);
			}
			if(type.equals("氧化剂")){
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
		JxlExcelCreateTool.writeExcelJT(map);
	}
	
	
	public static void doExcel() throws Exception{
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");				
		
		List<String> size = storagehouseServiceImpl.selectSize();
		for(String str:size){
			List<Storehouse> list= storagehouseServiceImpl.searchExcel(str);
			CreatExcel.create(list);
		}
	}
	
	public static void doExcelJt() throws Exception{
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");				
		List<Storehouse> lt = new ArrayList<>();
		List<String> size = storagehouseServiceImpl.selectSizeByName();
		for(String str:size){
			String SbeforeSurplus="";
			String Smonth = "";
			String Sall = "";
			String Sname = "";
			String Snum = "";
			String Stype = "";
			String Sother = "";
			String Sunit = "";
			double beforeSurplus = 0;
			double month = 0;
			double all = 0;
			List<Storehouse> list= storagehouseServiceImpl.searchExcelByJt(str,GetDate.Getdate());
			for(Storehouse sh:list){
				if(sh.getSbeforeSurplus()!=null&&!sh.getSbeforeSurplus().equals("0.0")&&!"".equals(sh.getSbeforeSurplus())){
					
					beforeSurplus += Double.parseDouble(sh.getSbeforeSurplus());
				}
				if(sh.getSmonth()!=null&&!sh.getSmonth().equals("0.0")&&!"".equals(sh.getSmonth())){
					month += Double.parseDouble(sh.getSmonth());
				}
				if(sh.getSall()!=null&&!sh.getSall().equals("0.0")&&!"".equals(sh.getSall())){
					all += Double.parseDouble(sh.getSall());
				}
				 Sname = sh.getSname();
				 Snum = sh.getSnum();
				 Stype = sh.getStype();
				 Sother = sh.getSother();
				 Sunit = sh.getSunit();
			}
			Storehouse storehouse = new Storehouse();
			storehouse.setSbeforeSurplus(String.valueOf(beforeSurplus));
			storehouse.setSmonth(String.valueOf(month));
			storehouse.setSall(String.valueOf(all));
			storehouse.setSname(Sname);
			storehouse.setSnum(Snum);
			storehouse.setStype(Stype);
			storehouse.setSother(Sother);
			storehouse.setSunit(Sunit);
			lt.add(storehouse);			
		}
		CreatExcel.createjt(lt);
	}
	
	public static void createExcel(List<Storehouse> list) throws Exception{
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");				
		CreatExcel.create(list);
	}
}
