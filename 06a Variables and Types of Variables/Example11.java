//NON sataic variable and life time and scope

class Example11 {
	static int a = 10;
	static void m1(){
		Example11 e2 = new Example11();
		System.out.println("3rd a"+e2.a);
	}
	public static void main(String[] args){
		System.out.println("1st a"+a);

		Example11 e1 = new Example11();
		System.out.println("2nd a"+e1.a);
		m1();
	}
}