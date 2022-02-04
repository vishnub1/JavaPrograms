class A {
	void m1(long... ia){
		System.out.println("A long...");
	}
}
class B extends A {
	void m1(int... ia){
		System.out.println("B int...");
		}
}
class VarArgRules_2 {
	public static void main(String[] args){
		B b1 = new B();
		b1.m1();
		b1.m1(5);
		b1.m1(5L);

		A a1 = new B();
		a1.m1();
		a1.m1(5);
		a1.m1(5L);
	}
}
