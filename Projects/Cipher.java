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
		System.out.println("Welcome to my Cipher program." );
		System.out.println("Please enter 5 numbers between 0 and 19." );
			//Name variables for each number added
		int num1, num2, num3, num4, num5;
 	
		Scanner input = new Scanner(System.in);
		
			System.out.print("1st number: " );
			num1 = input.nextInt();
			
			/*If else conditions continues if number selected in range.
			  Nested if else conditions in order to break if a number
			  outside range is entered. */
			 
	if (num1 < 0 || num1 >19) {
				System.out.println("Please read directions and try again!");}
	else {
	
				System.out.print("2nd number: " );
				num2 = input.nextInt();
		
			if (num2 < 0 || num2 >19) {
				System.out.println("Please read directions and try again!");}
			else {
	
				System.out.print("3rd number: " );
				num3 = input.nextInt();
			
			if (num3 < 0 || num3 >19) {
				System.out.println("Please read directions and try again!");}
			else {
	
				System.out.print("4th number: " );
				num4 = input.nextInt();
			
			if (num4 < 0 || num4 >19) {
				System.out.println("Please read directions and try again!");}
			else {

				System.out.print("5th number: " );
				num5 = input.nextInt();
			
			if (num5 < 0 || num5 >19) {
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
					
				/*If else condition to deal with a number being < 10.
				 * The actual steps will be commented on in the else
				 */
			if (numSum <10) {
				
				int digit1 = 0;
				int digit2 = numSum % 10;
				
				int n1 = (digit1 + numRand) % 10;
				int n2 = (digit2 + numRand) % 10;
			
				System.out.print("Your encoded number is: " + n1 + "" + n2);}
			else {
				
			 	int digit1 = numSum / 10;
			    int digit2 = numSum % 10;
			        
			       // Create cypher of digits and print
			    int n1 = (digit1 + numRand) % 10;
			    int n2 = (digit2 + numRand) % 10;
			        
			        System.out.print("Your encoded number is: " + n1 + "" + n2);

				
							}
						}				
					}
				}
			}
		}	
	}
}
