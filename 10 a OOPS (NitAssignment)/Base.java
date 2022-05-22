package base;

public class Base1 {
	public Base1() {
		System.out.println("Constructor of Base1");
	}
	public void show() {
		System.out.println("Method of class Base1");
	}
}


package base;

class Base2 extends Base1 {
	Base2(){
		System.out.println("Constructor of Base2");
	}
	public void show() {
		System.out.println ("method of class Base2");
	}
}


package base;

class Base3 extends Base2 {
	Base3(){
		System.out.println("Constructor of Base3");
	}
	public void show(){
		System.out.println("method of class Base3");
	}
}


package base;

public class Derive {
   public static void main (String args []) {
       Base1 obj1 = new Base1();
       Base1 obj2 = new Base2();
       Base2 obj3 = new Base3();
       obj1.show();
       obj2.show();
       obj3.show();
   }
}



