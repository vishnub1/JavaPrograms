class Example6 {
	static void m1(){
		System.out.println("m1");
	}
	static void m2(int a){
		System.out.println("M2 with a");
	}

	public static void main(String[] args){
		m1();
//		m1(50);
		m2(89);
		m2('a');
//		m2(50.32);
		m2('a');
	}
}