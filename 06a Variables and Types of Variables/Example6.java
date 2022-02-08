class Example6 {
	static int a = 10;
	static final int b = 20;

	int x = 30;
	final int y = 40;

	public static void main(String[] agrs){

		System.out.println("a :"+a);
		System.out.println("b :"+b);

//		System.out.println("x :"+x);  non static variable
//		System.out.println("y :"+y);  final local variable

		Example6 e1 = new Example6();
		System.out.println("x :"+e1.x);
		System.out.println("y :"+e1.y);

		int p = 50;
		final int q = 60;

		final int r;
		r = 191;
	//	r = 220;  error: variable r might already have been assigned

		// q = 70;  final keyword error

	}
}