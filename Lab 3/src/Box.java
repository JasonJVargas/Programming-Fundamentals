

public class Box {
	// Instance variable
	int size = 0;

	public static void main(String[] args) {
		// Create a new instance of our "Box" class
		Box box = new Box();
		// Assign the Box size variable
		box.size = 5;
		// Run our method
		box.printBox();
	}

	// Method that will print out a box of stars
	public void printBox() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// Print in line *
				System.out.print('*');
			}
			// Print a new line (next line of the box)
			System.out.println();
		}

	}
}