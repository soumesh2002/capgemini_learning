import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date");
		String dateString = sc.nextLine();
		sc.close();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy");
		dateFormat.setLenient(false);

		try {
			dateFormat.parse(dateString);
			System.out.println(dateString + " is a valid date");
		} catch (ParseException e) {
			System.out.println(dateString + " is not a valid date");
		}
	}
}
