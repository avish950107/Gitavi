package basee.java;

public class MultiDimensional {
	
	public static void main(String s[])
	{
		int a[][]=new int[2][3]; 
		
		a[0][0]=50;              /*
								min point to 5 
		                    		5 2 8
		                    		1 0 -1 */
		a[0][1]=25;
		
		a[0][2]=8;
		
		a[1][0]=17;
		
		a[1][1]=12;
		
		a[1][2]=11;
		
		
		int min=a[0][0];
		int mincol = 0;

		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
	
				if(a[i][j]<min)  //2<5
				{
					min=a[i][j];//25->8->final->8
					mincol=j;
					//
				}
			}
		}
		
		System.out.println(min);
		int max=a[0][mincol];
		int k=0;
		while(k<2)
		{
			if(a[k][mincol]>max)
			{
				max=a[k][mincol];
			}
			k++;
		}
		System.out.println(max);
	}
}
