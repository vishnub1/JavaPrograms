class Example5{
	static int a;
	static void m1(int a){
		//Example5.a=a;
		a= Example5;
		System.out.println(a);
	}
	public static void main(String[] args){
		System.out.println(a);
		m1(40);
		//System.out.println(a);
		
	}
}