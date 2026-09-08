import java.util.Scanner;

public class IT22091802Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double examMark = scanner.nextDouble();

        if (examMark < 0 || examMark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMark = scanner.nextDouble();

        if (labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for lab marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examPercent = scanner.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercent = scanner.nextDouble();

        if (examPercent + labPercent != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalMark = (examMark * examPercent / 100) + (labMark * labPercent / 100);
        System.out.println("Final Exam Mark is : " + finalMark);
    }
}