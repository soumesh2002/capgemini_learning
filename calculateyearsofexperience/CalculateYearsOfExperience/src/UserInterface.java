import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UserInterface {

	public static boolean ValidDateFormat(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		try {
			Date D1 = dateFormat.parse(date);
			Date D2 = dateFormat.parse("15/12/2020");
			return D1.compareTo(D2) <= 0;
		} catch (ParseException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date D2 = null;

		try {
			D2 = df.parse("15/12/2020");
			System.out.println("Enter the date of joining");
			String dateOfJoining = sc.nextLine();
			Date D1 = df.parse(dateOfJoining);

			if (ValidDateFormat(dateOfJoining)) {
				long expms = D2.getTime() - D1.getTime();
				long expds = TimeUnit.MILLISECONDS.toDays(expms);
				long expy = expds / 365;
				System.out.println(expy + " years of experience");
			} else {
				System.out.println("Invalid date");
			}
		} catch (ParseException e) {
			System.out.println("Invalid date format");
		}
	}
}
