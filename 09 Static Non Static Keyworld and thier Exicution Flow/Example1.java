class Example1 {
	static int a;

	static void m1(int p){
		a =p;
	}
	public static void main(String[] args){
		System.out.println(a);
		m1(50);
		System.out.println(a);
		m1(60);
		System.out.println(a);
	}
}
