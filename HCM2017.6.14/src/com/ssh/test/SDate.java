package com.ssh.test;







import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

import com.ssh.util.GetDate;

public class SDate {

	@Test
	public void test() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
				System.out.println(dateFormat.format(date));
		  Calendar cal = Calendar.getInstance();
		    int day = cal.get(Calendar.DATE);
		    int month = cal.get(Calendar.MONTH) + 1;
		    int year = cal.get(Calendar.YEAR);
		    int dow = cal.get(Calendar.DAY_OF_WEEK);
		    int dom = cal.get(Calendar.DAY_OF_MONTH);
		    int doy = cal.get(Calendar.DAY_OF_YEAR);

		    System.out.println("Current Date: " + cal.getTime());
		    System.out.println("Day: " + day);
		    System.out.println("Month: " + month);
		    System.out.println("Year: " + year);
		    System.out.println("Day of Week: " + dow);
		    System.out.println("Day of Month: " + dom);
		    System.out.println("Day of Year: " + doy);
		    System.out.println(GetDate.Getdate());
		    System.out.println(GetDate.GetBefordate());
		    
		   
	}

}
