
public class Hosteller extends Student {
	private int roomNumber;
	private char blockName;
	private String roomType;
	private int roomFee = 0;
	private int hostelFee = 0;

	public Hosteller(int studentId, String studentName, String department, String gender, String category,
			double collegeFee, int roomNumber, char blockName, String roomType) {
		super(studentId, studentName, department, gender, category, collegeFee);
		this.roomNumber = roomNumber;
		this.blockName = blockName;
		this.roomType = roomType;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public char getBlockName() {
		return blockName;
	}

	public void setBlockName(char blockName) {
		this.blockName = blockName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double calculateTotalFee() {
		if (blockName == 'A') {
			hostelFee = 60000;
			if (roomType.equals("AC")) {
				roomFee = 8000;
			} else if (roomType.equals("Non-AC")) {
				roomFee = 0;
			}
		} else if (blockName == 'B') {
			hostelFee = 50000;
			if (roomType.equals("AC")) {
				roomFee = 5000;
			} else if (roomType.equals("Non-AC")) {
				roomFee = 0;
			}
		} else if (blockName == 'C') {
			hostelFee = 40000;
			if (roomType.equals("AC")) {
				roomFee = 2500;
			} else if (roomType.equals("Non-AC")) {
				roomFee = 0;
			}
		}

		return collegeFee + hostelFee + roomFee;
	}
}
