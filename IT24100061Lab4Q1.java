import java.util.Scanner ;
  public class IT24100061Lab4Q1 {
      public static void main (String[] args) {
	  
	    int num1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		num1 = input.nextInt();
		
		if(num1>0){
		 System.out.println("The number is: Positive");
		 }
		else if(num1<0){
         System.out.println("The number is Negative");
		 }
		else {
         System.out.println("The number is Zero");
		 }
		 
		}
	}
	