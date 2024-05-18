import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ticket Id");
		String T = sc.nextLine();

		System.out.println("Enter the unlucky code");
		char U = sc.nextLine().charAt(0);

		int UC = 0;
		for (int i = 0; i < T.length(); i++) {
			if (T.charAt(i) == U) {
				UC++;
			}
		}

		if (UC == 0) {
			System.out.println(T + " is lucky ticket");
		} else if (UC < 3) {
			System.out.println(T + " is partially lucky");
		} else {
			System.out.println(T + " is unlucky ticket");
		}
	}
}