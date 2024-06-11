
public class CustomerDetails implements BonusPoints, DoorDelivery {
	private String customerName;
	private String phoneNumber;
	private String streetName;
	private double billAmount;
	private int distance;

	public CustomerDetails(String customerName, String phoneNumber, String streetName, double billAmount,
			int distance) {
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.streetName = streetName;
		this.billAmount = billAmount;
		this.distance = distance;
	}

	public double calculateBonusPoints() {
		double BonusPoints = 0;
		if (billAmount >= 250) {
			BonusPoints = billAmount / 10;
		} else {
			return 0;
		}
		return BonusPoints;
	}

	public double deliveryCharge() {
		double deliveryCharge = 0;

		if (distance >= 25) {
			deliveryCharge = distance * 8;
		} else if (distance >= 15 && distance < 25) {
			deliveryCharge = distance * 5;
		} else {
			deliveryCharge = distance * 2;
		}

		return deliveryCharge;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public double getBillAmount() {
		return billAmount;
	}

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
}
