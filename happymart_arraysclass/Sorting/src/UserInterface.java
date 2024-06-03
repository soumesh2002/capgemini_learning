import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;

public class UserInterface {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the products count");
		int npr = sc.nextInt();
		sc.nextLine();
		
		if (npr <= 0) {
		    System.out.println("Invalid count");
		    return;
		}
		
		Product[] products = new Product[npr];
// 		SortById sortById = new SortById();
// 		SortByPrice sortByPrice = new SortByPrice();
		
		System.out.println("Enter Product details");
		for (int i = 0; i < npr; i++) {
		    String[] input = sc.nextLine().split(":");
		    int productId = Integer.parseInt(input[0]);
		    String productName = input[1];
		    double price = Double.parseDouble(input[2]);
		    products[i] = new Product(productId, productName, price);
		}
		
		System.out.println("\n1. Sort By Id\n2. Sort By Price");
		System.out.println("Enter your choice: ");
		int choice = sc.nextInt();
		Comparator<Product> comparator = null;
		
		switch (choice) {
		    case 1:
		        comparator = new SortById();
		        break;
            case 2:
                comparator = new SortByPrice();
                break;
            default:
                System.out.println("Invalid choice");
                return;
		}
		
		Arrays.sort(products, comparator);
		
		if (choice == 1) {
		   System.out.println("After Sorting by Id");
		} else {
		    System.out.println("After Sorting by price");
		}
		
		for (Product product : products) {
		    System.out.println(product.toString());
		}
	}
}
