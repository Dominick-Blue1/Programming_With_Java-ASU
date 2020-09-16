/*  CSE 110      
*   Assignment   : Assignment04
*   Author       : Justin Blue
*   Description  : Number Guessing Game Using Nested Loops
*/
import java.util.Scanner;

public class Assignment04
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String userChoice, randomNum = "", userNum;
        
        System.out.println("-----MASTERMIND-----");

        do
        {
            int guess=0, count=0;

            //Generating a random number
            for (int i=0;i<4;i++) 
                randomNum += (int) (Math.random() * 9)+"";

                System.out.println("Guess the 4 digit number!");
            //Counting guesses
            while (true)
            {
                guess++;
                System.out.print("\nGuess " + guess + ": ");
                userNum = scan.nextLine();

                //Counting matches
                for (int i=0;i<4;i++)
                {
                    if(userNum.charAt(i) == randomNum.charAt(i))
                        count++;
                }
                
                System.out.println("You matched "+count);

                //When the number matches
                if (count==4)
                {
                System.out.println("\nCongratulations! You guessed the right number in " + guess + " guesses.");
                break;
                }

            count=0;

            }       
            //Asking if the user would like to play again
            System.out.println("Would you like to play again (yes/no)? ");
            userChoice = scan.nextLine();
            System.out.println();
        
        } while (userChoice.equals("yes"));

    scan.close();

    }
}