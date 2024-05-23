import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the word");
		String word = sc.nextLine();
		int lengthOfString = word.length();

		System.out.println("Enter the two indices");
		int I1 = sc.nextInt();
		if (I1 > lengthOfString) {
			System.out.println(I1 + " is greater than the word length");
			return;
		}

		int I2 = sc.nextInt();
		if (I2 > lengthOfString) {
			System.out.println(I2 + " is greater than the word length");
			return;
		}

		if (I2 < I1) {
			System.out.println("Index2 should be greater than Index1");
		} else {
			System.out.println(word.substring(I1, I2));
		}
	}
}
