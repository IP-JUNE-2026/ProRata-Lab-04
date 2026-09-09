import java.util.Scanner;

public class IT24100150Lab4Q3{
	public static void main(String[] args){
		
		int number;
		String result;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		
		result = (number > 0 )? "Positive" : (number < 0)? "Negative" : "Zero";
		
		System.out.print("The number is: " + result );
		
		System.out.println();
		
	}
}