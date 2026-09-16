import java.util.Scanner;
public class IT24102666Lab4Q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int numToCheck = input.nextInt();

		if (numToCheck<0) {
			System.out.println("Negative Number!");		
		} else if (numToCheck>0) {
			System.out.println("Positive Number!");
		} else {
			System.out.println("Zero");
		}
	}
}