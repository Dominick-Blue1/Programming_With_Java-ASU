/*-------------------------------------------------------------
// AUTHOR: Justin Blue
// FILENAME: Lab3.java
// SPECIFICATION: If-Else Statements to determine if a student passes or fails
// FOR: CSE 110 - Lab #3
// TIME SPENT: 1 hours
//-----------------------------------------------------------*/
import java.util.Scanner;
public class Lab3 {
	public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double homeworkGrade, midtermGrade, finalGrade;
        int i = 0;
        
        while (i<=0) {
        	System.out.println("Enter your HOMEWORK grade: ");
        	int hwGrade = in.nextInt();
	             if (hwGrade < 0 || hwGrade > 100) {
	                	System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
	                } else {
        		i++;
        	}
             System.out.println("Enter your MIDTERM EXAM grade: ");
                int mtGrade = in.nextInt();
                if (mtGrade < 0 || mtGrade > 100) {
                	System.out.println("[ERR] Invalid input. A midterm exam grade should be in [0, 100].");
                } else {
        		i++;
        	}
                System.out.println("Enter your FINAL EXAM grade: ");
                int finalExam = in.nextInt();
                if (finalExam < 0 || finalExam > 200) {
                	System.out.println("[ERR] Invalid input. A final exam grade should be in [0, 200].");
                }else {
        		i++;
        	}
        	
        	double weightedTotal = (finalExam / 200 * 50) + (mtGrade * 0.25) + (hwGrade * 0.25);
        	if (weightedTotal >= 50) {
        		System.out.println("[INFO] Student PASSES");
        	} else {
        		System.out.println("[INFO] Student FAILED");
        	}
        }
	}
}
