import java.util.Scanner;
public class IT25101713Lab4Q3{
	public static void main (String[] args){
		
		Scanner input=new Scanner(System.in);
		
		int number;
		String message;
		
		System.out.println("Enter a number : ");
		number=input.nextInt();
		
		message=(number==0)?"The number is zero":(number<0)?"The number is negative":"postive";
		
		System.out.println(message);
		
	}
}

		