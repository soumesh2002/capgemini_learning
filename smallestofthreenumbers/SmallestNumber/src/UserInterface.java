import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, s;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();


		s = a < b ? (a < c ? a : c) : (b < c ? b : c);

		if (a == b && b == c) {
			System.out.println("All numbers are equal");
		} else {
			System.out.println("The smallest number is " + s);
		}
	}
}
