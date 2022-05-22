package test;

public class B {
	void m1(Integer i){
		System.out.println("Hello"); 
	}
	void m1(Object o){
		System.out.println("Java");	 
	}
	public static void main(String[] args){
		B b = new B();
		b.m1(null);
		b.m1(12);
		b.m1("Vishnu");
	}
}
