class Example5 {
	static void m1(int a){
		System.out.println("Before If ");
		if(a==10){
			System.out.println("in if");
			return;
		}
		System.out.println("After if ");
		System.out.println("Hii");
	}
	static int m2(int a){
		System.out.println("Before if m2");
		if(a == 10){
			System.out.println("in if m2");
			return a + 10;
		}
		System.out.println("After if");
		System.out.println("Hii");
		return 50;
	}
	public static void main(String[] args){
		m1(10);
		m1(20);

		m2(10);
		m2(20);
	}
}