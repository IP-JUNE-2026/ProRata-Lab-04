import java.util.Scanner;
    public class IT26101614lab4Q1{
	  public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the number: ");
		int number = input.nextInt();
		
		if(number>0){
		    System.out.println("The number is: Positive ");	
		}

		else if(number<0){
			System.out.println("The number is: Negative ");
		}

		else{
			System.out.println("The number is Zero  ");
			
		}
	  }
	}	  