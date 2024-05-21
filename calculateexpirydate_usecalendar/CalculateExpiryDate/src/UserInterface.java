import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class UserInterface {

	public static boolean isValidDate(String date) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		dateFormat.setLenient(false);
		try {
			dateFormat.parse(date);
			return true;
		} catch (ParseException e) {
			return false;
		}
	}

	public static String calculateExpiryDate(String manufacturingDate, int validMonth) {
		SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dd1;

		try {
			dd1 = df.parse(manufacturingDate);
		} catch (ParseException e) {
			return manufacturingDate + " is not a valid date";
		}

		Calendar c = Calendar.getInstance();
		// c.getTime();
		c.setTime(dd1);
		c.add(Calendar.MONTH, validMonth);

		Date dd = c.getTime();
		return df.format(dd);

		// Date dd = c.getTime();

		// System.out.println(dd + " is the expiry date");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Manufacturing date");
		String manufacturingDate = sc.nextLine();

		if (!isValidDate(manufacturingDate)) {
			System.out.println(manufacturingDate + " is not a valid date");
			sc.close();
			return;
		}

		System.out.println("Enter the Month");
		int validityMonths = sc.nextInt();

		String expiryDate = calculateExpiryDate(manufacturingDate, validityMonths);
		System.out.println(expiryDate + " is the expiry date");
	}
}
