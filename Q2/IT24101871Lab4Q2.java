import java.util.Scanner;
public class IT24101871Lab4Q2 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
 
double examMarks, labSubm, percGforExam, percGforLab, finExam;

//examMarks
 
System.out.print("Please enter exam marks (out of 100): ");
examMarks = input.nextInt();
 
if(examMarks < 0 || examMarks > 100)
{
System.out.print("Invalid input for exam marks. Terminating program. ");
return;
}
 
//labMarks
 
System.out.print("Please enter lab submission marks (out of 100): ");
labSubm = input.nextInt();
 
 
if(labSubm < 0 || labSubm > 100)
{
System.out.print("Invalid input for exam marks. Terminating program. ");
return;
}
 
//percGforExam
 
System.out.print("Please enter the percentage given for the exam: ");
percGforExam = input.nextInt();
 
//percGforLab
 
System.out.print("Please enter the percentage given for the lab submission: ");
percGforLab = input.nextInt();
 
if(percGforExam + percGforLab > 100 || percGforExam + percGforLab <= 50)
{
System.out.print("The percentages must add up to 100. Terminating program. ");
return;
}
 
//finExam
 
finExam = (examMarks * percGforExam / 100) + (labSubm * percGforLab / 100);
System.out.print("Final Exam Mark is: " + finExam);
 
}
}
