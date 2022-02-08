// local variable must be accessed only after its creation statement because method execution
//is sequential execution from top to bottom if (we access it 
//before its creation its throws an erroe)

class Sample4 {
	static void m1(){
//		System.out.println(a);

		int a;
// 		System.out.println(a);

		a=10;
		System.out.println(a);

	}
	static void m2(){
//		System.out.println("a:"+a);
	}
	
}