// local variable can not declare as transient.

class Example7 {
	static transient int x = 10;
	transient int y = 20;

	static void m1(){
		transient int z = 30;
	}
}
