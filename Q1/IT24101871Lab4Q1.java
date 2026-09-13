import java.util.Scanner;

public class IT24101871Lab4Q1 {
	public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
		int num ;
	
	System.out.print("Enter a number : ");
	num = input.nextInt();
	
	if(num > 0) {
		System.out.print("\nThe number is: Positive");
	
	} else if (num < 0) {
		System.out.print("\nThe number is: Negative");
	
	} else if (num == 0) {
		System.out.print("\nThe number is: Zero");
	
	}
	
	
	
	
	}
}