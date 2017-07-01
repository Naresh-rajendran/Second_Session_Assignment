import java.util.Scanner;
public class Session_2_Assignment_1_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		//Write a program to find the highest among the given 3 numbers.
		int number_1 = 0, number_2 = 0  , number_3 = 0 , a = 0;
		//Get three numbers as input from the User 
		System.out.println("Enter the Three Numbers");
		number_1 = inp.nextInt();
		number_2 = inp.nextInt();
		number_3 = inp.nextInt();
		
		//Compare between three numbers 
		
			if((number_1 > number_2)&&(number_1 > number_3))
			{
					System.out.println("Number " + number_1 + " is Highest Number" );		
			}
			else if((number_2 > number_3)&&(number_2 > number_1)) 
			{
				
					System.out.println("Number " + number_2 + " is Highest Number" );
			}
			else if((number_3 > number_1) && (number_3 > number_2))
			{	
					System.out.println("Number " + number_3 + " is Highest Number" );
			}
			else 
			{
				System.out.println("Number are not distinct");
			}

		
		inp.close();
		}

}

/*
Ouput : 
Enter the Three Numbers
5
2
8
Number 8 is Highest Number
 */
