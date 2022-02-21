class Example3 {
	static int a=m1();
	static int m1(){
		System.out.println("A variable is created");
		return 10;
	}
	static int m2(){
		System.out.println("B variable is created");
		return 20;
	}
	public static void main(String[] args){
		System.out.println("a.."+a);
		System.out.println("b.."+b);
	}
		static int b=m2();       // where ever dwclare static metho it will execute before the main method
}