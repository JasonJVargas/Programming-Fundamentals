import java.io.*;
import java.util.Scanner;

public class UserStrings {

	public static void main(String[] args) throws IOException {

		System.out.println("Please enter a string to add it to a file. Enter DONE to quit.");

		String file = "userStrings.txt";

		String userInput = "";

		Scanner scan = new Scanner(System.in);

		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter userStrings = new PrintWriter(bw);

		userInput = scan.nextLine();
		userStrings.print(userInput + "\n");

		while (!userInput.equals("DONE")) {
			System.out.println("Enter another string. Enter 'DONE' to exit.");
			userInput = scan.nextLine();
			userStrings.print(userInput + "\n");
		}
		scan.close();
		userStrings.close();
		
		System.out.println("Text file has been created: " + file);
	}
}