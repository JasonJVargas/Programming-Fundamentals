import java.util.Scanner;

public class Figures {

	static int size = 0;

	public static void main(String[] args) {
		System.out.println("Programming Fundamentals \nNAME: Jason Vargas \nPROGRAMMING ASSIGNMENT 2\n");
		System.out.print("Enter the size of the figure (odd number): ");
		// Ask for user input to manipulate size and only accept it when it is an odd number
		Scanner input = new Scanner(System.in);
		int size;
		size = input.nextInt();
		while (size % 2 == 0) {

			System.out.println("Invalid figure size - must be an odd number\n");
			System.out.print("Renter the size of the figure: ");
			size = input.nextInt();
		}

		Figures.size = size;

		System.out.println("\nMENU:");
		System.out.println("1. Print Box \n2. Print Diamond \n3. Print X \n4. Quit program");
		System.out.print("\nPlease select an option: ");
		// Ask for user input to select an option
		Scanner option = new Scanner(System.in);
		int menu;
		menu = option.nextInt();

		System.out.println();
		// If statements to print correct shape based on user input
		if (menu == 1) {
			Figures.printBox();
		}

		if (menu == 2) {
			Figures.printDiamond();
		}

		if (menu == 3) {
			Figures.printX();
		}

		if (menu == 4) {
			System.out.print("Good bye!");
			System.exit(0);
		}
		option.close();
		input.close();
	}

	static void printBox() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// Print in line "X"
				System.out.print('X');
			}
			// Print a new line (next line of the box)
			System.out.println();
		}

	}

	static void printDiamond() {

		int i, j;
		for (i = 1; i <= size; i++) {
			for (j = size; j > i; j--) {
				System.out.print(" ");// Print spaces
			}
			System.out.print("X");// Print "X"
			for (j = 1; j < (i - 1) * 2; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("X\n");// Next line
			} else {
				System.out.print(" X\n");
			}
		}
		// Lower triangle
		for (i = size - 1; i >= 1; i--) {
			for (j = size; j > i; j--) {
				System.out.print(" ");
			}
			System.out.print("X");
			for (j = 1; j < (i - 1) * 2; j++) {
				System.out.print(" ");
			}
			if (i == 1) {
				System.out.print("X\n");
			} else {
				System.out.print(" X\n");
			}
		}
	}

	static void printX() {
		{
			for (int row = 0; row < size; row++) {
				for (int col = 0; col < size; col++) {
					if (row == col || row + col == size - 1) {
						System.out.print("X");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
