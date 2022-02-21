// program shows calling static and non static methods

class Example3 {
	static void m1(){
		System.out.println("in M1 Method ");
	}
	void m2(){
		System.out.println("in M2 Method");
	}
	public static void main(String[] args){
		m1();
		//m2(); not static member

		Example3 e = new Example3();
		e.m2();
	}
}