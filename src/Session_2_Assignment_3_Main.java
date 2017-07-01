import java.util.Scanner;
public class Session_2_Assignment_3_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i = 0 , j = 0 , k = 0 , n = 0 ; 
		// Get the input from the user to determine the length of the ouput.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number of digit");
		n = sc.nextInt();
		
		int space = 1 , space1 = n-1;
		
		for (i = n ; i >= 1  ; i--)
		{
			if(i < n)
			{
				for(k=1;k<space;k++)
				{
					System.out.print("_");
					
				}
			}
			
			for (j = 1;j<=((2*i)-1); j++)
			{
			  if((j == 1) || ((j+1) > (2*i)-1))
			   {
				   System.out.print("*");
			   }
			  else 
			   {
			    System.out.print("_");
			   }
			}
			
			System.out.println("");
			space++; 
		}
		for (i = 1 ; i <= n ; i++)
		{	
			if (i > 1)
			{
				for(k=space1 ; k > 1 ;k--)
				{
				    System.out.print("_");
							
				}
				for (j = 1;j<=((2*i)-1); j++)
				{
				  if((j == 1) || ((j+1) > (2*i)-1))
				   {
					   System.out.print("*");
				   }
				  else 
				   {
				    System.out.print("_");
				   }
				 }
				
				System.out.println("");
				space1--; 
				
			}
			
		}
		sc.close();
	}
	

}


/*


Enter any number of digit
5
*_______*
_*_____*
__*___*
___*_*
____*
___*_*
__*___*
_*_____*
*_______*


*/