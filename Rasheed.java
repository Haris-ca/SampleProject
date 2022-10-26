package javaworld;

public class Rasheed {

	public static void main(String[] args) {
		int i;
		int j;
		int n=10;
		
		System.out.println("💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥\n\n");
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2 || i==n-1)
				{
					System.out.print("*");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(j=0;j<n;j++)
		{
			if(j==0 || i==j || j==n-1 )	
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			
		}
	System.out.print("  ");
			
			for(j=0;j<n;j++)
		{
			if(i==0 || i==(n-1)/2 || i==n-1 || j==0 )	
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			
		}
		//uuuuuuuuuuuuuuuuuu
	System.out.print("  ");
			
			for(j=0;j<n;j++)
		{
			if(j==0 && i>0 && i<n-1 || i==n-1 && j>0 && j<n-1  || j==n-1 && i>0 )	
			{ 
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
			}
			
			
		}
			//
			System.out.print("  ");
					
					for(j=0;j<n;j++)
				{
					if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 ||
							i-j==(n-1)/2 )	
					{ 
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
				}
					//ooooooooooooo
						System.out.print("  ");
					
					for(j=0;j<n;j++)
					{
							if(i==0 && j>0 && j<n-1 ||
									j==0 && i>0 && i<n-1 ||
									i==n-1 && j>0 && j<n-1 ||
									j==n-1 && i>0 && i<n-1 )	
									 		
					{ 
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					}	
							System.out.print("  ");
							//NNNNNNNNNNNNNNNNNNNNNNNNNNN
							for(j=0;j<n;j++)
						{
							if(j==0 || i==j || j==n-1 )	
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
					
				}
		
		
			////////////////////////////////////
					
			System.out.println();

		}
		System.out.println("\n\n\n💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥💥\n\n");
	}

} 
