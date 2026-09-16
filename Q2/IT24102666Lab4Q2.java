import java.util.Scanner;
public class IT24102666Lab4Q2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int examMarks;
		int labMarks;
		int examMarksPerc;
		int labMarksPerc;
		int finalExamMark;
		int finalLabMark;
		int finalMarks;

		System.out.println("Enter Exam Marks: ");
		examMarks = input.nextInt();

		if (examMarks<0 || examMarks>100) {
			System.out.println("Invalid Exam Mark");
			System. exit(0);
		}

		System.out.println("Enter a Number: ");
		labMarks = input.nextInt();

		if (labMarks<0 || labMarks>100) {
			System.out.println("Invalid Lab Mark");
			System. exit(0);
		}
		
		System.out.println("Enter Percentage for the Exam Marks: ");
		examMarksPerc = input.nextInt();
		System.out.println("Enter Percentage for the Lab Marks: ");
		labMarksPerc = input.nextInt();

		if (examMarksPerc + labMarksPerc != 100) {
			System.out.println("Invalid Percentages");
			System. exit(0);
		}

		finalExamMark = examMarks*examMarksPerc/100;
		finalLabMark = labMarks*labMarksPerc/100;

		finalMarks = finalExamMark + finalLabMark;

		System.out.println("Your Final Mark is " + finalMarks);
		
	}
}