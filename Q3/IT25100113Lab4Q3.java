import java.util.Scanner;

public class IT25100113Lab4Q3{
	public static void main(String [] args){
		
		Scanner myfile = new Scanner (System.in);
			
		System.out.print("Enter the number: ");
		int number = myfile.nextInt();
		
			String num = (number == 0)? "zero":
						 (number > 0)? "Positive":"Negetive";

			System.out.println("Number is " + num);
	}
}