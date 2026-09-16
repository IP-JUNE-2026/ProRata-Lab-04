import java.util.Scanner;
    public class IT26101614Lab4Q2{
	  public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter exam marks(out of 100): ");
		double examMarks = input.nextDouble();
		
		if(examMarks < 0 || examMarks > 100){
				System.out.println("Invalid input for exam marks. Terminating program.");
			return;
			}
		
		System.out.println("Please enter lab submission marks(out of 100): ");
		double labMarks = input.nextDouble();
		
		if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid input for lab submission marks. Terminating program.");
			return;
            }
		
		System.out.println("Please enter the percentage given for the exam: ");
		double examPercentage = input.nextDouble();
		
		System.out.println("Please enter the percentage given for the lab submission: ");
		double labPercentage = input.nextDouble();
	
			
		if ((examPercentage + labPercentage) != 100) {
           System.out.println("The percentages must add up to 100. Terminating program.");
		   return;
	        }
			
		double finalMark = (examMarks* examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
        System.out.println("Final Exam Mark is : " + finalMark);
		
	  }
	} 