
public class EducationalEndowment extends Endowment {

	private String educationalInstitution;
	private String educationalDivision;
	// private int endowmentAmount = 0;s

	public EducationalEndowment(String endowmentId, String holderName, String endowmentType, String registrationDate,
			String educationalInstitution, String educationalDivision) {
		super(endowmentId, holderName, endowmentType, registrationDate);
		this.educationalInstitution = educationalInstitution;
		this.educationalDivision = educationalDivision;
	}

	@Override
	public double calculateEndowment() {
		double endowmentAmount = 0;
		if (educationalDivision.equalsIgnoreCase("School")) {
			endowmentAmount = 30000;
		} else if (educationalDivision.equalsIgnoreCase("UnderGraduate")) {
			endowmentAmount = 60000;
		} else if (educationalDivision.equalsIgnoreCase("PostGraduate")) {
			endowmentAmount = 90000;
		}
		return endowmentAmount;
	}

	public String getEducationalInstitution() {
		return educationalInstitution;
	}

	public void setEducationalInstitution(String educationalInstitution) {
		this.educationalInstitution = educationalInstitution;
	}

	public String getEducationalDivision() {
		return educationalDivision;
	}

	public void setEducationalDivision(String educationalDivision) {
		this.educationalDivision = educationalDivision;
	}

	// public int getEndowmentAmount() {
	// return endowmentAmount;
	// }

	// public void setEndowmentAmount(int endowmentAmount) {
	// this.endowmentAmount = endowmentAmount;
	// }

}
