package studentOrganize;

public class undergraduate extends student{
	private boolean isHonors;
	public undergraduate(String major, double gpa, int creditHours, boolean isHonors) {
		super(major, gpa, creditHours);
		this.isHonors = isHonors;
	}
	public boolean getisHonors() {
		return this.isHonors;
	}

}
