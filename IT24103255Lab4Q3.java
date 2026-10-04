import java.util.Scanner;

public class IT2413255Lab4Q3{
 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 int  num;
	 String num1;
	 
	 System.out.print("Enter a number: ");
	 num = input.nextInt();
	 
	 num1 = (num > 0) ? "The number is: Positive" : (num < 0) ? "The number is: negative"  : "The number is: 0" ;
	 
	 System.out.println(num1);
	
 
 
 
 }
 }