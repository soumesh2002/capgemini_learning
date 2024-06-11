
public class SteelBero extends Bero {
	private int beroHeight;

	public SteelBero(String beroType, String beroColor, int beroHeight) {
		super(beroType, beroColor);
		this.beroHeight = beroHeight;
	}

	public void calculatePrice() {
		double price = 0;
		if (beroHeight == 3) {
			price = 5000;
		} else if (beroHeight == 5) {
			price = 8000;
		} else if (beroHeight == 7) {
			price = 10000;
		}

		setPrice(price);
	}

	public int getBeroHeight() {
		return beroHeight;
	}

	public void setBeroHeight(int beroHeight) {
		this.beroHeight = beroHeight;
	}

}
