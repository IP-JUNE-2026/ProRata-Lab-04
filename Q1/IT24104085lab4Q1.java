import java.util.Scanner;
 
public class IT24104085lab4Q1 {

      public static void main(String[] args) {
  
      Scanner Input= new Scanner(System.in);
     
      int number;
     
      System.out.print("Enter a number: ");
      number= Input.nextInt();
    
      if(number > 1) {
              System.out.println("The number is: Positive");
      }
      if(number < 0) {
              System.out.println("The number is: Negative");
      }
      if(number == 0) {
              System.out.println("The number is: Zero");

      }

      }
}