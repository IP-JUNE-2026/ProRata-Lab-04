import java.util.Scanner;
public class IT24100061Lab4Q2 {
   public static void main (String[] args) {
   
      double examMarks,labMarks,examPercent,labPercent;
	  Scanner value = new Scanner(System.in);
	  
	  System.out.println("Please enter exam marks(out of 100):");
	  examMarks = value.nextDouble();
	  
	  System.out.println("Please enter lab submission marks(out of 100):");
	  labMarks = value.nextDouble();
	  
	  if (examMarks >= 0 && examMarks <= 100 && labMarks >= 0 && labMarks <= 100) {

            System.out.print("Please enter the percentage given for the exam: ");
             examPercent = value.nextDouble();

            System.out.print("Please enter the percentage given for the lab submission: ");
             labPercent = value.nextDouble();

            if (examPercent + labPercent == 100) {

                double finalMark = (examMarks * examPercent / 100) + (labMarks * labPercent / 100);
                System.out.println("Final Exam Mark is : " + finalMark);

            } else {
                System.out.println("The percentages must add up to 100. Terminating program.");
            }

        } else {
            System.out.println("Invalid input for exam marks. Terminating program.");
        }

        
    }
}

	  
	  