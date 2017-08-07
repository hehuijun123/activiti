package com.ssh.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GetDate {
	
	static Calendar cal = Calendar.getInstance();
	public static String GetDay(){
		 int day = cal.get(Calendar.DATE);
		 String Sday = Integer.toString(day);
		 return Sday;
	}
	public static String GetMonth(){
	    int month = cal.get(Calendar.MONTH) + 1;
	    String Smonth = Integer.toString(month);
		return Smonth;
	}
	public static String GetYear(){
	    int year = cal.get(Calendar.YEAR);
	    String Syear = Integer.toString(year);
		return Syear;
	}
	public static String Getdate(){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月");
		Date date = new Date();
		String dd = dateFormat.format(date);
		return dd;
	}
	public static String Formatdate(String date){
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月");
		Date dates = new Date();
		String dd = dateFormat.format(date);
		System.out.println("-=-=-="+dates);
		return dd;
	}
	public static String GetBefordate(){
		/*SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
		Date date = new Date();*/

		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -1);
		SimpleDateFormat dateFormat =  new SimpleDateFormat("yyyy年MM月");
		String time = dateFormat.format(c.getTime());
		return time;
	}
	public static String GetMinute() {
         Calendar calendar=null;
         calendar =new GregorianCalendar();//子类实例化
         String Minute = Integer.toString(calendar.get(Calendar.MILLISECOND));
		return Minute;
	}

  
}
