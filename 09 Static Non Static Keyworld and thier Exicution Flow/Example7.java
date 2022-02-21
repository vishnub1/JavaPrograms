class Example7 {
	static {
		System.out.println("SB");
	}
	public static void main(String[] args){
		System.out.println("SB");
	}
	static int a=m1();

	static int m1(){
		System.out.println("static");
		return 10;
	}
	
}