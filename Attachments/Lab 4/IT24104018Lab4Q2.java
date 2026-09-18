import java.util.Scanner;

public class IT24104018Lab4Q2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input marks
        System.out.print("Enter exam marks: ");
        double examMark = input.nextDouble();

        System.out.print("Enter lab submission marks: ");
        double labMark = input.nextDouble();

        // Validate marks
        if (examMark < 0 || examMark > 100 ||
            labMark < 0 || labMark > 100) {

            System.out.println("Invalid marks! Marks should be between 0 and 100.");
        }
        else {

            // Input percentages
            System.out.print("Enter exam percentage: ");
            double examPercentage = input.nextDouble();

            System.out.print("Enter lab percentage: ");
            double labPercentage = input.nextDouble();

            // Validate percentages
            if (examPercentage + labPercentage != 100) {

                System.out.println("Invalid percentages! Total should be 100.");

            }
            else {

                // Calculate final mark
                double finalMark =
                        (examMark * examPercentage / 100) +
                        (labMark * labPercentage / 100);

                System.out.println("Final Mark = " + finalMark);
            }
        }

        input.close();
    }
}