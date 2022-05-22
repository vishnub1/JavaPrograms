package three;
class A { 
	protected static void m1(int a) { 
		System.out.println("m1-X"); 
	} 
} 
class B extends A { 
	static void m1(int y) { 
		System.out.println("m1-Y"); 
	} 
} 
public class MyTest { 
	public static void main(String[] args) { 
		A a = new B(); 
		a.m1(10); 

		B b = new B(); 
		b.m1(20); 
	} 
}


package three;

class X { 
	public Object m1(char c) { 
		System.out.println("m1-X"); 
		return new X(); 
	} 
} 
class Y extends X {  
	public StringBuffer m1(char c) { 
		System.out.println("m1-Y"); 
		return null; 
	} 
} 
public class XY { 
	public static void main(String[] args) { 
		X x = new Y(); 
		x.m1('a');  //m1-Y

		X x1 = new X(); 
		x1.m1('b'); //m1-X
	} 
}
//m1-Y
//m1-X


