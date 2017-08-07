package com.ssh.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssh.entity.Storehouse;
import com.ssh.entity.Ty;

/**
 * 封装excel需要的数据类型
 * @author Administrator
 *
 */
public class PackageExcel {
	public static  void method(List<Storehouse> list) throws Exception{
		Ty ty = new Ty();	
		Map<String, List<Storehouse>> map = new HashMap();
		for(int i = 0;i<list.size();i++){
			Storehouse storehouse = list.get(i);			
			String  type = storehouse.getStype();
			String  junit = storehouse.getSunit();
			String month="";
			String all="";
			String befor="";
			if(!storehouse.getSmonth().equals("0")){
				  month = storehouse.getSmonth()+junit;
			}else{
				month = "0";
			}
			if(!storehouse.getSall().equals("0")){
				  all = storehouse.getSall()+junit;		
			}else{
				all = "0";
			}
			if(!storehouse.getSbeforeSurplus().equals("0")){
				  befor = storehouse.getSbeforeSurplus()+junit;
			}else{
				befor = "0";
			}
			storehouse.setSbeforeSurplus(befor);
			storehouse.setSmonth(month);
			storehouse.setSall(all);			
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

	}
	
}
