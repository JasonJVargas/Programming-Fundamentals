import java.util.Scanner;

public class TimeComp {

	public static void main(String[] args) {
		System.out.print("Type a number of seconds to convert to hours, minutes, and seconds format: ");
		Scanner Input = new Scanner (System.in);
		int numSeconds = Input.nextInt();
		int t1 = numSeconds /3600;
		int t2 = (numSeconds % 3600) / 60;
		int t3 = numSeconds % 60;
		
		System.out.print(t1 + " hours " + t2 + " minutes " + t3 + " Seconds");
		
	}

}
