import java.util.Scanner;

public class IT23692046Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter exam and lab submission marks
        System.out.print("Enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();

        System.out.print("Enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();

        // Validate that marks are between 0 and 100
        if (examMarks < 0 || examMarks > 100 || labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid Marks. Marks must be between 0 and 100.");
        } else {
            // Prompt user to enter percentages for exam and lab
            System.out.print("Enter the percentage taken from the exam mark: ");
            double examPercentage = scanner.nextDouble();

            System.out.print("Enter the percentage taken from the lab submission mark: ");
            double labPercentage = scanner.nextDouble();

            // Validate that percentages add up to 100
            if ((examPercentage + labPercentage) != 100) {
                System.out.println("Invalid Percentages. The percentages must add up to 100.");
            } else {
                // Calculate final mark
                double finalMark = (examMarks * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);

                // Display the results
                System.out.println("\n--- Final Mark Calculation ---");
                System.out.printf("Exam Marks:     %.2f (Weight: %.1f%%)\n", examMarks, examPercentage);
                System.out.printf("Lab Marks:      %.2f (Weight: %.1f%%)\n", labMarks, labPercentage);
                System.out.printf("Final Mark:     %.2f\n", finalMark);
            }
        }

        scanner.close();
    }
}