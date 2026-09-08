import java.util.Scanner;
public class IT23267640Lab4Q2{
	public static void main(String[] args){
		double examMarks, labsMarks, examPercentage, LabPercentage, totalExamMarks;
		Scanner input= new Scanner(System.in);
		System.out.print("Please enter exam marks (out of 100): ");
		examMarks=input.nextDouble();
		
		if (examMarks<0 || examMarks>100)
		{
			System.out.println("Invalid input for exam mark. Terminating program.");
			input.close();
			return;
		}
		System.out.print("Please enter lab submission mark (out of 100): ");
		labsMarks=input.nextDouble();
		
		if (examMarks<0 || examMarks>100)
		{
			System.out.println("Invalid input for lab submission marks. Terminating program.");
			input.close();
			return;
		}
		System.out.print("Please enter the percenrage given for the exam: ");
		examPercentage=input.nextDouble();
		
		System.out.print("Please enter the persentage given for the lab submission ");
		LabPercentage=input.nextDouble();
		
		if ((examPercentage+LabPercentage) !=100)
		{
			System.out.println("The percenrage must add up to 100. Terminating program.");
			input.close();
			return;
		}
		totalExamMarks=(examMarks*(examPercentage/100.0)) + (labsMarks*(LabPercentage/100.0));
		System.out.println();
		System.out.println("final exam mark is: " + totalExamMarks);
		
	
	}
	
}
