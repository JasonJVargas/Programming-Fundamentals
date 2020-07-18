import java.util.Random;
import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		System.out.println("Please enter a number between 0 and 19: " );
		
		int num1, num2, num3, num4, num5;
 	
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Please enter your first number: " );
			num1 = input.nextInt();
	if (num1 > 19) {
		System.out.println("Please read directions and try again!");}
	else {
	
		System.out.print("Please enter your second number: " );
			num2 = input.nextInt();
			if (num2 > 19) {
				System.out.println("Please read directions and try again!");}
			else {
	
				System.out.print("Please enter your third number: " );
			num3 = input.nextInt();
			if (num3 > 19) {
				System.out.println("Please read directions and try again!");}
			else {
	
				System.out.print("Please enter your fourth number: " );
			num4 = input.nextInt();
			if (num4 > 19) {
				System.out.println("Please read directions and try again!");}
			else {

		System.out.print("Please enter your fifth number: " );
			num5 = input.nextInt();
			
			if (num5 > 19) {
				System.out.println("Please read directions and try again!");}
			else {

			
			int numSum = (num1 + num2 + num3 + num4 + num5);
		
			
				System.out.println("The sum of your five numbers is: " + numSum);
				
				Random rand = new Random();
				int numRand = rand.nextInt((9)+1);
				
				System.out.println("Your random key is : " + numRand);
				
				
	}
				
					}
				}
			}
		}	
	}
}

