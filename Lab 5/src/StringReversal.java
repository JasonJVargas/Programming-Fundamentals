import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {
		System.out.println("Enter something and I will return it in reverse order!");

		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();

		String stringRev = reverseString(string);

		System.out.println("Your input in reverse is: " + stringRev);
		scan.close();

	}

	public static String reverseString(String s) {

		if (s.isEmpty())
			return s;

		return reverseString(s.substring(1)) + s.charAt(0);
	}
}