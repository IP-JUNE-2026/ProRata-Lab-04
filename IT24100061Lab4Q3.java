import java.util.Scanner;
public class IT24100061Lab4Q3 {
   public static void main (String[] args) {
   
      int number;
	  String result;
	  
	  Scanner value = new Scanner(System.in);
	  
	  System.out.println("Enter a number:");
	  number = value.nextInt();
	  
	  result = (number>0)?"The number is: Positive" :
	           (number<0)?"The number is: Negative":
			   "The number is : Zero";
			   
	System.out.println(result);
    }
}

	           
	  
	  
	  