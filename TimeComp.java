import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		System.out.print("Type a number of seconds to convert to hours, minutes, and seconds format: ");
		Scanner Input = new Scanner (System.in);
		int numSeconds = Input.nextInt();
		int t1 = numSeconds % 60;
		int t2 = numSeconds / 60;
		int t3 = t2 % 60;
		t2 = t2/60;
		
		System.out.print(t2 + " hours " + t3 + " minutes " + t1 + " seconds");
		
	}

}
