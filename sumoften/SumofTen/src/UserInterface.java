import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int N = sc.nextInt();
		int sum = 0;

		if (N < 0) {
			System.out.println(N + " is a negative number");
			return;
		} else {
			for (int i = N; i <= N + 9; i++) {
				sum += i;
			}
			System.out.println("The sum of ten numbers is " + sum);
		}
	}
}
