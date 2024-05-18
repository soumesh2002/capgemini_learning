import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Alex points");
		int ap = sc.nextInt();
		if (ap < 0 || ap > 50) {
			System.out.println(ap + " is an invalid number");
			return;
		}

		System.out.println("Enter Nikil points");
		int np = sc.nextInt();
		if (np < 0 || np > 50) {
			System.out.println(np + " is an invalid number");
			return;
		}

		System.out.println("Enter Sam points");
		int sp = sc.nextInt();
		if (sp < 0 || sp > 50) {
			System.out.println(sp + " is an invalid number");
			return;
		}

		if (ap == np || np == sp || ap == sp) {
			System.out.println("The game is a tie");
			return;
		} else if (ap > np && ap > sp) {
			System.out.println("Alex scored " + ap + " points and won the game");
			return;
		} else if (np > ap && np > sp) {
			System.out.println("Nikil scored " + np + " points and won the game");
			return;
		} else {
			System.out.println("Sam scored " + sp + " points and won the game");
			return;
		}
	}
}
