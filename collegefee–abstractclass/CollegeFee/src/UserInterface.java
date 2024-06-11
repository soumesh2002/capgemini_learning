import java.util.Scanner;

public class UserInterface {
	static double totalCollegeFee = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id");
		int studentId = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter Student name");
		String studentName = sc.nextLine();

		System.out.println("Enter Department name");
		String departmentName = sc.nextLine();

		System.out.println("Enter gender");
		String gender = sc.nextLine();

		System.out.println("Enter category");
		String category = sc.nextLine();

		if (category.equals("DayScholar")) {
			System.out.println("Enter college fee");
			double collegeFee = Double.parseDouble(sc.nextLine());

			System.out.println("Enter Bus number");
			int busNumber = sc.nextInt();

			System.out.println("Enter the distance");
			int distance = sc.nextInt();

			DayScholar D = new DayScholar(studentId, studentName, departmentName, gender, category, collegeFee,
					busNumber, distance);

			totalCollegeFee = D.calculateTotalFee();

			System.out.printf("Total College fee is %.1f", totalCollegeFee);
		}

		if (category.equals("Hosteller")) {
			System.out.println("Enter college fee");
			double collegeFee = Double.parseDouble(sc.nextLine());

			System.out.println("Enter the room number");
			int roomNumber = sc.nextInt();

			System.out.println("Enter the Block name");
			char blockName = sc.next().charAt(0);
			sc.nextLine();

			System.out.println("Enter the room type");
			String roomType = sc.nextLine();

			Hosteller H = new Hosteller(studentId, studentName, departmentName, gender, category, collegeFee,
					roomNumber, blockName, roomType);

			totalCollegeFee = H.calculateTotalFee();

			System.out.printf("Total College fee is %.1f", totalCollegeFee);

		}
	}
}
