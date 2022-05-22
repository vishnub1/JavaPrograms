package test;

public class E {
	void m1(int i){
		System.out.println("Hello"); 
	}
	void m1(Double d){
		System.out.println("Java");	 
	}
	public static void main(String[] args){
		A a = new A();
		a.m1(new Integer(25));
	}
}
