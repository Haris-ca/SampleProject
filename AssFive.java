package javaworld;

public class AssFive 
{
	public static void main(String args[])
	{
		int i,j;
		int n=16;
		
		for(i=0;i<n;i++)
		{	//Assignment 5ac
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
			System.out.print("      ");
			//4ASSIGN
			for(j=0;j<n;j++)//p4i+j==n-2 +((n-1)/2))
			{
				if( i==(n-1) && j<n/2 || j==0 && i>(n-1)/2 || i-j>=(n-1)/2 || i==(n-1) && j>n/2 || j==n-1 && i>(n-1)/2 || i+j>=n-1 +((n-1)/2)) 
						 
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.print("  ");
			// 3Assignment
			for(j=0;j<n;j++)//p4i+j==n-2 +((n-1)/2))
			{
				if( i==0 || j==0 || i==n-1 || j==n-1 || i+j<=(n-1)/2 || j-i>(n-1)/2) 
						 
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
