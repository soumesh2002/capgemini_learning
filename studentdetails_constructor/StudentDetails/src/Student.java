
public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private String collegeName;

	public String toString() {
		return "Name: " + getStudentName() + " Address: " + getStudentAddress() + " College Name: " + getCollegeName();
	}

	public Student(int studentId, String studentName, String studentAddress, String collegeName) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = collegeName;
	}

	public Student(int studentId, String studentName, String studentAddress) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.collegeName = "NIT";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentID) {
		this.studentId = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

}
