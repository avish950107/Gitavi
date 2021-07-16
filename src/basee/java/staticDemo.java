package basee.java;

public class staticDemo {
	
	String name; //instance variables
	String address;//instance variables
	static String city="Hyderabad";//instance variables ->this var copy is shared by all the objects 
	
	staticDemo(String a,String b)
	{
		this.name=a;
		this.address=b;
	}

	public void getAddress()
	{
		System.out.println(address+" "+city); 
	}
	public static void main(String[] args) {
		staticDemo sd=new staticDemo("Avish","x block");

		staticDemo sd1=new staticDemo("ram","y block");
		
		sd.getAddress();
		
		sd1.getAddress();
	}

}
