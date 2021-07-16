package basee.java;

public class ArrayDeclare {

	public static void main(String[] args) {
	
		int arr[]= {1,2,3,4,5};
		String name[]= {"test","test1","test2","test3"};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
		}
		
		for(int j=0;j<name.length;j++)
		{
			System.out.println(name[j]);
		}
		
		int boys[]=new int[6];
		
		boys[0]=1;
		boys[2]=2;
		
		for(int m=0;m<boys.length;m++)
		{
			System.out.println(boys[m]);
		}
		
		
	}

}
