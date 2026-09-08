import java.util.Scanner;

public class IT23240506Lab4Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = sc.nextDouble();

        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = sc.nextDouble();

        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPct = sc.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPct = sc.nextDouble();

        if ((examPct + labPct) != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark = (examMarks * examPct / 100.0) + (labMarks * labPct / 100.0);

        System.out.println("");
        System.out.println("Final Exam Mark is : " + finalMark);

    }
}