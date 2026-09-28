import java.util.Scanner;

 public class IT25101713Lab4Q2{
 
	 public static void main (String[] args){
	 
		 Scanner input = new Scanner (System.in);
		 
		 double EM, LSM, EMP, LSMP, FM;
		 
		 System.out.print("please enter exam marks(out of 100): ");
		 
		 EM = input.nextDouble();
		 
		System.out.print("please enter lab submission marks(out of 100): ");
		
		LSM = input.nextDouble();
		
		if{(EM < 0 || EM > 100 || LSM < 0 || LSM > 100)
		
			System.out.println("Invaalid input for exam mark, Terminating program.");
			return;
		}
		
		System.out.print("please enter the  percentage given for the exam : ");
		
		EMP = input.nextDouble();
		
		System.out.print("please enter the percentage given for the lab sunmission : ");
		
		LSMP = input.nextDouble();
		
		if{(EM < 0 || EM > 50 || LSM < 0 || LSM > 50)
		
			System.out.println("The percentags must add up to 100. Terminating program.");
			return;
		}
		
		FM = (EM*EMP/100) + (LSM*LSMP/100);
		
		System.out.println("Final Exam Martk is: "+FM);
	 }
 }
		
		