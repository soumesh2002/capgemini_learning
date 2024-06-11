
public class WoodenBero extends Bero {
	private String woodType;

	public WoodenBero(String beroType, String beroColor, String woodType) {
		super(beroType, beroColor);
		this.woodType = woodType;
	}

	public void calculatePrice() {
		double price = 0;
		if (woodType.equals("Ply Wood")) {
			price = 15000;
		} else if (woodType.equals("Teak Wood")) {
			price = 12000;
		} else if (woodType.equals("Engineered Wood")) {
			price = 10000;
		}
		setPrice(price);
	}

	public String getWoodType() {
		return woodType;
	}

	public void setWoodType(String woodType) {
		this.woodType = woodType;
	}

}
