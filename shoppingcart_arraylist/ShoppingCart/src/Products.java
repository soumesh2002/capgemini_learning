import java.util.*;

public class Products {

	private List<String> productList = new ArrayList<String>();

	public void addProductToList(String product) {
		productList.add(product);
	}

	public void sortProductList() {
		Collections.sort(productList);
	}

	public void displayProductList() {
		if (productList.isEmpty()) {
			System.out.println("The list is empty");
		} else {
			for (String p : productList) {
				System.out.println(p);
			}
		}
	}

	public List<String> getProductList() {
		return productList;
	}

	public void setProductList(List<String> productList) {
		this.productList = productList;
	}
}