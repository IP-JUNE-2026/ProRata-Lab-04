import java.util.Scanner;

public class IT23210110Lab4Q2{
       public static void main(String[] args){
	      Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Please enter exam marks :");
		  int examMarks = sc.nextInt();
		  
		  if(examMarks<0 || examMarks>100){
		     System.out.println("Invalid input for exam marks.Terminating the program.");
			 return;
		  }
		  System.out.println("Please enter lab submission marks :");
		  int labMarks = sc.nextInt();
		  
		  if(labMarks<0 || labMarks>100){
		    System.out.println("Invalid input for lab submission marks.Terminating the program.");
			return;
			}
			
		  System.out.println("Please enter percentage given for the exam :");
		  int percExam = sc.nextInt();
		  
		  System.out.println("Please enter percentage given for the lab :");
		  int percLab = sc.nextInt();
		  
		  if(percExam + percLab != 100){
		     System.out.println("The percentage must add up to 100 :");
			 return;
		  
			 }
			 
		double finalMarks = (examMarks * percExam/100) + (labMarks * percLab/100);
		
		System.out.println("Final Mark is :"+finalMarks);
			
			  
		  
	   
	   }
	  }