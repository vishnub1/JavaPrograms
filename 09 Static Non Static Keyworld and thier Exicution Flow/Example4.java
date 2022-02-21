class Example4 {
	static int a=10;
	public static void main(String[] agrs){
		int a=20;
		a=a;
		// Example.a =a;                //available
		System.out.println("a..."+a);    //20
		System.out.println(Example4.a);  //10

	}
}

