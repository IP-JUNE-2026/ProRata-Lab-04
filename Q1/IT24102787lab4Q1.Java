import java.util.Scanner;

public class IT24102787lab4Q1 {
    public static void main(String[] args) {
        scanner input = new (System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
          
        if (number > 0) {
            System.out.println("The number is Positive");
        } else if (number < 0) {
            System.out.println("The number is Negative");
        } else {
            System.out.println("The number is Zero");
        }
        
       
        scanner.close();
    }
}
