package basee.java;

import java.util.ArrayList;

public class PrintUniqueNumber {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,4,7,5,6};
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0; //reset for every loop
			if(!al.contains(a[i])) //negation of false true
			{
				al.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					
					if(a[i]==a[j])
					{
						k++;
					}
					
				}
				
				System.out.println("numbers we are getting	:"+a[i]);
				System.out.println("number is repeating		:"+k);
				
				
				if(k==1)
				{
					System.out.println("Unique number is :"+a[i]);
				}
			}
			
		}
		
	}

}
