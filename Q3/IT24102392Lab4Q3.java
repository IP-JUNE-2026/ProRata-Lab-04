import java.util.Scanner;

public class IT24102392Lab4Q3
{
	public static void main (String[]args)
	{
		// create a scanner object as a takeinput
		Scanner takeinput= new Scanner(System.in);
		
		//declare variables
		int number;
		
		//take user input
		System.out.print("Enter a number :");
		number = takeinput.nextInt();
		
		String result = (number > 0) ? "Positive" :
		                (number < 0) ? "Negative" : 
		                "Zero";

        System.out.println("The number is: " + result);
        
	}
}	


