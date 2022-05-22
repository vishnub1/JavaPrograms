package test;

public class D {
	void m1(Integer i) {
		System.out.println("Hello"); 
	}
	void m1(Double d) {
		System.out.println("Java");	 
	}
	public static void main(String[] args) {
		D d = new D();
		d.m1((Integer) new Object());
	}
}

