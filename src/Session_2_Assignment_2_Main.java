
public class Session_2_Assignment_2_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,number = 3,j,k,l; 
		int space = number ;
		int space1 = 1 ;
		 
		/*
		 * Write a program to print the following pattern:
				  a
				a b a
			  a b c b a
                a b a
                  a
		 */
		for (i=1; i<=number;i++)
		{		
			l=96;
			for(j=1 ; j<=((2*i)-1) ; j++)
			{
				if(j==1)
				{
					for(k = 1 ; k < space ; k++)
					{
					System.out.print(" ");
					}
					
				}
					if(((2*j)-1)<= ((2*i)-1))
						{
						++l;
						System.out.print((char)+l);
						
					 	}
					else
						{
						--l;
						System.out.print((char)+l);
					
						}
			}
				
			System.out.println("");
			space--;
		}
		
		
		for (i=number-1;i >= 1;i--)
		{
			l=96;
		     for(j=1;j<=((2*i)-1);j++)
		     {
		    	 if(j==1)
		    	 {	
		    	 	 for(k = 1 ; k <= space1 ; k++)
		    		 {
		    			 System.out.print(" ");
		    		 }
		    	 	 
		    	 }
		    	 
		    	 if(((2*j)-1)<= ((2*i)-1))
					{
					++l;
					System.out.print((char)+l);
					
				 	}
				else
					{
					--l;
					System.out.print((char)+l);
				
					}
		     }
		     
		     System.out.println("");
			 space1++;
		}
	}
}

/*
 Output : 
  a
 aba
abcba
 aba
  a
 
 */

