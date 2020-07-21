import java.util.Scanner;

public class AgeGuess {

	public static void main(String[] args) {
		System.out.println("What is your name?");
		String name = "";
		Scanner scan = new Scanner(System.in);
		name = scan.nextLine();
		System.out.println("Hello " + name + ", try to guess my age.");
		
		int ageGuess;
		ageGuess = 27;           
		Scanner input = new Scanner(System.in);
		int userguess;

        do {
        	System.out.print("What is your guess?: ");
        	userguess = input.nextInt();

        	if (userguess == ageGuess)
            	System.out.println("Correct!");

            else if (userguess < ageGuess)
            	System.out.println("Too low!");

            else if (userguess > ageGuess)
            	System.out.println("Too high!");

        } while (userguess != ageGuess);
		
		

	}

}
