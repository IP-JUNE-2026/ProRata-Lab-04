import java.util.Scanner;
public class IT24102392Lab4Q2
{
	public static void main (String [] args)
	{
		Scanner input=new Scanner(System.in);
        
		int examMark;
        System.out.print("Please enter exam marks(out of 100):");
        examMark=input.nextInt();
        if (examMark < 0 || examMark > 100) 
		{
            System.out.println("Invalid input for exam marks. Terminating program.");
			return;
		}
		
		int labMarks;
		System.out.print("please enter lab submission marks(out of 100):");
		labMarks=input.nextInt();
		if (labMarks < 0 || labMarks > 100)
		{
            System.out.println("Invalid input for lab submission marks. Terminating program");
            return;
        }
        
        int examPercentage;
        System.out.print("please enter the percentage given for the exam: ");
        examPercentage=input.nextInt();
		
		int labPercentage;
		System.out.print("Please enter the percentage given for the lab submission: ");
        labPercentage = input.nextInt();
 
        if (examPercentage + labPercentage != 100) 
		{
            System.out.println("The percentages must add up to 100. Terminating program.");
            return;
        }
        double finalMark = (examMark * examPercentage / 100.0) + (labMarks * labPercentage / 100.0);
		
        System.out.print("Final Exam Mark is:" + finalMark);
    }
}	
