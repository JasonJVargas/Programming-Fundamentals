
public class Simple {

	public static void main(String[] args) {

		quadratic(2);
	}

	public static void quadratic(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					System.out.println("Here is this loop working: " + n);
				}
			}
		}
	}
}
