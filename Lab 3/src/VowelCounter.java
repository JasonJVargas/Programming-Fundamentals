import java.util.Scanner;

public class VowelCounter {

	public static void main(String[] args) {
		System.out.print("Enter a word and I will count the lowercase vowels and "
				+ "non vowel characters. \nEnter word: ");

		Scanner Input = new Scanner(System.in);
		String userWord = Input.nextLine();

		char[] charArray = userWord.toCharArray();

		int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0, nonVowel = 0;

		for (char c : charArray) {

			switch (c) {
			case 'A':
				break;
			case 'E':
				break;
			case 'I':
				break;
			case 'O':
				break;
			case 'U':
				break;
			case 'a':
				aCount++;
				break;
			case 'e':
				eCount++;
				break;
			case 'i':
				iCount++;
				break;
			case 'o':
				oCount++;
				break;
			case 'u':
				uCount++;
				break;
			default:
				nonVowel++;
				break;

			}

		}
		System.out.println("Number of each lowercase vowel. \n'a':" + aCount + "\n'e':" + eCount + "\n'i':" + iCount
				+ "\n'o':" + oCount + "\n'u':" + uCount);
		System.out.print("The number of non vowel characters: " + nonVowel);
	}
}
