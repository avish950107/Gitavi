package basee.java;

public class constructorDemo {

		public constructorDemo()
		{
			
			System.out.println("default");
		}
		public constructorDemo(int a,int b)
		{
			
			System.out.println(a+b);
		}
		
		public constructorDemo(String name)
		{
			
			System.out.println(name);
		}
		
		public static void main(String s[])
		{
			constructorDemo cd=new constructorDemo(); //without calling using cd constructor called
			
			constructorDemo cdp=new constructorDemo(5,8);
			
			constructorDemo cds=new constructorDemo("h4ello");
			
		}
	

}
