package Tasks;

import java.util.Scanner;
import java.util.Random;

public class Number_Guessing_Game {
	
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random rand = new Random();
int max = 10;		            
int attempts = 0;		            
int score = 1;		            
int guess;		            
int number = rand.nextInt(max) + 1;		            
System.out.println("============================");		            
System.out.println("Welcome to Guess the Number!");		            
System.out.println("============================");		            
System.out.println("I'm (processor) thinking of a number between 1 and " + max);		

do {		                
	System.out.print("Enter your guess: ");		                
	guess = input.nextInt();			                
	attempts++;		                
	
	
if (guess == number) {
	System.out.println("=====================================================================");
	System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
	score = max - attempts;
	System.out.println("Your score is: " + score);
	System.out.println("=======================");
	break;
	} else if (guess < number) {
		System.out.println("The number is higher.");
		} else {
			System.out.println("The number is lower.");
			}
} while (attempts < max);

		 System.out.println("The correct number was: " + number);
		 System.out.println("====================================");
		 System.out.println("Thanks for playing Guess the Number!");
		 System.out.println("====================================");
		 
        }
		   
	}


