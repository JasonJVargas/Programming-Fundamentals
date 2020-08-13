
public class ExerciseTwo {

	public static void main(String[] args) {
foo(2);
	}

	static int foo(int N) {
		int result = 0;
		for (int i = 0; i < N; i++)
			result++;
		for (int j = 0; j < 1000000; j++)
			result += j;

		return result;
	}
}