import java.util.Scanner;

public class IT25100726Lab4Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Input Exam Marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMark = input.nextDouble();

        // Validate Exam Marks Range
        if (examMark < 0 || examMark > 100) {
            System.out.println("Invalid input for exam marks. Terminating program.");
            return; // Stops the program
        }

        //Input Lab Marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMark = input.nextDouble();

        // Validate Lab Marks Range
        if (labMark < 0 || labMark > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
            return;
        }

        //Input Percentages
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercent = input.nextDouble();

        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercent = input.nextDouble();

        //Validate Percentage Addition
        if ((examPercent + labPercent) != 100) {
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }

        //Calculate and Display Final Mark
        double finalMark = (examMark * examPercent / 100.0) + (labMark * labPercent / 100.0);
        
        System.out.println("\nFinal Exam Mark is : " + finalMark);

        
    }
}