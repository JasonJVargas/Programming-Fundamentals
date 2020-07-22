import java.util.Scanner;

public class EvenNumSum {

	public static void main(String[] args) {

		System.out.println("Enter a number to see the sum of all even numbers between 2 and your input.");
		System.out.print("What is your number? ");

		// Create a variable for user input and get user input
		int numInput;

		Scanner Input = new Scanner(System.in);
		numInput = Input.nextInt();

		// While loop to keep asking until number is >= 2
		while (numInput < 2) {
			System.out.println("Your number must be greater or equal to 2, please try again.");
			System.out.print("What is your number? ");
			numInput = Input.nextInt();
		}
		/*
		 * Create variable for the sum of even numbers and use a for loop to continue
		 * adding even variables until we reach user input. 
		 */
		int sumEvens=0;
		for (int i = 2; i <= numInput; i++) {
			if (i % 2 == 0) {
				sumEvens += i;
			}
		}

		System.out.print("The sum of even numbers between 2 and " + numInput + " is: " + sumEvens);

	}
}