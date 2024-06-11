import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the customer name");
		String customerName = sc.nextLine();

		System.out.println("Enter the phone number");
		String phoneNumber = sc.nextLine();

		System.out.println("Enter the street name");
		String streetName = sc.nextLine();

		System.out.println("Enter the bill amount");
		double billAmount = sc.nextDouble();

		System.out.println("Enter the distance");
		int distance = sc.nextInt();

		CustomerDetails CD = new CustomerDetails(customerName, phoneNumber, streetName, billAmount, distance);
		CD.setCustomerName(customerName);
		CD.setPhoneNumber(phoneNumber);
		CD.setStreetName(streetName);
		CD.setBillAmount(billAmount);
		CD.setDistance(distance);

		System.out.println("Customer name: " + CD.getCustomerName());
		System.out.println("Phone number: " + CD.getPhoneNumber());
		System.out.println("Street name: " + CD.getStreetName());
		System.out.printf("Bonus points: %.1f\n", CD.calculateBonusPoints());
		System.out.printf("Delivery charge: %.1f", CD.deliveryCharge());
	}
}
