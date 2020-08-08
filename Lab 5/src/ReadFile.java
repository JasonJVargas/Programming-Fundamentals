import java.io.*;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		System.out.println("Maximum values");

		String myFile = "/Users/jason/Documents/GitHub/Programming-Fundamentals/Lab 5/src/input.csv";

		File f = new File(myFile);
		Scanner fileScan = new Scanner(f);

		int counter = 1;

		while (fileScan.hasNext()) {

			int values = 0;
			
			String row = fileScan.nextLine();
			String[] rowArray;
			rowArray = row.split(",");

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