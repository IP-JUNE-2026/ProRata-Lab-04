import java.util.Scanner;

public class IT23692046Lab4Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Use nested ternary operators to determine if the number is Positive, Negative, or Zero
        String result = (number > 0) ? "The number is Positive." : 
                        (number < 0) ? "The number is Negative." : 
                                       "The number is Zero.";

        // Display the result
        System.out.println(result);

        scanner.close();
    }
}