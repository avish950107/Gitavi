package basee.java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class calendarDemo {

	public static void main(String s[])
	{
		
		Calendar cal=Calendar.getInstance();
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(cal.getTime()));
		
		
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		
		System.out.println(cal.get(Calendar.AM_PM));
		
		
	}
	
	
	
}
