import java.util.Scanner;

public class IT24102719Lab4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double examMarks, labMarks;

        // Input and validate exam marks
        System.out.print("Enter exam marks (0-100): ");
        examMarks = sc.nextDouble();
        while (examMarks < 0 || examMarks > 100) {
            System.out.print("Invalid marks. Enter exam marks again (0-100): ");
            examMarks = sc.nextDouble();
        }

        // Input and validate lab marks
        System.out.print("Enter lab submission marks (0-100): ");
        labMarks = sc.nextDouble();
        while (labMarks < 0 || labMarks > 100) {
            System.out.print("Invalid marks. Enter lab marks again (0-100): ");
            labMarks = sc.nextDouble();
        }

        double examPercentage, labPercentage;

        // Input and validate percentages
        System.out.print("Enter percentage taken from exam marks: ");
        examPercentage = sc.nextDouble();

        System.out.print("Enter percentage taken from lab marks: ");
        labPercentage = sc.nextDouble();

        while ((examPercentage + labPercentage) != 100) {
            System.out.println("Percentages must add up to 100. Please re-enter.");
            System.out.print("Enter percentage taken from exam marks: ");
            examPercentage = sc.nextDouble();
            System.out.print("Enter percentage taken from lab marks: ");
            labPercentage = sc.nextDouble();
        }

        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        System.out.println("Final Mark: " + finalMark);

        sc.close();
    }
}