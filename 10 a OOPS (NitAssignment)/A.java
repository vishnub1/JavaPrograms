package test;

//6.	Will the code compile successfully? If yes, what will be the output of the code?

public class A {
	void m1(Object o){
		System.out.println("Hello"); 
	}
	void m1(Object o, String s) {
		System.out.println("Java");	 
	}
	public static void main(String[] args) 
	{
		A a = new A();
		a.m1(new Object());
		a.m1(new Object(), new String());
	}
}

