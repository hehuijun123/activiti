package com.ssh.util;

import java.util.TimerTask;

import org.apache.log4j.Logger;

public class NFDFlightDataTimerTask extends TimerTask {

	 private static Logger log = Logger.getLogger(NFDFlightDataTimerTask.class);

	 @Override
	 public void run() {
	  try {
	   //在这里写你要执行的内容
		  System.out.println("========================================================");
		 ExcelData excelData = new ExcelData();
			excelData.createSc();
			excelData.createJt();
			/*CreatExcel.doExcel();
			CreatExcel.doExcelJt();*/
			
	  } catch (Exception e) {
	   log.info("-------------解析信息发生异常--------------");
	  }
	 }
	}