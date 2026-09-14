import java.util.Scanner;

public class IT22908360Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double examMarks;
        double labMarks;
        double examPercentage;
        double labPercentage;
        double finalMark;

        System.out.print("Please enter exam marks (out of 100): ");
        examMarks = input.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submissions marks (out of 100): ");
        labMarks = input.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        examPercentage = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        finalMark = (examMarks * examPercentage / 100)
                  + (labMarks * labPercentage / 100);

        System.out.println("Final Exam Mark is : " + finalMark);
    }
}