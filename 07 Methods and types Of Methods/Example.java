// Passing object as an argument and return type

class A {}
public class Example7 {
	static void m1(A a){
		System.out.println("M1");
	}
	static A m2(String s){
		System.out.println("m2");
		return new A();
	}
	public static void main(String[] args){
		A a1 = new A();
		m1(a1);

		m2("hari");
		A a2 = m2("Krishna");

		System.out.println("Naresh iT");
	}
}
