/*-------------------------------------------------------------
// AUTHOR: Justin Blue
// FILENAME: Lab2.java
// SPECIFICATION: Name Concatenation
// FOR: CSE 110 - Lab #2
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/
import java.util.Scanner;

public class Lab2 {

	public static void main (String[] args) {
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int nameLength = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter first name: ");
		firstName = scan.nextLine();
		
		System.out.print("Please enter last name: ");
		lastName = scan.nextLine();
		fullName = firstName + " " + lastName;
		
		System.out.println("Full name (in capitals) : " + fullName.toUpperCase());
		System.out.println("Length of full name: " + fullName.length());
		
		String title1 = new String("cse110");
		String title2 = "cse110";
		
		if (title1 == title2) {
			System.out.println("String comparison using \"==\" sign works");
		} else {
			System.out.println("String comparison using \"==\" sign does NOT work");
		}
		if (title1.equals(title2)) {
			System.out.println("String comparison using \"equals\" method works");
		} else {
			System.out.println("String comparison using \"equals\" method does NOT works");
		}
	}
}
