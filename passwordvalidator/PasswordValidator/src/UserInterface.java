import java.util.Scanner;

public class UserInterface {
	public static boolean checkPassword(String s) {
		return s.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@$#*]).{6,12}$");
	}

	public static void printPassword(String password) {
		int lowerCase = 0;
		int upperCase = 0;
		int specialCharacter = 0;
		int digits = 0;
		for (Character c : password.toCharArray()) {
			if (Character.isDigit(c)) {
				digits++;
			} else if (Character.isLowerCase(c)) {
				lowerCase++;
			} else if (Character.isUpperCase(c)) {
				upperCase++;
			} else if (isSpecialCharacter(c)) {
				specialCharacter++;
			}
		}
		System.out.println("The generated password " + password + " is valid and has " + lowerCase
				+ " lowercase alphabet " + upperCase + " uppercase alphabet " + specialCharacter + " special character "
				+ digits + " digit");
	}

	public static boolean isSpecialCharacter(char c) {
		return c == '@' || c == '$' || c == '*' || c == '#';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Generate your password");
		String password = sc.nextLine();

		if (!checkPassword(password)) {
			System.out.println(password + " is an invalid password");
			return;
		} else {
			printPassword(password);
		}
	}
}
