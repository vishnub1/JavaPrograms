class Example1{
	static int a = 10;
	static int b = 20;

	int x = 30;
	int y = 40;

	public static void main(String[] args){
		int p = 50;
		int q = 60;

		System.out.println("A :"+a);
		System.out.println("B :"+b);

//		System.out.println("X :"+x);  
//		System.out.println("Y:"+y);  non static memebers
		
		Example1 e1 = new Example1();
		System.out.println("x :"+e1.x);
		System.out.println("y :"+e1.y);

		System.out.println("p :"+p);  // directly access the main method values
		System.out.println("q :"+q);

	}
}

