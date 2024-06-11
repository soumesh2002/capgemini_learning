
public class Discount {

	public double calculateDiscount(Bero bObj) {
		double discount = 0;
		if (bObj instanceof SteelBero) {
			discount = 0.10 * bObj.getPrice();
		} else if (bObj instanceof WoodenBero) {
			discount = 0.15 * bObj.getPrice();
		}

		return discount;
	}
}
