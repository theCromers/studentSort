package studentOrganize;

public class student {
	private String major;
	private double gpa;
	private int creditHours;

	public student(String major, double gpa, int creditHours) {
		this.major = major;
		this.gpa = gpa;
		this.creditHours = creditHours;
	} 
	public String getMajor() {
		return this.major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return this.gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String getYear() {
		if(creditHours<32) {
			return "Freshman";  
		}else if(creditHours>=32 && creditHours<64) {
			return "Sophomore";
		}else if(creditHours>=64 && creditHours<96) {
			return "Junior";
		}else {
			return "Senior";
		}
	}
	public void setCH(int creditHours) {
		this.creditHours = creditHours;
	}
	public int getCH() {
		return this.creditHours;
	}
}
