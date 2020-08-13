
public class Simple {

	public static void main(String[] args) {
		int n = 8;
		for (int i = 1; i <= n; i++){
		    for(int j = 1; j < 8; j = j * 2) {
		        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
		    }
		}
	}

}
