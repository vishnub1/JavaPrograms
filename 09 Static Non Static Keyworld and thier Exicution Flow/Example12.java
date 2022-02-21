// call variable via non static methods
class Example12 {
	static int a=10;
	static {
		System.out.println("a sb :"+a);
		System.out.println("b sb :"+getB());
	}
	public static void main(String[] args){
		System.out.println("a main :"+a);
		System.out.println("b main:"+b);
	}
	static int getB(){
		return b;
	}
	static int b =20;
}