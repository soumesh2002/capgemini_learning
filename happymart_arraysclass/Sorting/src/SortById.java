import java.util.Comparator;
public class SortById implements Comparator<Product> {
// 	public static void sort(Product[] products) {
// 	    for (int i = 0; i < products.length; i++) {
// 	        for (int j = 0; j < products.length - i - 1; j++) {
// 	            if (products[j].productId > products[j+1].productId) {
// 	                Product temp = products[j];
// 	                products[j] = products[j + 1];
// 	                products[j + 1] = temp;
// 	            }
// 	        }
// 	    }
// 	}

    @Override
    public int compare(Product a, Product b) {
        return a.productId - b.productId;
    }
}
