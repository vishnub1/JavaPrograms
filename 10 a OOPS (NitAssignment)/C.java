package test;

public class C {
	void m2(Integer i) {
		System.out.println("Hello"); 
	}
	void m2(String s) {
		System.out.println("Java");	 
	}
	public static void main(String[] args) {
		C c = new C();
		c.m2(null);
	}
}

