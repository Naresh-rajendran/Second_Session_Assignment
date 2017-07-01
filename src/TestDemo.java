import java.util.Scanner;
public class TestDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean status;
		Session_2_Assignment_4 read = new Session_2_Assignment_4();
		read.getMarks();
		status = read.marksValidation();
		
		/*
		 * Write a program TestDemo.java, which accepts the number as argument and print “You Have Entered Zero” if the value is equal to 0 along with the ASCII value of the number.
			It should print “You Have Entered Positive Value” if the value is greater than 0 along with the ASCII value.
			It should print “You Have Entered Negative Value” if the value is less than 0 along with the ASCII value.
			A student has A grade if marks are more than 70, B grade if marks are between 61 and 70 and C grade if marks are less than 61 ) Write a program to print the grade for
			the given marks.
			Take three subjects like PCM and calculate the average and the above grading system will work on the average.
			Take marks of the subject from the user.
		 */
		
		if(status)
		{
			read.getAverage_Grade();
		}
		else
		{
			System.out.println("You have Entered Negative marks !!!");
			System.out.println("Please run the program and give positive marks");
		}
	
	}

}

class Session_2_Assignment_4
{
	int physics_marks , chemistry_marks , maths_marks ; 
	long total = 0 , average = 0 ; 
    Scanner in = new Scanner(System.in);
	
	public void getMarks()
	{
		System.out.println("Please Enter Marks for Physics,Chemistry and Maths in respective order");
		physics_marks = in.nextInt();
		chemistry_marks = in.nextInt();
		maths_marks = in.nextInt();
	}
	
	public boolean marksValidation()
	{
		if((physics_marks < 0)||(chemistry_marks < 0)||(maths_marks < 0))
		{
			System.out.println("You have Entered Physics Mark :"+physics_marks+" ASCII Value :" +(char)physics_marks);
			System.out.println("You have Entered Physics Mark :"+chemistry_marks+" ASCII Value :" +(char)chemistry_marks);
			System.out.println("You have Entered Physics Mark :"+maths_marks+" ASCII Value :" +(char)maths_marks);
			
			return false;
		}
		else 
		{
			System.out.println("You have Entered Physics Mark : "+physics_marks+" ASCII Value : " +(char)physics_marks);
			System.out.println("You have Entered Physics Mark : "+chemistry_marks+" ASCII Value : " +(char)chemistry_marks);
			System.out.println("You have Entered Physics Mark : "+maths_marks+" ASCII Value : " +(char)maths_marks);
			
			return true;
			
		}
		
	}
	
	public void getAverage_Grade()
	{
	   total = (physics_marks + chemistry_marks + maths_marks);
	   average = total/3;
		
	   if (average > 70)
	   {
		   System.out.println("Your Average is : " +average + " you have got Grade A");
	   }
	   else if((average >= 70) && (average <= 61))
	   {
		   System.out.println("Your Average is : " +average + " you have got Grade B");
	   }
	   else if((average < 61) && (average > 0))
	   {
		   System.out.println("Your Average is : " +average + " you have got Grade C");
	   }
	   else
	   {
		   System.out.println("Your Average is : " +average + " No grade Available");
	   }
		
	}
}


/*
 * 
 Output : 
  
 Please Enter Marks for Physics,Chemistry and Maths in respective order
34
56
65
You have Entered Physics Mark : 34 ASCII Value : "
You have Entered Physics Mark : 56 ASCII Value : 8
You have Entered Physics Mark : 65 ASCII Value : A
Your Average is : 51 you have got Grade C
 * 
 * 
 */
