class A{
	static int a =10;
	static int b =10;
}
class B{
	static int a =10;
	//int a =10;
	int b =10;
	//int b =30;
}
class C{
	static int a =10;
	static void m1(){
		int a =10;
	}
}
class D{
	static int a =10;

	static void m1(){
		int a =10;
	}
	static void m2(){
		int a =10;
	}
	static void m3(){
		int a =10;
		//int a =10;
		//a=50;
	}
	static void m4(int a){
		
	}
	//static void m5(int a,int a){  }
	static void m7(int a){
		//int a =10;
		a=10;
	}
	static void m9(){
		System.out.println(a);
	}
}