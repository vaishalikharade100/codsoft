/* 1. Generate a random number within a specified range, such as 1 to 100.

2. Prompt the user to enter their guess for the generated number.

3. Compare the user's guess with the generated number and provide feedback on whether the guess
is correct, too high, or too low.

4. Repeat steps 2 and 3 until the user guesses the correct number.

You can incorporate additional details as follows:

5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

NUMBER GAME*/

//#code

package code_soft;
import java.util.Random; 
import java.util.Scanner; 

public class task1 {
    public static void main(String[] args) 
    { 
  
        // stores actual and guess number 
        int answer, guess; 
  
          // maximum value is 100 
        final int MAX = 100; 
  
        // takes input using scanner 
        Scanner in = new Scanner(System.in); 
  
        // Random instance 
        Random rand = new Random(); 
  
        boolean correct = false; 
  
        // correct answer 
        answer = rand.nextInt(MAX) + 1; 
  
        // loop until the guess is correct 
        while (!correct) { 
  
            System.out.println( 
                "Guess a number between 1 and 100: "); 
  
            // guess value 
            guess = in.nextInt(); 
  
            // if guess is greater than actual 
            if (guess > answer) { 
                System.out.println("Too high, try again"); 
            } 
  
            // if guess is less than actual 
            else if (guess < answer) { 
                System.out.println("Too low, try again"); 
            } 
  
            // guess is equal to actual value 
            else { 
  
                System.out.println( 
                    "Yes, you guessed the number."); 
  
                correct = true; 
            } 
        } 
        System.exit(0); 
    } 

}

/*Output-

 Guess a number between 1 and 100: 
50
Too high, try again
Guess a number between 1 and 100: 
43
Too high, try again
Guess a number between 1 and 100: 
25
Too high, try again
Guess a number between 1 and 100: 
12
Too high, try again
Guess a number between 1 and 100: 
8
Too high, try again
Guess a number between 1 and 100: 

2
Yes, you guessed the number.
*/
