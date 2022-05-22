
public class Customer {
	private Customer() {}
	static void m1() {
		System.out.println("m1 static method..");
	}
	public static void main(String[] args) {
		Customer c1 = new Customer();//creating one object
		Customer.m1();
	}
}
