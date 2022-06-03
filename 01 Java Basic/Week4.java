
-----------------------------------------------------------------------------------------------
Abstract class and abstract methods :
--------------------------------------------

public void input()   //general method OR instance method OR Concrete mehod
{

}

abstract void input();   //abstract method
----------------------------------------------------------------------------------------------
Abstract class and abstract method  :-
-------------------------------------------------------------------

A class that does not provide complete implementation (partial implementation) is defined as an abstract class.

An abstract method is a common method which is used to provide easiness to the programmer because the programmer faces complexcity to remember the method name.

An abstract method observation is very simple because every abstract method contains abstract keyword, abstract method does not contain any body and at the end there must be a terminator 
i.e ; (semicolon)

In java whenever action is common but implementations are different then we should use abstract method, Generally we declare abstract method in the super class and its implementation must be provided in the sub class.

if a class contains atleast one method as an abstract method then we should compulsory declare that class as an abstract class.

Once a class is declared as an abstract class we can't create an object for that class.

All the abstract methods declared in the super class must be overridden in the child class otherwise the child class will become as an abstract class hence object can't be created for the child class as well.

*An abstract class may or may not have an abstract method but 
an abstract method must have abstract class.
-----------------------------------------------------------------------------------------------------------------------------------

abstract class Shape {
	abstract void draw();  //common method
}

class Rectangle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing Rectangle....");
	}	
}

class Square extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing square...");		
	}	
}

public class ShapeDemo {
	public static void main(String[] args) {
		Shape s1;
		
		s1 = new Rectangle(); s1.draw();
		
		s1 = new Square(); s1.draw();
	}
}
//Drawing Rectangle....
//Drawing square...
-----------------------------------------------------------------------------------------------
//Interview Question

package com.ravi.abstractdemo;

abstract class Car {
	int speed = 60;
	
	Car() {
		System.out.println("Default constructor");
	}
		
	public void getDetails() {
		System.out.println("It has 4 wheels");
	}
	abstract void run();
}
class Naxon extends Car {
	@Override
	void run() 	{
		System.out.println("Running safely");		
	}	
}

public class IQ {

	public static void main(String[] args)	{
		Car c = new Naxon();
		System.out.println("Nexon Speed is :"+c.speed);
		c.getDetails();
		c.run();
	}
}
//Default constructor
//Nexon Speed is :60
//It has 4 wheels
//Running safely
---------------------------------------------------------------------------------------------
package com.ravi.abstractdemo;

abstract class AA {
	abstract void show();
	abstract void demo();
}
abstract class BB extends AA {
	@Override
	void show() { // + demo();
	  System.out.println("Show method is implemented here...");
	}
}
class CC extends BB {
	@Override
	void demo()	{
		System.out.println("Demo method is implemented here");
	}
}
public class AbstractDemo {

	public static void main(String[] args) 	{
		CC c1 = new CC();
		c1.show();
		c1.demo();
	}
}
//Show method is implemented here...
//Demo method is implemented here
----------------------------------------------------------------------------

package com.ravi.shapedemo;

import java.util.Scanner;

public abstract class Shape {
	Scanner sc = new Scanner(System.in);
	abstract void input();
	abstract void area();  
}

package com.ravi.shapedemo;

public class Rectangle extends Shape {
    int length, breadth;
	@Override
	void input() {
		System.out.print("Enter the value of length :");
		length = sc.nextInt();
		
		System.out.print("Enter the value of breadth :");
		breadth = sc.nextInt();	
	}
	@Override
	void area() {
		int area = length*breadth;
		System.out.println("The area of Rectangle is :"+area);
	}
}

package com.ravi.shapedemo;

public class Square extends Shape {
    int side;
    @Override
	void input(){
    	System.out.print("Enter the value of side for Square :");
		side = sc.nextInt();
	}

	@Override
	void area() {
		int area = side*side;
		System.out.println("The area of Square is "+area);
	}
}

package com.ravi.shapedemo;

public class ShapeDemo {

	public static void main(String[] args)	{
		Shape s1;
		s1 = new Rectangle();
		s1.input();	s1.area();
		
		s1 = new Square();
		s1.input();	s1.area();
	}
}
//Enter the value of length :12
//Enter the value of breadth :23
//The area of Rectangle is :276
//Enter the value of side for Square :40
//The area of Square is 1600


Some important points to remember :-
---------------------------------------------------------------------
1) An abstract method can't be declare private, final and static.

2) An abstract method can't be declare as synchronized.

3) static variables and static methods we can declare inside the abstract class.

4) we can declare constructor, variables and general method inside a abstract class.
------------------------------------------------------------------------------------------------------------------------------------
