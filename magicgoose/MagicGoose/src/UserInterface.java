import java.util.Scanner;

public class UserInterface {

	public static int pellNumber(int n) {
		// int sum = 0;
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			int[] pellNumbers = new int[n + 1];
			pellNumbers[0] = 0;
			pellNumbers[1] = 1;
			for (int i = 2; i <= n; i++) {
				pellNumbers[i] = 2 * pellNumbers[i - 1] + pellNumbers[i - 2];
				// sum += pellNumbers[i];
			}
			return pellNumbers[n];
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the day");
		int day = sc.nextInt();

		if (day <= 0 || day > 30) {
			System.out.println(day + " is invalid day");
		} else {
			System.out.println("Number of eggs in " + day + "th day is " + pellNumber(day));
		}
	}
}
