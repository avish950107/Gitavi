package basee.java;

import java.util.HashSet;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		
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
		
		hs.add("cardiff");
		
		Iterator<String> iterator=hs.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
