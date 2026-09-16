import java.util.Scanner;
public class IT24102666Lab4Q3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a Number: ");
		int numToCheck = input.nextInt();

		String result = (numToCheck > 0) ? "This Number is Positive" :
						(numToCheck < 0) ? "This Number is Negative" :
						"This is Zero!!" ;

		System.out.println(result);
								
	}
}