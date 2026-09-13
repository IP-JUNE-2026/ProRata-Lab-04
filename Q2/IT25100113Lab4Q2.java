import java.util.Scanner;

public class IT25100113Lab4Q2 {
    public static void main(String[] args) {
        Scanner Thiviru = new Scanner(System.in);
        
        double exam, lab, examPer, labPer;
        
        do {
            System.out.print("Enter exam marks (0-100): ");
            exam = Thiviru.nextDouble();
			if (exam < 0 || exam > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            }
        } while (exam < 0 || exam > 100); 
        
        do {
            System.out.print("Enter lab marks (0-100): ");
            lab = Thiviru.nextDouble();
			if (lab < 0 || lab > 100) {
				System.out.println("Invalid marks! Please enter marks between 0 and 100.");
            }
			
        } while (lab < 0 || lab > 100);
        
        do {
            System.out.print("Enter exam percentage: ");
            examPer = Thiviru.nextDouble();
            System.out.print("Enter lab percentage: ");
            labPer = Thiviru.nextDouble();
        } while (examPer + labPer != 100);
        
        double finalMark = (exam * examPer / 100) + (lab * labPer / 100);
        System.out.println("Final marks: " + finalMark);
    }
}