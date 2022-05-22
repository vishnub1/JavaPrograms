public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Ravi");
		
		Manager m1 = new Manager(e1);
		m1.show();
	}
}
