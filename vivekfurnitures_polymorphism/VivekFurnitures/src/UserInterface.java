import java.util.Scanner;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double totalPrice = 0;
		Discount d = new Discount();

		System.out.println("Enter Customer Name");
		String customerName = sc.nextLine();

		System.out.println("Enter Phone Number");
		long phoneNumber = Long.parseLong(sc.nextLine());

		System.out.println("Enter address");
		String customerAddress = sc.nextLine();

		System.out.println("Enter Bero Type");
		String beroType = sc.nextLine();

		if (beroType.equals("Steel Bero")) {
			System.out.println("Enter Bero Colour");
			String beroColor = sc.nextLine();

			System.out.println("Enter Bero Height");
			int beroheight = sc.nextInt();

			SteelBero sb = new SteelBero(beroType, beroColor, beroheight);
			sb.calculatePrice();

			totalPrice = sb.getPrice() - d.calculateDiscount(sb);

			System.out.printf("Amount needs to be paid %.2f", totalPrice);

		} else if (beroType.equals("Wooden Bero")) {
			System.out.println("Enter Bero Colour");
			String beroColor = sc.nextLine();

			System.out.println("Enter Wood Type");
			String woodType = sc.nextLine();

			WoodenBero wb = new WoodenBero(beroType, beroColor, woodType);
			wb.calculatePrice();

			totalPrice = wb.getPrice() - d.calculateDiscount(wb);
			System.out.printf("Amount needs to be paid %.2f", totalPrice);

		} else {
			System.out.println(beroType + " is an invalid bero type");
		}

	}
}
