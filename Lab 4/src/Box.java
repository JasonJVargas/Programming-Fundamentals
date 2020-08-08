
public class Box {

	static int size=0;
	static char c;

	public static void main(String[] args) {
		// Assign the Box size variable
		Box.size = 5;
		// Run our method
		Box.printBox();
		Box.printBox();
		Box.printBox(c);
	}
	
	// Method that will print out a box of stars
	 static void printBox() {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// Print in line *
				System.out.print('*'); 
			}
			// Print a new line (next line of the box)
			System.out.println(); 
		}

	}
	static void printBox(char c) {
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				// Print in line *
				System.out.print('c'); 
			}
			// Print a new line (next line of the box)
			System.out.println(); 
		}

	}
}