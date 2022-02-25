class B extends A {
	static int b =10;
	static {
		System.out.println("in B SB");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
	}
	public static void main(String[]  args){
		System.out.println("in B Main");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}