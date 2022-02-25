class A{ 
	static int a=10;
	static {
		System.out.println("in A SB");
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
	}
	public static void main(String[] args){
		System.out.println("A main");
		System.out.println("a:"+a);
		//System.out.println("b:"+b);
	}
}
