import java.util.Scanner;

public class FinalMark {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input exam marks
        System.out.print("Enter exam marks: ");
        double examMarks = input.nextDouble();

        // Validate exam marks
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks");
            return;
        }

        // Input lab marks
        System.out.print("Enter lab submission marks: ");
        double labMarks = input.nextDouble();

        // Validate lab marks
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab marks");
            return;
        }

        // Input percentages
        System.out.print("Enter percentage for exam: ");
        double examPercentage = input.nextDouble();

        System.out.print("Enter percentage for lab: ");
        double labPercentage = input.nextDouble();

        // Validate percentages
        if (examPercentage + labPercentage != 100) {
            System.out.println("Invalid percentages. They must add up to 100.");
            return;
        }

        // Calculate final mark
        double finalMark =
                (examMarks * examPercentage / 100)
                + (labMarks * labPercentage / 100);

        System.out.println("Final Mark = " + finalMark);
    }
}