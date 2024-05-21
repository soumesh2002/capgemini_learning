import java.util.Scanner;

public class UserInterface {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name");
		String name = sc.nextLine();

		System.out.println("Enter the age");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("Enter the gender");
		String gender = sc.nextLine();

		System.out.println("Enter the blood group");
		String bloodGroup = sc.nextLine();

		System.out.println("Enter the phone no");
		long phoneNumber = sc.nextLong();

		DonorDetails D1;

		D1 = new DonorDetails(name, age, gender, bloodGroup, phoneNumber);

		System.out.println("Name:" + D1.getName());
		System.out.println("Age:" + D1.getAge());
		System.out.println("Gender:" + D1.getGender());
		System.out.println("Blood group:" + D1.getBloodGroup());
		System.out.println("Phone no:" + D1.getPhoneNumber());
	}
}
