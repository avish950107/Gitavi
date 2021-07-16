package basee.java;
//how obj shares the same var 
public class staticVar {
	static int i; //class level variables also object independent

	int j=0;
	
	static
	{
		i=0;
	}
	staticVar()
	{
		i++;
		j++;
		System.out.println("value of i "+i);
		System.out.println("value of j "+j);
		
	}
	public static void main(String[] args) {

		staticVar sV=new staticVar();
		
		staticVar sV1=new staticVar();
		
		System.out.println(staticVar.i);
		
	}

}
