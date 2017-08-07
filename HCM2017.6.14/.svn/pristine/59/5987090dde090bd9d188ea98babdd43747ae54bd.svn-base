package com.ssh.util;

import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ssh.service.impl.UserServiceImpl;

public class TimerManager {

	
	//时间间隔
	 private static final long PERIOD_DAY = 24 * 60 * 60 * 1000;
	 BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	 UserServiceImpl userServiceImpl = (UserServiceImpl) factory.getBean("userServiceImpl");
	 public TimerManager() {
	  Calendar calendar = Calendar.getInstance();  
	  String month = userServiceImpl.Time().getTmonth();
	  String day = userServiceImpl.Time().getTday();
	  String hour = userServiceImpl.Time().getThour();
	  String minute = userServiceImpl.Time().getTminute();
	  String second = userServiceImpl.Time().getTsecond();
	  System.out.println("month:"+month+"  day:"+day+"   hour:"+hour+"  minute:"+minute+"   second:"+second);
	  /*** 定制每日2:00执行方法 ***/ 
	  calendar.set(Calendar.DAY_OF_MONTH, Integer.valueOf(day));
	  calendar.set(Calendar.HOUR_OF_DAY, Integer.valueOf(hour));
	  calendar.set(Calendar.MINUTE, Integer.valueOf(minute));
	  calendar.set(Calendar.SECOND, Integer.valueOf(second));
	  
	  Date date=calendar.getTime(); //第一次执行定时任务的时间
	  
	  //如果第一次执行定时任务的时间 小于 当前的时间
	  //此时要在 第一次执行定时任务的时间 加一天，以便此任务在下个时间点执行。如果不加一天，任务会立即执行。循环执行的周期则以当前时间为准
	  if (date.before(new Date())) {
	      date = this.addDay(date, 0);
	  }
	  
	  Timer timer = new Timer();
	  
	  NFDFlightDataTimerTask task = new NFDFlightDataTimerTask();
	  //安排指定的任务在指定的时间开始进行重复的固定延迟执行。
	  timer.schedule(task,date,PERIOD_DAY);
	 }

	 // 增加或减少天数
	 public Date addDay(Date date, int num) {
	  Calendar startDT = Calendar.getInstance();
	  startDT.setTime(date);
	  startDT.add(Calendar.DAY_OF_MONTH, num);
	  return startDT.getTime();
	 }
}
