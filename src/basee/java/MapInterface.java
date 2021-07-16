package basee.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapInterface {

	public static void main(String[] args) {
		
		//takes values in form of key value pair
		
		HashMap<Integer,String> hp=new HashMap<Integer, String>();
		
		hp.put(101,"UK");
		
		hp.put(102,"Australia");
		
		hp.put(103,"india");
		
		hp.put(104,"Germany");
		
		hp.put(1, null);
		
		System.out.println(hp);
		
		HashMap<String,String> hp1=new HashMap<String, String>();
		
		hp1.put("uk","huw");
		hp1.put("us","chris");
		
		System.out.println(hp1);
		
		Set sn=hp1.entrySet();
		
		Iterator it=sn.iterator();
	
		while(it.hasNext())
		{
			
	
			
			Map.Entry mp=(Map.Entry)it.next(); //separate key,values in sop.
			
			System.out.println(mp.getKey());

			System.out.println(mp.getValue());
		}
		
	}

}
