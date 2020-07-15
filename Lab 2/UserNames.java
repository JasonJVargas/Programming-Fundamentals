import java.util.Random;
import java.util.Scanner;

public class UserNames {

	public static void main(String[] args) {
			
			//Ask for user first name
		System.out.println("What is your first name? ");
		String nameFirst = "";
		Scanner scanFirst = new Scanner(System.in);
		nameFirst = scanFirst.nextLine();
			
			//Ask for user last name
		System.out.println("What is your last name?");
		String nameLast = "";
		Scanner scanLast = new Scanner(System.in);
		nameLast = scanLast.nextLine(); 
		
			//Random number generator
		Random rand = new Random();
		int max = 99;
		int min = 10;
		int number = rand.nextInt((max-min) +1) + min;
			//Create variable for first letter of first name and complete user name
		String nameFirstChar = nameFirst.substring(0,1);
		String userName = "";
			// if else conditional in case last name less than 4 char
		if(nameLast.length() < 5) {
			userName = nameLast + nameFirstChar;}
		else {
			userName = nameLast.substring(0,5) + nameFirstChar;}
		
		System.out.println(userName + number);
		
		}
			
		
	}

