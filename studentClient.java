package studentOrganize;

public class studentClient {
	public static void main (String args[]) {
		undergraduate John = new undergraduate("CS", 3.75, 40, false);
		graduate Zooey = new graduate("computer science", 4, "Masters", "Bioinformatics", 1);
		System.out.println("John is a(n): \t\t" + John.getYear()+
				"\nHis major is: \t\t"+John.getMajor()+
				"\nHis GPA is: \t\t"+John.getGpa()+
				"\nIs he in honors? \t"+John.getisHonors());
		System.out.println("\nZooey is a graduate student studying: "+Zooey.getConcentration()+
				"\nShe has spent "+Zooey.getYears()+" year(s) in grad school."
				+"\nHer major is: "+Zooey.getMajor());
	}
}
