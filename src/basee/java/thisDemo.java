package basee.java;
//this refers to current obj which scope lies in class level
public class thisDemo {

	int a=4;
	
	public void calC()
	{
		int a=5;
		
		System.out.println("value of a in the method: "+a);
		
		int sum=a+this.a;
		
		
		System.out.println("value of sum in the method: "+sum);
	}
	
	
	public static void main(String s[])
	{
		thisDemo td=new thisDemo();
		td.calC();
		
	}
}
