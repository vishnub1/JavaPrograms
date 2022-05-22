package two;

class One { 
	void m1(){ 
		System.out.println("m1 method in class One"); 
	} 
} 
class Two extends One { 
	void m2() { 
		System.out.println("m2 method in class Two"); 
	} 
} 
public class Test { 
	public static void main(String[] args) { 
//		Two t = (Two) new One(); 
		Two t = new Two(); 
		t.m1(); 
		t.m2(); 
	} 
}



package two;

class One1 { 
	void m1() { 
		System.out.println("m1 method in class One"); 
	} 
} 
class Two1 extends One1{ 
	void m2() { 
		System.out.println("m2 method in class Two"); 
	} 
} 
public class Test2 { 
	public static void main(String[] args) { 
		One1 o = new Two1();  
		Two1 t = (Two1)o;  
		t.m1();  
		t.m2(); 
	} 
}



package two;

class A {
	public void m1(){ 
		System.out.println("m1-X"); 
	} 
} 
class B extends A { 
//	void m1(){ Error
	void m2(){ 
		System.out.println("m1-Y"); 
	} 
} 
public class Z { 
	public static void main(String[] args) { 
		B b = new B(); 
		b.m1();  // m1-X	
		b.m2();	 // m1-Y
	} 
}


