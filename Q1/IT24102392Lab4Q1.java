import java.util.Scanner;
public class IT24102392Lab4Q1
{
	public static void main (String [] args)
	{
		Scanner input=new Scanner(System.in);
		
		   float number;
		   
		   System.out.print("Enter a number :");
     	   number=input.nextFloat();
		   
		   
		   if(number > 0)
		   {
			System.out.println("The number is: possitive");   
		   }
		   else if(number < 0)
		   {
			System.out.println("The number is : Negative");
		   }
		  else 
		   {
            System.out.println ("The number is Zero");
		   }
	}
}	
	
	