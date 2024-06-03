import java.util.Comparator;
public class SortByPrice implements Comparator<Product> {
// 	public static void sortprice(Product[] products) {
// 	    for (int i = 0; i < products.length - 1; i++) {
// 	        for (int j = 0; j < products.length - i - 1; j++) {
// 	            if (products[j].price > products[j + 1].price) {
// 	                Product temp = products[j];
// 	                products[j] = products[j + 1];
// 	                products[j + 1] = temp;
// 	            } else if (products[j].price == products[j + 1].price && products[j].productId > products[j + 1].productId) {
// 	                Product temp = products[j];
// 	                products[j] = products[j + 1];
// 	                products[j + 1] = temp;
// 	            }
// 	        }
// 	    }
// 	}
    
    @Override
    public int compare(Product a, Product b) {
        return (int)(a.price - b.price);
    }
}
