import java.util.Scanner;

public class IT22889942Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Exam mark ---
        System.out.print("Please enter exam marks (out of 100): ");
        double examMark = input.nextDouble();
        if (examMark < 0 || examMark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            input.close();
            return;
        }

        // --- Lab mark ---
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMark = input.nextDouble();
        if (labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            input.close();
            return;
        }

        // --- Weights ---
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercent = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercent = input.nextDouble();

        if (examPercent + labPercent != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            input.close();
            return;
        }

        // --- Calculate final mark ---
        double finalMark = (examMark * examPercent / 100.0)
                         + (labMark  * labPercent  / 100.0);

        System.out.println("\nFinal Exam Mark is : " + finalMark);

        input.close();
    }
}