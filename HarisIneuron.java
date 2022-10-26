package javaworld;

public class HarisIneuron {

	public static void main(String[] args) {
		int i;
		int n=8;
		int j;
		
//H
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(j==3 && j<n-1/2 || i==(n-1)/2 && j>2 || j==n-1)
				{
					System.out.print("▲");
				}
				else
				{
					System.out.print(" ");
				}
				System.out.print("  ");
	//A
			}
			for(j=0;j<n;j++)
			{
				if(j==0 && i!=0 || i==0 && j>0 && j<n-1 || i== (n-1)/2 && j<=n-1 || j==n-1 && i>0 )
				{
					System.out.print("▲");
					
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.print("  ");
	//RRRRRRRRRRRRRRR
				
				
			for(j=0;j<n;j++ )
			{
				if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 ||
						i==j && i>(n-1)/2	 )
						
				{
					System.out.print("▲");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.print("  ");
			
//IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII
		
			for(j=0;j<n;j++ )
			{
				if( i==0 || i==n-1 || j==(n-1)/2)
						
				{
					System.out.print("▲");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.print("  ");
			
			/*
			 * for(j=0;j<n;j++)
			 *  { 
			 * 	 if( )
			 * 		{ 
			 * 			System.out.print("*"); 
			 * 		}
			 * 
			 *  	else 
			 *  	{ 
			 *   		System.out.print(" "); 
			 *   	} 
			 *   }
			 * 
			 * System.out.print("     ");
			 */
	//ssssssssss
			for(j=0;j<n;j++)
			{
				if(i==0 && j>0  || 
				j==0 && i<(n-1)/2 && i>0 ||
				i==(n-1)/2 && j!=n-1  && j>0||
				j==n-1 && i>(n-1)/2 && i<n-1||
				i==n-1 && j<n-1)
					
				{
					System.out.print("▲");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("       ");
	//cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc
			for(j=0;j<n;j++)
			{
				if(i==0 && j>0 && j<(3*n)/4 || j==0 && i>0 && i<n-1 || i==n-1 && j>0 &&  j<(3*n)/4)
				 
				{
					System.out.print("▲");
					
				}
				else {
					System.out.print(" ");
				}
			}
				System.out.print("");
	//.......................
				for(j=0;j<n;j++)
				{
					if( i==(n-1)/2 && j==(n-1)/2)
					 
					{
						System.out.print("●");
						
					}
					else {
						System.out.print(" ");
					}
				}
					System.out.print("   ");	
				
//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
			for(j=0;j<n;j++)
			{
				if(j==0 && i!=0 || i==0 && j>0 && j<n-1 || i== (n-1)/2 && j<=n-1 || j==n-1 && i>0)
				{
					System.out.print("▲");
					
				}
				else 
				{
					System.out.print(" ");
					
				}
			}
			System.out.println();
			
		}
		System.out.println();
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////
		for(i=0;i<n;i++)//iiiiiiiiiiiiiiiiii
		{
			for(j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2 || i==n-1)
				{
					System.out.print("▲");
					
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			for(j=0;j<n;j++)//nnnnnnnnnnnnnnnnnn
		{
			if(j==0 || i==j || j==n-1 )	
			{
				System.out.print("▲");
			}
			else
			{
				System.out.print(" ");
			}
			
			
		}
	System.out.print("  ");
			
			for(j=0;j<n;j++)//eeeeeeeeeeeeeeee
		{
			if(i==0 || i==(n-1)/2 || i==n-1 || j==0 )	
			{
				System.out.print("▲");
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
				System.out.print("▲");
			}
			else
			{
				System.out.print(" ");
			}
			
			
		}
			//rrrrrrrrrrrrr
			System.out.print("  ");
					
					for(j=0;j<n;j++)
				{
					if(j==0 && i>0 || i==0 && j>0 && j<n-1 || j==n-1 && i>0 && i<(n-1)/2 || i==(n-1)/2 && j<n-1 ||
							i-j==(n-1)/2 )	
					{ 
						System.out.print("▲");
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
						System.out.print("▲");
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
								System.out.print("▲");
							}
							else
							{
								System.out.print(" ");
							}
					
				}
			////////////////////////////////////
					
			System.out.println();

		}

			
				
			
		}
			

	}


