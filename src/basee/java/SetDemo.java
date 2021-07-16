package basee.java;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		//remove duplicates
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("avish");
		hs.add("uk");
		hs.add("uk");
		hs.add("india");
		
		
		System.out.println(hs);
		
		hs.remove("avish");
		System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		
		
	}

}
