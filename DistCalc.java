import java.util.Scanner;

public class DistCalc {

	public static void main(String[] args) {
			//Creates 4 float variables distance 
		double x1, x2, y1, y2;
		double distance = 0;
			//Allows user input
		Scanner scan = new Scanner(System.in);
			//Prompts the user to input x1, x2, y1, y2
		System.out.print("Please enter x1: ");
		x1 = scan.nextDouble();
		
		System.out.print("Please enter x2: ");
		x2 = scan.nextDouble();
		
		System.out.print("Please enter y1: ");
		y1 = scan.nextDouble();
		
		System.out.print("Please enter y2: ");
		y2 = scan.nextDouble();
			//Calculates the distance
		distance = (double) (Math.sqrt(Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2)));
			//Prints out our distance formatted to 3 decimal places
		System.out.println("Distance = " + String.format("%.3f", distance));
	
	}

}
