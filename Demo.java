package javaworld;

public class Demo 
{
	public static void main(String args[])
	{
		int i,j;
		int n=14;
		
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)//p4i+j==n-2 +((n-1)/2))
			{
				if(i+j<=(n-1)/2 ||
				i-j>=(n-1)/2 ||
						i==0  || j==0 || i==n-1
						) 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
