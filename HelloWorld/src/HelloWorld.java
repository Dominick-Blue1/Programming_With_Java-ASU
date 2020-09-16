//First Program written in CSE 110!
//August  2020 - Today, I am learning to work with the math library!
import java.util.Scanner;

public class HelloWorld 
{
	//Final simply means it is constant and will not change!
	final double Pi = 3.14;
	public static void main (String[] args)
	{
		String name;
		int age;
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your name?");
		name = in.next();
		System.out.println(); 
		System.out.println("Hello, " + name + "!");
		System.out.println();
				
		System.out.println("How old are you?");
		age = in.nextInt();
		
		System.out.println("You are: " + age + "?!");
		
		in.close();
		
		/* 
		Simple formatted console output
		%d = formatting integer 
		%f = formatting a float
		\n = formatting a new line
		
		Formatted console output with width and precision
		%10d = Integer taking up ten spaces 
		%10.2f = Float with two decimal spaces and 10 characters wide.
		
		Formatted console output with interpolation and newlines
		a = %d and x = %2.f 
		%n = newline
		left justify = %-10s
		right justify = %10.2f
		s = followed by
		
		System.out.printf(%10s%-10, "Hello", "World);
		*/
		
		System.out.printf("%-10s%10s" ,"Hello","World");
		System.out.println();
		System.out.println(name.length());
		System.out.println(name.charAt(3));
		System.out.println(name.indexOf("o"));
		
	}
	
}
