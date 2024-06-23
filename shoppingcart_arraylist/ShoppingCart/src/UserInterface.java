import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Products products = new Products();
		boolean exit = false;

		while (!exit) {
			System.out.println("1.Add");
			System.out.println("2.Display");
			System.out.println("3.Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
				case 1:
					System.out.println("Enter the product");
					String productName = sc.nextLine();
					products.addProductToList(productName);
					break;
				case 2:
					products.displayProductList();
					break;
				case 3:
					exit = true;
					System.out.println("Thank you for using the application");
					return;

				default:
					System.out.println("Invalid Choice");
					break;
			}
		}
	}
}
