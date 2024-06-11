import java.util.Scanner;

public class UserInterface {
	public static boolean isValidFormat(String s) {
		return s.matches("SPC[0-9]{3}(0[1-9]|1[0-2])[AP]M");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();

		System.out.println("Enter your ID");
		String ID = sc.nextLine();

		if (!isValidFormat(ID)) {
			System.out.println(ID + " is an Invalid ID");
			return;
		}

		String companyName = ID.substring(0, 3);
		String seatNumber = ID.substring(3, 6);
		int time = Integer.parseInt(ID.substring(6, 8));
		String timeZone = ID.substring(8, 10);

		if (time > 0 && time <= 12) {
			System.out.println("Hi " + name + " your seat number is " + seatNumber + " and the event starts at " + time
					+ "" + timeZone);
		}
	}
}