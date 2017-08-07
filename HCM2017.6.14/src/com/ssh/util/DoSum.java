package com.ssh.util;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.entity.Storehouse;
import com.ssh.service.impl.StoragehouseServiceImpl;

/**
 * 求和 
 * @author Administrator
 *
 */

public class DoSum {
	public static List<Storehouse> sum(List<Storehouse> size){
		BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
		StoragehouseServiceImpl storagehouseServiceImpl = (StoragehouseServiceImpl) factory.getBean("storagehouseServiceImpl");				
		List<Storehouse> lt = new ArrayList<Storehouse>();
		List<String> ll = new ArrayList<>();
		//List<String> size = storagehouseServiceImpl.selectSizeByName();
		/*for(Storehouse ss:size){
			ll.add(ss.getSname());
			
		}
		HashSet h = new HashSet(ll);   
		ll.clear();   
		ll.addAll(h);   
		Iterator<String> iterator = h.iterator();//创建iterator对象
		while(iterator.hasNext()){//用while循环，判断是否有下一个
			String string=iterator.next();//转换为String类型
			System.out.println(string);
		}//打印
*/		for(int i = 0;i<size.size();i++){
			Storehouse sh = size.get(i);
			String SbeforeSurplus=sh.getSbeforeSurplus();
			String Smonth = sh.getSmonth();
			String Sall = sh.getSall();
			double beforeSurplus = 0;
			double month = 0;
			double all = 0;
			if(SbeforeSurplus!=null&&!"0".equals(SbeforeSurplus)&&!"".equals(SbeforeSurplus)){
				beforeSurplus =Double.parseDouble(SbeforeSurplus);
			}
			if(Smonth!=null&&!"0".equals(sh.getSmonth())&&!"".equals(sh.getSmonth())){
				System.out.println(Smonth+":name"+sh.getSc());
				month = Double.parseDouble(Smonth);
			}
			if(Sall!=null&&!"0".equals(Sall)&&!"".equals(Sall)){
				all = Double.parseDouble(Sall);
			}
			
			for(int j = size.size()-1;j>i;j--){
				Storehouse ssh = size.get(j);
				if(sh.getSname().equals(ssh.getSname())
						&&sh.getSother().equals(ssh.getSother())
						&&sh.getSdate().equals(ssh.getSdate())){							
						if(ssh.getSbeforeSurplus()!=null&&!ssh.getSbeforeSurplus().equals("0")&&!"".equals(ssh.getSbeforeSurplus())){
							//System.out.println("Sname:"+ssh.getSname()+"----beforeSurplus:"+beforeSurplus);
								beforeSurplus += Double.parseDouble(ssh.getSbeforeSurplus());
								//System.out.println("Sname:"+ssh.getSname()+"+++++beforeSurplus:"+beforeSurplus+"-Double.parseDouble(ssh.getSbeforeSurplus()):"+Double.parseDouble(ssh.getSbeforeSurplus()));
						}
						if(ssh.getSmonth()!=null&&!ssh.getSmonth().equals("0")&&!"".equals(ssh.getSmonth())){
							month += Double.parseDouble(ssh.getSmonth());
						}
						if(ssh.getSall()!=null&&!ssh.getSall().equals("0")&&!"".equals(ssh.getSall())){
							all += Double.parseDouble(ssh.getSall());
						}		
						
						size.remove(j);			
				}
				
			}
			sh.setSbeforeSurplus_(String.valueOf(formatDouble4(beforeSurplus)));
			sh.setSmonth_(String.valueOf(formatDouble4(month)));
			sh.setSall_(String.valueOf(formatDouble4(all)));
		}
		/*for(Storehouse sp:size){
			System.out.println("Sname:"+sp.getSname()+"   SbeforeSurplus:"+sp.getSbeforeSurplus()+"   Smonth:"+sp.getSmonth()+"   Sall:"+sp.getSall());
		
		}*/
		return size;
		
	}
	
	public static String formatDouble4(double d) {
        DecimalFormat df = new DecimalFormat("#.00");

        
        return df.format(d);
    }
	
	
}
