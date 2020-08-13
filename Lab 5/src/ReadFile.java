import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Maximum values");
		
		// Direct path to file
		String myFile = "/Users/jason/Documents/GitHub/Programming-Fundamentals/Lab 5/src/input.csv";
		
		// Create scanner for file
		File f = new File(myFile);
		Scanner fileScan = new Scanner(f);

		int counter = 1;
		// Loop to go through each row of the file
		while (fileScan.hasNext()) {

			int values = 0;
			// Create an array to hold and compare numbers
			String row = fileScan.nextLine();
			String[] rowArray;
			rowArray = row.split(",");
			
			// Loop to go through array and compare integers
			for (int x = 0; x < rowArray.length; x++) {

				if (Integer.parseInt(rowArray[x]) > values)
					values = Integer.parseInt(rowArray[x]);
			}
			System.out.println("ROW " + counter + ": " + values);
			counter++;
		}

		fileScan.close();

	}
}