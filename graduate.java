package studentOrganize;

public class graduate extends student {
	private String degree;
	private String concentration;
	private int years;
	public graduate(String major, double gpa, String degree, String concentration,int years) {
		super(major, gpa, 0);
		this.concentration = concentration;
		this.degree = degree;
		this.years = years;
	}
	public String getDegree() {
		return degree;
	}
	public String getConcentration() {
		return concentration;
	}
	public int getYears() {
		return years;
	}
	
}
