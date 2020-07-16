import java.util.Scanner;

public class NumDisplay {

	public static void main(String[] args) {
		System.out.println("Please type a number between 0 and 9");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String numberSpell;
		
		switch(number) {
			case 0: numberSpell = "Zero";
				break;
			
			case 1: numberSpell = "One";
				break;
			
			case 2: numberSpell = "Two";
				break;
			
			case 3: numberSpell = "Three";
				break;
			
			case 4: numberSpell = "Four";
				break;
			
			case 5: numberSpell = "Five";
				break;
			
			case 6: numberSpell = "Six";
				break;
			
			case 7: numberSpell = "Seven";
				break;
			
			case 8: numberSpell = "Eight";
				break;
			
			case 9: numberSpell = "Nine";
				break;
				
			default: numberSpell = "Wrong number";
				break;
				
			
		}
		System.out.println(numberSpell);
		
	}

}
