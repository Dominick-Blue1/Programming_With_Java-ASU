/*------------------------------------------------------------
// AUTHOR: JUSTIN BLUE
// FILENAME: LAB1
// SPECIFICATION: SOURCE CODE FOR LAB 1
// FOR: CSE 110- Lab #1
// TIME SPENT: 15 minutes //--------------------
---------------------------------------*/
import java.util.Scanner;

public class Lab1 {
	
	public static void main (String[] args) {
		
		int test1, test2, test3;
		final int NUM_TESTS = 3;
		double avgTestValue;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the score on the first test: ");
		test1 = in.nextInt();
		System.out.println("Enter the score on the second test: ");
		test2 = in.nextInt();
		System.out.println("Enter the score on the third test: ");
		test3 = in.nextInt();
		
		avgTestValue = (test1 + test2 + test3) / (double)NUM_TESTS;
		
		System.out.println("The student's average test score is: " + avgTestValue);
		
	}

}
