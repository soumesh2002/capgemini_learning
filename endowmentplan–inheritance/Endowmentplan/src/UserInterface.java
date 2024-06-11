import java.util.Scanner;

public class UserInterface {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Endowment Id");
		String eID = sc.nextLine();

		System.out.println("Enter Holder Name");
		String holderName = sc.nextLine();

		System.out.println("Enter Endowment Type");
		String ewType = sc.nextLine();

		if (ewType.equalsIgnoreCase("Educational")) {
			System.out.println("Enter Registration Date");
			String regDate = sc.nextLine();

			System.out.println("Enter Educational Institution");
			String eduInstitution = sc.nextLine();

			System.out.println("Enter Educational Division");
			String eduDivision = sc.nextLine();

			double endowmentPrice = new EducationalEndowment(eID, holderName, ewType, regDate, eduInstitution,
					eduDivision).calculateEndowment();

			System.out.printf("Endowment Amount %.2f", endowmentPrice);
		}

		else if (ewType.equalsIgnoreCase("health")) {
			System.out.println("Enter Registration Date");
			String regDate = sc.nextLine();

			System.out.println("Enter Health Care Center");
			String healthCareCenter = sc.nextLine();

			System.out.println("Enter Holder Age");
			int hAge = sc.nextInt();

			double endowmentPrice = new HealthEndowment(eID, holderName, ewType, regDate, healthCareCenter, hAge)
					.calculateEndowment();

			System.out.printf("Endowment Amount %.2f", endowmentPrice);

		} else {
			System.out.println(ewType + " is an invalid endowment type");
			return;
		}
	}

}
