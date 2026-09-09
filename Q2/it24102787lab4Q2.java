import java.util.Scanner;

public class IT24102787Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter exam marks (out of 100): ");
        double exammark = input.nextDouble();

        if (exammark < 0 || exammark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return;
        }

        System.out.print("Please enter lab submission marks (out of 100): ");
        double labmark = input.nextDouble();

        if (labmark < 0 || labmark > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        System.out.print("Please enter the percentage given for the exam: ");
        double examp = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labp = input.nextDouble();

        if (examp + labp != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        double finalmarks =
                (exammark * examp / 100) +
                (labmark * labp / 100);

        System.out.println("Final Exam Mark is : " + finalmarks);

        input.close();
    }
}