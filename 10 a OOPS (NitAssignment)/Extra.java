package Extra;

public interface CanFly {
	String type ="A";
	void fly();
	
//	 default String getType() {  //this is also right
	 static String getType() {	
		return type;
	}
}
========================================================================
  package Extra;
class Programmer{  
	float salary=40000;  
}  
public class Employee extends Programmer{  
	int bonus=10000;  
	public static void main(String args[]) {  
		Employee p=new Employee();  
		System.out.println("Programmer salary is:"+p.salary);  
		System.out.println("Bonus of Programmer is:"+p.bonus); 
	}
}
//Programmer salary is:40000.0
//Bonus of Programmer is:10000
  ========================================================================
    package Extra;

public interface Runnable {
	public void run()=->
	{
		System.out.println("Run");
	}
}

  
  ========================================================================
    
    package Extra;
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}
class BabyDog extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}
class TestInheritance {
	public static void main(String args[]) {
		BabyDog d = new BabyDog();
		d.weep();
		d.bark();
		d.eat();
	}
}
//weeping...
//barking...
//eating...
  
  ========================================================================
    
    //what will be the output of the following code?

package Extra;
import java.io.*;
public class Whizlabs {
	public static void main(String[] args) {
		try {
			int whizData[] = new int[10];
			System.out.println("Accessing Element:"+whizData[11]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("OOps...Identified Exception :"+e);
		}
	}
}
//OOps...Identified Exception :
//java.lang.ArrayIndexOutOfBoundsException:
//Index 11 out of bounds for length 10

  
  ========================================================================
    package Extra;

public class Whizlabs1 {
	private String name;
	private boolean pass;
	
	public static void main(String[] args) {
		Whizlabs1 wb = new Whizlabs1();
		System.out.println("name :"+wb.name);
		System.out.println("pass :"+wb.pass);
	}
}

