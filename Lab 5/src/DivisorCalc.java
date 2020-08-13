import java.util.Scanner;

public class DivisorCalc {

	public static void main(String[] args) {
		System.out.println("Enter two numbers to find their greatest common divisor (GCD).");

		Scanner scan = new Scanner(System.in);
		// Enter in variables for num1 and num2
		System.out.print("Please enter your first number: ");
		int num1 = scan.nextInt();

		System.out.print("Please Enter your second number: ");
		int num2 = scan.nextInt();
		// Call method
		int n = gcd(num1, num2);
		System.out.println("The GCD of " + num1 + " and " + num2 + " is " + n);

		scan.close();
	}
	// Method to perform GCD calculation w/ recursion.
	public static int gcd(int num1, int num2) {

		if (num1 == 0)
			return num2;

		return gcd(num2 % num1, num1);
	}
}