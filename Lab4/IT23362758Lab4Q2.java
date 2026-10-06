import java.util.Scanner;

public class IT23362758Lab4Q2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double examMark;
        double labMark;
        double examPercentage;
        double labPercentage;
        double finalMark;

        System.out.print("Please enter the exam mark out of 100: ");
        examMark = input.nextDouble();

        System.out.print("Please enter the lab submission mark out of 100: ");
        labMark = input.nextDouble();

        if(examMark < 0 || examMark > 100 ||
           labMark < 0 || labMark > 100)
        {
            System.out.println("Invalid input for marks. Terminating program.");
        }
        else
        {
            System.out.print("Please enter the percentage given for the Exam Submission: ");
            examPercentage = input.nextDouble();

            System.out.print("Please enter the percentage given for the Lab Submission: ");
            labPercentage = input.nextDouble();

            if((examPercentage + labPercentage) != 100)
            {
                System.out.println("The percentages should add up to 100. Terminating program.");
            }
            else
            {
                finalMark =
                (examMark * examPercentage / 100) +
                (labMark * labPercentage / 100);

                System.out.println("Final Exam Mark is " + finalMark);
            }
        }
    }
}
