class StaticMethod{
	static void m1() {
		System.out.println("in m1");
	}
	static void m2(){
		System.out.println("in m2 Method");
		int m =10;
		int n =20;
		System.out.println("in m2 end");
	}
	static void m3(){
		System.out.println("M3 start");
		int m= 30;
		int n= 60;
		System.out.println("m3 End");
	}
	public static void main(String[] args){
		System.out.println("Main start");
		m1();
		m2();
		int m=33;
		int n=44;
		System.out.println("Mm")
	}
}