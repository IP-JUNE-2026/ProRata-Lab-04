import java.util.Scanner;

public class IT26101614Lab4Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        String result = (number == 0) ? "Zero" : (number > 0) ? "Positive" : "Negative";

        System.out.println("The number is: " + result);

       
    }
}