
public class Simple {

	public static void main(String[] args) {

		simpleQuad(2);
	}

	public static void simpleQuad(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					System.out.println("It works: " + n);
				}
			}
		}
	}

}
