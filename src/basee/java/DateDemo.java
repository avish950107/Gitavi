package basee.java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
 
	public static void main(String s[])
	{
		
		Date d=new Date();
		// print current date time   toString()->Converts this Date object to a Stringof the form: o/p->Thu Jun 03 23:53:57 IST 2021
		System.out.println(d.toString());
		
		SimpleDateFormat sd=new SimpleDateFormat("M/d/yyyy");
		
		System.out.println(sd.format(d));
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		
		System.out.println(sdf.format(d));
		
	}
}
