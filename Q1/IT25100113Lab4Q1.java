import java.util.Scanner;

public class IT25100113Lab4Q1 {
    public static void main(String[] args) {
        Scanner sys = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sys.nextInt();
        
        if (n > 0) {
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}