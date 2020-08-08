
public class Numbers {

	public static void main(String[] args) {
		int[] array = { 78, 22, 56, 99, 12, 14, 17, 15, 1, 144, 37, 23, 47, 88, 3, 19 };

		// Go through the array and print the number and its
		// smallest larger number in the array
		for (int i : array) {
			System.out.println(i + ":" + NextLargest(i, array));
		}
	}

	// Find the smallest number larger then compareNum in array
	public static int NextLargest(int compareNum, int[] array) {
		
		// smallestLargeNumber can be set to this
		int smallestLargeNumber = Integer.MAX_VALUE;
		for (int i : array) {
			// Check if the current number of the array is larger than compareNum
			if (i > compareNum) {
				/*i is larger, so now check if smallestLargeNumber is bigger,
				and if it is we want to capture the smaller of the 2*/
				if (smallestLargeNumber > i) {
					smallestLargeNumber = i;
				}
			}
		}
		return smallestLargeNumber;
	}
}