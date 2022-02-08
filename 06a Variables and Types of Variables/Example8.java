// local variable cannot be declare as volatile 


class Example8 {
	static volatile int x = 10;
	volatile int y = 10;

	static void m1(){
//		volatile int z = 30;
	}

	public static void main(String[] args)	{
	System.out.println("x:  "+x);
//	System.out.println("y:  "+y);  non static error

		}
}