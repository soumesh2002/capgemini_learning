import java.util.Scanner;

public class UserInterface {
	public void isValidProfileCode(String code) {
		if (!code.startsWith("#")) {
			System.out.println(code + " does not start with a valid special character");
			return;
		}

		if (code.toCharArray().length != 8) {
			System.out.println(code + " does not have the specified length");
			return;
		}

		String alphabets = code.substring(1, 5);
		if (!alphabets.matches("[A-Z]{4}$")) {
			int count = 0;
			for (char ch : alphabets.toCharArray()) {
				if (Character.isUpperCase(ch)) {
					count++;
				}
			}
			System.out.println(count + " is an invalid number for uppercase character");
			return;
		}

		String digits = code.substring(5, 8);
		if (!digits.matches("[0-9]{3}")) {
			int count = 0;
			for (char ch : digits.toCharArray()) {
				if (Character.isDigit(ch)) {
					count++;
				}
			}
			System.out.println(count + " is an invalid number for digits");
			return;
		}
		System.out.println(code + " is a valid profile code whose last 3 digits are " + digits);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your profile code");
		String gameCode = sc.nextLine();

		UserInterface uf = new UserInterface();
		uf.isValidProfileCode(gameCode);
		sc.close();
	}
}