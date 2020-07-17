import java.util.Scanner;

public class Cipher {

	public static void main(String[] args) {
		System.out.println("Please enter a number between 0 and 19: " );
		
		int num1, num2, num3, num4, num5;
 
		int numSelected;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your first number: " );
			num1 = input.nextInt();
		System.out.print("Please enter your Second number: " );
			num2 = input.nextInt();
		System.out.print("Please enter your Third number: " );
			num3 = input.nextInt();
		System.out.print("Please enter your Fourth number: " );
			num4 = input.nextInt();
		System.out.print("Please enter your Fifth number: " );
			num5 = input.nextInt();
		
			int numSum = (num1 + num2 + num3 + num4 + num5);
		System.out.println("The sum of your five numbers is: " + numSum);
			
	}

}
