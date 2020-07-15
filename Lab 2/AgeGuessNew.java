	//Import scanner utility to allow user input
import java.util.Random;
import java.util.Scanner;

public class AgeGuessNew {

	public static void main(String[] args) {
		
			//Prompt user to input name.
		System.out.println("What is your name?");
		String name = "";
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
			//Greet user then ask for them to begin guessing.
		System.out.println("Hello " + name + ", try to guess my age.");
		System.out.println("Guess a number between 1 and 100");
			//Generates a random age between 1 and 100
		Random rand = new Random();
		int randomAge = rand.nextInt(100)+1;
			//Allow user to input guess
		Scanner input = new Scanner(System.in);
			//Prompts an initial guess before entering while loop
		int guess=input.nextInt();
			//Display messages according to users guess until they guess correctly.
		while (guess != randomAge) {
						
			if(guess<randomAge) 
				System.out.println("Too Low!");
				
			
			else 
				System.out.println("Too High!");
			//Input at the end will allow exiting of loop so only "Correct!" is diplayed	
			guess = input.nextInt();
		}
		System.out.println("Correct!");
	}
}




