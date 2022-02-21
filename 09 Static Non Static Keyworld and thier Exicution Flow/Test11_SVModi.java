class Example {
	static int a =10;
	static void m1(){
		a = 50;
	}
	static void m2(){
		System.out.println("From m2 a :"+a);
	}
}
class Test11_SVModi {
	public static void main(String [] args){
		System.out.println("Original value");
		System.out.println("From mm a :"+Example.a);
		Example.m2();

		Example.m1();

		System.out.println("\n After modifying a val m1 ");
		Example.m2();

		Example.a =60;
	}
}