import java.util.Scanner;

public class UserInterface {
	public static boolean isValidTrainingID(String s) {
		return s.matches("^\\d{9}$");
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the training id");
		String trainingID = sc.nextLine();

		if (trainingID.length() != 9 || !trainingID.matches("\\d{9}")) {
			System.out.println(trainingID + " is an invalid training id");
			return;
		}

		String year = trainingID.substring(0, 4);
		String teamCode = trainingID.substring(4, 6);
		String rollNumber = trainingID.substring(6, 9);

		if (!year.equals("2021")) {
			System.out.println(year + " is an invalid year");
			return;
		}

		String teamC;
		switch (teamCode) {
			case "01":
				teamC = "LP";
				break;
			case "02":
				teamC = "TA";
				break;
			case "03":
				teamC = "CT";
				break;
			case "04":
				teamC = "PT";
				break;
			case "05":
				teamC = "TT";
				break;

			default:
				System.out.println(teamCode + "is an invalid team code");
				return;
		}

		if (rollNumber.equals("000")) {
			System.out.println(rollNumber + " is an invalid roll number");
			return;
		}
		System.out.println("Employee Id: SIET" + teamC + rollNumber);
	}
}