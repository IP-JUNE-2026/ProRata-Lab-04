import java.util.Scanner;
public class IT25101713Lab4Q1{
	public static void main (String[] args){
		
		Scanner input=new Scanner(System.in);
		
		int number;
		
		System.out.println("Enter a number:");
		
		number=input.nextInt();
		
		if(number>0){
			System.out.println("The number is : positive");
		}
		
		else if(number<0){
			System.out.println("The number is : negative");
		}
		else if (number==0){
			System.out.println("The number is Zero");
		}
		else{
		}
		
	}
	
}
		