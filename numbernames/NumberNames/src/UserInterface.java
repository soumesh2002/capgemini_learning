import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();

		String[] numberNames = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

		String numberString = Integer.toString(n);
		for (int i = 0; i < numberString.length(); i++) {
			int digit = numberString.charAt(i) - '0';
			System.out.print(numberNames[digit] + " ");
		}
	}
}
