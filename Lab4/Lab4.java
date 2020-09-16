/*-------------------------------------------------------------
// AUTHOR: Justin Blue

// FILENAME: Lab4.java
// SPECIFICATION: Uses a loop-switch to compute data input from user
// FOR: CSE 110 - Lab #4
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/
import java.util.*;

public class Lab4 
{
	public static void main(String[] args)
	{
		int choice;
		Scanner in = new Scanner(System.in);
		
		
		do {
			// Display the menu
			displayMenu();
			choice = in.nextInt();
						
			switch(choice) 
			{
				case 1:
					int m,sum=0;
					System.out.println("Choose a number: ");
					m = in.nextInt();
					int i;
						for(i=1;i<=m;i++)
						{
							sum=sum+i;							
						}
						System.out.println(sum);
					break;
				case 2:
					int n,fact=1;
					System.out.println("Choose a number: ");
					n = in.nextInt();
						for(i=1;i<=n;i++)
						{
							fact=fact*i;
						}
						System.out.println(fact);
					break;
				case 3:
					int left;
					System.out.println("Choose a number: ");
					left = in.nextInt();
						while(left >= 10)
							left /= 10;
					System.out.println(left);
					break;
				default:
					System.out.println("Bye");
					break;
			} 
		}
			while (choice!=4);			
	} 
	private static void displayMenu()
	{
		System.out.println("Please choose one option from the following menu: ");
		System.out.println("1) Calculate the sum of integers from 1 to m");
		System.out.println("2) Calculate the factorial of a given number ");
		System.out.println("3) Display the leftmost digit of a given number");
		System.out.println("4) Quit");	
	}	
}
