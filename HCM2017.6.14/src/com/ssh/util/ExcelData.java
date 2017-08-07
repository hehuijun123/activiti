package com.ssh.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Excel;
import com.ssh.entity.HazardousChemicals;
import com.ssh.entity.Manager;
import com.ssh.entity.Storehouse;
import com.ssh.entity.TExcel;
import com.ssh.service.impl.HazardousChemicalsServiceImpl;
import com.ssh.service.impl.ManagerServiceImpl;
import com.ssh.service.impl.StoragehouseServiceImpl;

public class ExcelData {
	BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	HazardousChemicalsServiceImpl hazardousChemicalsServiceImpl = (HazardousChemicalsServiceImpl) factory.getBean("hazardousChemicalsServiceImpl");	
	StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");		

	List<HazardousChemicals> list = hazardousChemicalsServiceImpl.searchs();
	public  void createJt() throws Exception{
		List<Excel> listExcel = new ArrayList<Excel>();
		for(HazardousChemicals hazardousChemicals:list){
			Excel excel = new Excel();
			excel.setEcode(hazardousChemicals.getHnum());
			excel.setEtype(hazardousChemicals.getHtype());
			excel.setEname(hazardousChemicals.getName());
			excel.setEunit(hazardousChemicals.getHunit());
			excel.setEother(hazardousChemicals.getHmethod());
			List<Storehouse> lists = storagehouseServiceImpl.searchExcelByJt(hazardousChemicals.getName(),GetDate.Getdate());//根据危化物名称，月份，查询危化物
			double beforeSurplus = 0;
			double month = 0;
			double all = 0;
			for(Storehouse sh:lists){
				if(sh.getSbeforeSurplus()!=null&&!"0".equals(sh.getSbeforeSurplus())&&!"".equals(sh.getSbeforeSurplus())){
					
					beforeSurplus += Double.parseDouble(sh.getSbeforeSurplus());
				}
				if(sh.getSmonth()!=null&&!"0".equals(sh.getSmonth())&&!"".equals(sh.getSmonth())){
					month += Double.parseDouble(sh.getSmonth());
				}
				if(sh.getSall()!=null&&!"0".equals(sh.getSall())&&!"".equals(sh.getSall())){
					all += Double.parseDouble(sh.getSall());
				}else{
					excel.setEother(" ");
					excel.setEunit(" ");
				}
			}
			excel.setEbsurplus(String.valueOf(beforeSurplus));
			excel.setEpurchase(String.valueOf(month));
			excel.setEtsurplus(String.valueOf(all));
			listExcel.add(excel);
			}
		create(listExcel);
	}
	
	public static void createSc() throws Exception{
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");				
		HazardousChemicalsServiceImpl hazardousChemicalsServiceImpl = (HazardousChemicalsServiceImpl) factory.getBean("hazardousChemicalsServiceImpl");	
		ManagerServiceImpl managerServiceImpl = (ManagerServiceImpl) factory.getBean("managerServiceImpl");	

		List<HazardousChemicals> listh = hazardousChemicalsServiceImpl.searchs();

		List<String> size = storagehouseServiceImpl.selectSize();
		
		
		for(String str:size){
			Manager manager = managerServiceImpl.select(str);
			List<Excel> listExcel = new ArrayList<Excel>();
			for(HazardousChemicals hazardousChemicals:listh){
				Excel excel = new Excel();
				excel.setEcode(hazardousChemicals.getHnum());
				excel.setEtype(hazardousChemicals.getHtype());
				excel.setEname(hazardousChemicals.getName());	
				excel.setEunit(hazardousChemicals.getHunit());
				excel.setEother(hazardousChemicals.getHmethod());
				List<Storehouse> lists = storagehouseServiceImpl.searchExcel(str);//根据危化物名称，月份，查询危化物
				for(Storehouse sh:lists){
					if(excel.getEcode().equals(sh.getSnum())){
						
						if(sh.getSall()!=null&&!sh.getSall().equals("0")){
							excel.setEbsurplus(sh.getSbeforeSurplus());
							excel.setEpurchase(String.valueOf(sh.getSmonth()));
							excel.setEtsurplus(String.valueOf(sh.getSall()));
						}else{
							excel.setEother(" ");
							excel.setEunit(" ");
						}
							
							
							
					}/*else{
						excel.setEunit(" ");
						excel.setEother(" ");
					}	*/
				}
				listExcel.add(excel);
				}
			createSc(listExcel,manager);
		}
		
		
	}
	
	
	public static void create(List<Excel> list) throws Exception {		
		try {
			Map<String, List<Excel>> map = new HashMap();
			TExcel ty = new TExcel();	
			for(int i = 0;i<list.size();i++){
				Excel excel = list.get(i);			
				String  type = excel.getEtype();
				String  junit = excel.getEunit();
				String month="";
				String all="";
				String befor="";
				if(excel.getEpurchase()!=null&&!"0.0".equals(excel.getEpurchase())&&!"".equals(excel.getEpurchase())){
					  month = excel.getEpurchase()+junit;
				}else{
					month = "  ";
				}
				if(excel.getEtsurplus()!=null&&!"0.0".equals(excel.getEtsurplus())&&!"".equals(excel.getEtsurplus())){
					  all = excel.getEtsurplus()+junit;		
				}else{
					all = "  ";
					excel.setEother("");
				}
				if(excel.getEbsurplus()!=null&&!"0.0".equals(excel.getEbsurplus())&&!"".equals(excel.getEbsurplus())){
					  befor = excel.getEbsurplus()+junit;
				}else{
					befor = "  ";
				}
				excel.setEbsurplus(befor);
				excel.setEpurchase(month);
				excel.setEtsurplus(all);			
				if(type.equals("压缩气体和液化气体")){
					(ty.getListGas()).add(excel);
				}
				if(type.equals("易燃液体")){
					(ty.getListwater()).add(excel);
				}
				if(type.equals("易燃固体")){
					(ty.getListstone()).add(excel);
				}
				if(type.equals("氧化剂")){
					(ty.getListO2()).add(excel);
				}
				if(type.equals("毒害品")){
					(ty.getListPoison()).add(excel);
				}
				if(type.equals("放射性物品")){
					(ty.getListEmit()).add(excel);
				}
				if(type.equals("腐蚀品")){
					(ty.getListCorrosion()).add(excel);
				}
				if(type.equals("爆炸品")){
					(ty.getListboom()).add(excel);
				}
			}
			map.put("1", ty.getListboom());
			map.put("2", ty.getListGas());
			map.put("3", ty.getListwater());
			map.put("4", ty.getListstone());
			map.put("5", ty.getListO2());
			map.put("6", ty.getListPoison());
			map.put("7", ty.getListEmit());
			map.put("8", ty.getListCorrosion());	
			JxlExcelCreate.writeExcelJT(map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void createSc(List<Excel> list,Manager manager) throws Exception {		
		try {
			Map<String, List<Excel>> map = new HashMap();
			TExcel ty = new TExcel();	
			for(int i = 0;i<list.size();i++){
				Excel excel = list.get(i);	
				String  type = "";
				type = excel.getEtype();
				String  junit = excel.getEunit();
				String month="";
				String all="";
				String befor="";
				if(excel.getEpurchase()!=null&&!"0".equals(excel.getEpurchase())&&!"".equals(excel.getEpurchase())){
					  month = excel.getEpurchase()+junit;
				}else{
					month = "  ";
				}
				if(excel.getEtsurplus()!=null&&!"0".equals(excel.getEtsurplus())&&!"".equals(excel.getEtsurplus())){
					  all = excel.getEtsurplus()+junit;		
				}else{
					all = "  ";
					excel.setEother("");
				}
				if(excel.getEbsurplus()!=null&&!"0".equals(excel.getEbsurplus())&&!"".equals(excel.getEbsurplus())){
					  befor = excel.getEbsurplus()+junit;
				}else{
					befor = "  ";
				}
				excel.setEbsurplus(befor);
				excel.setEpurchase(month);
				excel.setEtsurplus(all);			
				if(type.equals("压缩气体和液化气体")){
					(ty.getListGas()).add(excel);
				}
				if(type.equals("易燃液体")){
					(ty.getListwater()).add(excel);
				}
				if(type.equals("易燃固体")){
					(ty.getListstone()).add(excel);
				}
				if(type.equals("氧化剂")){
					(ty.getListO2()).add(excel);
				}
				if(type.equals("毒害品")){
					(ty.getListPoison()).add(excel);
				}
				if(type.equals("放射性物品")){
					(ty.getListEmit()).add(excel);
				}
				if(type.equals("腐蚀品")){
					(ty.getListCorrosion()).add(excel);
				}
				if(type.equals("爆炸品")){
					(ty.getListboom()).add(excel);
				}
			}
			map.put("1", ty.getListboom());
			map.put("2", ty.getListGas());
			map.put("3", ty.getListwater());
			map.put("4", ty.getListstone());
			map.put("5", ty.getListO2());
			map.put("6", ty.getListPoison());
			map.put("7", ty.getListEmit());
			map.put("8", ty.getListCorrosion());	
			JxlExcelCreate.writeExcelSc(map,manager);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
