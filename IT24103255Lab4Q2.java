import java.util.Scanner;

public class IT24103255Lab4Q2{
 public static void main(String[] args){
	 
	 Scanner input = new Scanner(System.in);
	 double exammarks,labsubmissionmarks,perexammarks,perlabsubmissionmarks,FinalExamMarks,totalpercentage;
	 
	 System.out.print("Please enter exam marks ( out of 100): ");
	 exammarks = input.nextDouble();
	 
	 if (exammarks < 0 || exammarks > 100)
	 {
		 System.out.println("Invalid input for exam marks. Terminating Program.");
		 return;
	 }
	 
	 System.out.print("Please enter lab submission marks ( out of 100): ");
	 labsubmissionmarks = input.nextDouble();
	 
	 if (labsubmissionmarks < 0 || labsubmissionmarks >= 100)
	 {
		System.out.println("Invalid input for exam marks. Terminating Program.");
		return;
	 }
	 
	 
	 System.out.print("Please enter the percentage given for the exam: ");
	 perexammarks = input.nextDouble();
	 
	 System.out.print("Please enter the percentage given for the exam: ");
	 perlabsubmissionmarks = input.nextDouble();
	 
	 totalpercentage = perexammarks + perlabsubmissionmarks;
	 
	 if (totalpercentage != 100)
	 {
		 System.out.println("The percentage must add up to 100. Terminating program");
		 return;
	 }
	 
	 FinalExamMarks = (exammarks*perexammarks/100) + (labsubmissionmarks*perlabsubmissionmarks/100);
	 System.out.println("");
	 System.out.println("Final Exam Marks is :" + FinalExamMarks);
 
 
 
 }
 }
