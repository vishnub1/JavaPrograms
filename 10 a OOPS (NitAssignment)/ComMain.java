
public class ComMain {
	public static void main(String[] args) {
		Company c1 = new Company();
		c1.setCompanyName("Google");
		c1.setCompanyLocation("Cilicon Velly");
		
		Employee e1 = new Employee(12, "Sundar Pichai","India", 140000, c1);
		e1.showEmployeeData();
	}
}
