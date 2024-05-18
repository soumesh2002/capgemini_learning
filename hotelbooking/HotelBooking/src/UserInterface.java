import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();

		System.out.println("Enter the number of rooms you needed");
		int rooms = sc.nextInt();

		while (rooms < 0) {
			System.err.println("Please enter a valid number");
			rooms = sc.nextInt();
		}

		System.out.println("Enter the phone number");
		long phn = sc.nextLong();

		int RP = 500;

		System.out.println("Pay Rs. " + RP * rooms + " for booking");
		System.out.println("Your booking has been confirmed");
	}
}