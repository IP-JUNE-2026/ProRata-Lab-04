import java.util.Scanner;

public class IT24100150Lab4Q1{
	public static void main(String[] args){
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		if(number > 0){
			
			System.out.print("The number is: Positive");

		}
		
		else if(number < 0){
			
			System.out.print("The number is: Negative");
		}
		
		else{
			
			System.out.print("The number is Zero");
		}
		
		System.out.println();
		
	}
}