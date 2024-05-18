import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int n = sc.nextInt();

		if (n >= 1000 && n <= 9999) {
			int rev = 0;
			int tempNum = n;
			while (tempNum != 0) {
				int digit = tempNum % 10;
				rev = rev * 10 + digit;
				tempNum /= 10;
			}
			System.out.println("Reversed number is " + rev);

			int div = 1;
			int num = rev;
			while (num / div >= 10) {
				div *= 10;
			}
			while (div > 0) {
				int q = num / div;
				System.out.print(q * div);
				if (div > 1) {
					System.out.print("+");
				}
				num %= div;
				div /= 10;
			}
			System.out.println();
		} else {
			System.out.println(n + " is an invalid number");
		}
	}
}
