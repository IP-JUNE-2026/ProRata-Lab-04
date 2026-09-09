import java.util.Scanner;

public class IT24100150Lab4Q2{
	public static void main(String[] args){
		
		double examMarks;
		double labSubmissionMarks;
		double percentageExamMarks;
		double percentageLabSubmission;
		double finalExamMark;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter exam marks(out of 100): ");
		examMarks = scanner.nextDouble();
		
		if(examMarks < 0 || examMarks > 100){
			
			System.out.print("Invalid input for exam marks. Terminating program.");
			return;
			
		}
		
		System.out.print("Please enter lab submission marks(out of 100): ");
		labSubmissionMarks = scanner.nextDouble();
		
		if(labSubmissionMarks < 0 || labSubmissionMarks > 100){
			
			System.out.print("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		System.out.print("Please enter the percentage given from the exam: ");
		percentageExamMarks = scanner.nextDouble();
		

		System.out.print("Please enter the percentage given from the lab submission: ");
		percentageLabSubmission = scanner.nextDouble();
		
		if (percentageExamMarks + percentageLabSubmission != 100) { 
			System.out.println("The percentages must add up to 100. Terminating program."); 
			return;
		}
		
		System.out.println();
		
		finalExamMark = (examMarks * percentageExamMarks/100 ) + (labSubmissionMarks * percentageLabSubmission/100 );
		
		System.out.print("Final Exam Mark is: " + finalExamMark);
		
	}

}