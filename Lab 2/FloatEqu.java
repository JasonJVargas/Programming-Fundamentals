import java.lang.*;

public class FloatEqu {

	public static void main(String[] args) {

			//Double has precision up to 15-16 decimals
		double num1 = (1.0/10) * (1.0/10);
		double num2 = (1.0/100);
		double tolerance = 0.0000001;
		System.out.println(num1);
		System.out.println(num2);
			//If, else if, else conditional to compare all 3 conditions. 
		if (num1 == num2) {
			System.out.println("EQUAL"); 
			}
		
		else if (Math.abs(num1-num2) < tolerance) {
			System.out.println("APPROXIMATELY EQUAL"); 
			}
		
		else { System.out.println("NOT EQUAL");
			}
	
	}
}