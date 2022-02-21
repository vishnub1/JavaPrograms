class Example8 {
	static int a=10;
	static int b=20;

	int x = 30;
	int y = 40;

	public static void main(String[] args){
		System.out.println("A :"+a);
		System.out.println("B :"+b);

		System.out.println("A :"+Example.a);
		System.out.println("B :"+Example.b);

		Example8 e = new Example8();
		System.out.println("X :"+e.x);
		System.out.println("Y :"+e.y);

		System.out.println("A :"+e.a);
		System.out.println("B :"+e.b);

//		System.out.println("X :"+Example8.x);
//		System.out.println("Y :"+Example8.y);
		
		Example e1 = null ;
		System.out.println(e1.a);
	//	System.out.println(e1.x);

	}
}