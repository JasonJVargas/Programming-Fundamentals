	//Import Random and Scanner
import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
			//Header
		System.out.println("Programming Fundamentals");
		System.out.println("Name: Jason Vargas");
		System.out.println("PROGRAMMING ASSIGNMENT 1");
		System.out.println();
			//Program start
		System.out.print("Welcome to my Cipher program, " );
		System.out.println("please enter numbers between 0 and 19." );
			//Name variables for each number added
		int num1, num2, num3, num4, num5;
 	
		Scanner input = new Scanner(System.in);
		
			System.out.print("1st number: " );
			num1 = input.nextInt();
			
			/*If else conditions continues if number selected in range.
			  Nested if else conditions in order to break if a number
			  outside range is entered. */
			 
	if (num1 > 19) {
				System.out.println("Please read directions and try again!");}
	else {
	
				System.out.print("2nd number: " );
				num2 = input.nextInt();
		
			if (num2 > 19) {
				System.out.println("Please read directions and try again!");}
			else {
	
				System.out.print("3rd number: " );
				num3 = input.nextInt();
			if (num3 > 19) {
				System.out.println("Please read directions and try again!");}
			else {
	
				System.out.print("4th number: " );
				num4 = input.nextInt();
			if (num4 > 19) {
				System.out.println("Please read directions and try again!");}
			else {

				System.out.print("5th number: " );
				num5 = input.nextInt();
			
			if (num5 > 19) {
				System.out.println("Please read directions and try again!");}
			else {
				System.out.println();

					//Create a variable to store the sums
				int numSum = (num1 + num2 + num3 + num4 + num5);
		
				System.out.println("Total =  " + numSum);
					//Generate a random number between 0 and 9 (inclusive)
				Random rand = new Random();
				int numRand = rand.nextInt((9)+1);
				
				System.out.println("Your random key is : " + numRand);
					
					//Convert Int to String to separate values
				String numString = Integer.toString(numSum);
				/*If else condition to deal with a number being < 10.
				 * The actual steps will be commented on in the else
				 */
			if (numSum <10) {
				String numString1 = numString.substring(0,1);
				
				int numInt1 = Integer.parseInt(numString1);
				
				int cypher1 = (numInt1 + numRand) % 10;
				
				String n1 = Integer.toString(cypher1);

				System.out.print("Your encoded number is: " + n1);}
			else {
					//Separate the numbers
				String numString1 = numString.substring(0,1);
				String numString2 = numString.substring(1,2);
					//Convert to integers for cipher calculation
				int numInt1 = Integer.parseInt(numString1);
				int numInt2 = Integer.parseInt(numString2);
					//Cipher calculation
				int cypher1 = (numInt1 + numRand) % 10;
				int cypher2 = (numInt2 + numRand) % 10;
					//Convert back to strings for final product
				String n1 = Integer.toString(cypher1);
				String n2 = Integer.toString(cypher2);
				
				System.out.print("Your encoded number is: " + n1 + n2);
	
				
							}
						}				
					}
				}
			}
		}	
	}
}
