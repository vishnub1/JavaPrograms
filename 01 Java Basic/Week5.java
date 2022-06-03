Interface :
--------------------
interface (Upto 1.7) :-
------------------------
An interface is a keyword in java which is similar to a class.

Upto JDK 1.7 an interface contains only abstract method that means there is a gurantee that inside an interface we don't have concrete methods.

In order to implement the member of an interface, java software people has provided implements keyword.

All the methods declared inside an interface is bydefault public and abstract so at the time of overriding we should apply public access modifier to sub class method.

All the variables declared inside an interface is by-default public, static and final.

We should override all the methods of interface to the sub class otherwise the sub class will become as an abstract class hence object can't be created.

We can't create an object for interface, but reference can be created.

By using interfcae we can acheive multiple inheritance in java.

-----------------------------------------------------------------------------------------------
package com.ravi.jdk_seven;

package interfaces;

public interface Moveable {
	int SPEED = 80; //public + static + final
	void move();
}

package com.ravi.jdk_seven;

public class Car implements Moveable {

	@Override
	public void move() {
		//  SPEED =100;   //final variable we can't perform re-assignment
		
		System.out.println("Riding with  "+ SPEED +" km/hr");
	}
}

package com.ravi.jdk_seven;

public class Main {

	public static void main(String[] args) 	{
		Moveable m = new Car();
		m.move();
		
		System.out.println("Car speed is :"+Moveable.SPEED+" km/hr");
	}
}
//Riding with  80 km/hr
//Car speed is :80 km/hr
-------------------------------------------------------------------------------------------------------------------------------------
package com.ravi.jdk_seven;

public interface Client {
   void sum();
   void sub();
   void mul();
}
package com.ravi.jdk_seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Developer implements Client {
	int x, y;
	public void input() throws IOException 	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the value of x :");
		x = Integer.parseInt(br.readLine());

		System.out.print("Enter the value of y :");
		y = Integer.parseInt(br.readLine());
	}

	@Override
	public void sum() {
		int sum = x+y;
		System.out.println("The sum is :"+sum);
	}

	@Override
	public void sub() {
		int sub = x-y;
		System.out.println("The sub is :"+sub);

	}

	@Override
	public void mul() {
		int mul = x*y;
		System.out.println("The mul is :"+mul);
	}
}
package com.ravi.jdk_seven;

import java.io.IOException;

public class TestAppl {

	public static void main(String[] args) throws IOException {
		Developer d = new Developer();
		d.input();
		d.sum();
		d.sub();
		d.mul();
	}
}
----------------------------------------------------------------------------------------------
package com.ravi.loose_coupling;

public interface HotDrink {
    void prepare();
}

package com.ravi.loose_coupling;

public class Tea implements HotDrink {
	@Override
	public void prepare(){
		System.out.println("Preparing Tea....");
	}
}

package com.ravi.loose_coupling;

public class Coffee implements HotDrink {

	@Override
	public void prepare() {
		System.out.println("Preparing Coffee");		
	}
}
package com.ravi.loose_coupling;

public class Horlicks implements HotDrink {

	@Override
	public void prepare() {
		System.out.println("Preparing Horlicks");
	}
}
package com.ravi.loose_coupling;

public class Restaurant {
	public void methodCall(HotDrink hd)	   {
		hd.prepare();
	}
}
package com.ravi.loose_coupling;


public class Main {
	
	public static void main(String[] args)	{
		Restaurant r =new Restaurant();
		
		Tea tea = new Tea();
		r.methodCall(tea);
		
		Coffee coffee = new Coffee();
		r.methodCall(coffee);
		
		Horlicks horlicks = new Horlicks();
		r.methodCall(horlicks);
	}
}
//Preparing Tea....
//Preparing Coffee
//Preparing Horlicks
------------------------------------------------------------------------------------------------------------------------------------
interface (JDK 1.8 onwards) :
-----------------------------------------------------
From JDK 1.8 onwards java compiler allowed to write static and default method inside an interface.

default method we can write inside an interface so we can provide specific implementation for the classes which are implimenting from interface why because we can override default method inside the sub classes.
-------------------------------------------------------------------------------------------------------------------------------------
//Vehicle.java
public interface Vehicle {
	
	void move();
	void horn();
	
	default void digitalMeter()	{
		System.out.println("Digital Meter");
	}
}

//MyCar.java
public class MyCar implements Vehicle {
	@Override
	public void move() 	{
	 System.out.println("Moving with car...");
	}

	@Override
	public void horn()	{
		System.out.println("Pop-Pop");	
	}
	
	public void digitalMeter()	{
	  System.out.println("New Version of car is running with digital meter..");	
	}
}

MyBike.java
public class MyBike implements Vehicle {
	@Override
	public void move(){
		System.out.println("Moving with Bike");
	}

	@Override
	public void horn() {
		System.out.println("Peep-Peep");		
	}
}

//MainDemo.java
public class MainDemo {
	public static void main(String[] args) 	{
		
		Vehicle v;
		
		v = new MyCar();
		v.move();
		v.horn();
		v.digitalMeter();
		
		v = new MyBike();
		v.move();
		v.horn();
	}
}
O/P:
Moving with car...
Pop-Pop
New Version of car is running with digital meter..
Moving with Bike
Peep-Peep

//default method for specific class method implementation

//HotDrink
interface HotDrink {
	void prepare();

	default void expressPrepare() {    //possible from jdk 1.8 
        System.out.println("Preparing with premium");
	}
}

//Tea.java
public class Tea implements HotDrink {
	@Override
	public void prepare() {
		System.out.println("Preparing Tea");
	}
	@Override
	public void expressPrepare() {
        System.out.println("Preparing premium Tea");
	}
}

//Coffee.java
public class Coffee implements HotDrink {
 @Override
  public void prepare()	{
		System.out.println("Preparing Coffee");
	}
}

//DefaultMethod.java
public class DefaultMethod {
	public static void main(String[] args) {
		
		HotDrink hk1 = new Tea();
		HotDrink hk2 = new Coffee();
		hk1.prepare();
		hk1.expressPrepare();
		hk2.prepare();
		hk2.expressPrepare();
	}
}
//Preparing Tea
//Preparing premium Tea
//Preparing Coffee
//Preparing with premium

---------------------------------------------------------------------------------------------------------------------------------
//static method implemntation common for all
interface HotDrink {
	void prepare();

	static void expressPrepare(){ //possible from jdk1.8
		System.out.println("Prepare with no sugar...");
	}	
}
--
class Tea implements HotDrink {
	public void prepare() {
		System.out.println("Preparing Tea");
	}	
}
--

class Coffee implements HotDrink {
  public void prepare()	{
		System.out.println("Preparing Coffee");
	}
}
--
public class StaticMethod {
	
	public static void main(String[] args) {
		HotDrink hk1 = new Tea();
		HotDrink hk2 = new Coffee();
		HotDrink.expressPrepare();
		hk1.prepare();
        hk2.prepare();		
	}
}
--OP
Prepare with no sugar...
Preparing Tea
Preparing Coffee

--------------------------------------------------------------------------------------------------------------------------------

interface Vehicle {
	static void move() 	{
		System.out.println("Static method of Vehicle");
	}
}
public class StaticMethod1 implements Vehicle {

	public static void main(String[] args)	{
		Vehicle.move();  
//		move();         //invalid
//		StaticMethod1.move();  //invalid
		StaticMethod1 sm = new StaticMethod1();   
//		sm.move();    //invalid

	}
}
OP:
Static method of Vehicle
-----------------------------------------------------------------------------------------------------------------------------------
Anonymous class using interfaces :

Implementing an interface without the help of class is called Anonymous class concept in Java.
-----------------------------------------------------------------------------------------------------------------------------------
interface Vehicle {
	void run();
}	    
public class Anonymous {
	public static void main(String [] args)	{
		Vehicle v = new Vehicle() {   //Anonymous inner class
			@Override
			public void run() {
				System.out.println("Running Safely");
			}
		};
		v.run();
	}
}

OP:
Running Safely
-----------------------------------------------------------------------------------------------------------------------------------
@FunctionalInterface :
------------------------------------------
If an interface contains exactly one abstract method then it is called Functional Interface.
-----------------------------------------------------------------------------------------------------------------------------------
@FunctionalInterface
interface Vehicle {
	void run();
}	    
public class Anonymous1 {
	public static void main(String [] args)	{           
		Vehicle car = new Vehicle()	{
			@Override
			public void run(){
				System.out.println("Running Car");
			}
		};			
		car.run();


		Vehicle bike = new Vehicle() {
			@Override
			public void run() {
				System.out.println("Running Bike");
			}
		};			
		bike.run();
	}
}
OP:
Running Car
Running Bike
----------------------------------------------------------------------------------
package interfaces;


public class Anonymous2 {
	public static void main(String [] args) {

		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Running....");
			}
		};
		r.run();
	}
}
OP:
Running....

----------------------------------------------------------------------------

Lambda Expression :-
--------------------------------------
1) It is an anonymous function.

2) It is used to enable functional programming in java.

3) It can be used with functional interface only

4) It is used to concise the code as well as we can remove boilerplate code (duplicate code).

5) If the body of the lambda expression contains only one statement then curly braces are optional.

6) We can also remove the type of the variable.
-----------------------------------------------------------------------------------------------------------------------------------

@FunctionalInterface
interface Moveable {
	void move();
}
public class Lambda1 {
	public static void main(String[] args) {
		Moveable m = () ->
		{	
			System.out.println("moving here......");
		};
		m.move();
	}
}

-------------------------------------------------------------------------------------------------------------------------------------
@FunctionalInterface
interface Calculate {
	void add(int a, int b);
}

public class Lambda2 {
	public static void main(String[] args){
		Calculate c = (a,b)-> 
		{
			System.out.println("Sum is :"+(a+b));
		};
		c.add(12,12);
	}
}
OP:
Sum is :24
-----------------------------------------------------------------------------------
@FunctionalInterface
interface Length {
	int getLength(String str);
}
public class Lambda3 {
	public static void main(String[] args){
		Length l = str -> { 
			return str.length();
		};

		System.out.print("Length is :"+l.getLength("India"));
	}
}
OP:
Length is :5
----------------------------------------------------------------------------------
package interfaces;

@FunctionalInterface
interface Length {
	 int getLength(String str);
}

public class Lambda4 {
	
	public static void main(String[] args) {
		Length l = str -> str.length();		

		System.out.print("Length is :"+l.getLength("Ravi"));
	}
}
OP:
Length is :4
---------------------------------------------------------------------------------------------------------------------------------
Predefined functional interfaces :-
--------------------------------------------------------------
In order to help the programmer to write concise code in day to day programming, java software people has provided following predefined functional interfaces as a part of java.util.function.

1) Predicate
2) Consumer
3) Supplier
4) Function

Predicate<T>
------------------
It is a predefined functional interface through which we can verify one boolean argument value.

@FunctionalInterface
interface Predicate<T>
{
   public abstract boolean test(T t);
}

---------------------------------------------------------------------------------
In general how to check whether a number is even or odd

public boolean test(Integer i) {
   if(i % 2==0)
     return true;
   else
     return false;
}

Now How to write the same code in Lambda Expression
------------------------------------------------------------------------
/*@FunctionalInterface
public interface Predicate<T> 
{
  boolean test(T t);
}
*/


import java.util.function.Predicate;

public class Lambda5 {
	public static void main(String[] args) {
       Predicate<Integer> p = i -> i%2 ==0;

		System.out.println(p.test(10));
		System.out.println(p.test(15));
	}
}
OP:
true
false


/*
@FunctionalInterface
public interface Consumer<T> 
{
  void accept(T x);
}
*/
------------------------------------------------

import java.util.function.*;  
public class Lambda6 { 
	
	public static void main(String[] args){
		Consumer<String> printString = x -> 
		System.out.println(x);
        printString.accept("Ravi"); 

		Consumer<Integer> printInteger = x -> 
		System.out.println(x);
        printInteger.accept(15); 	
	}
}
OP:
Ravi
15

----------------------------------------------------------------------------------
Multiple inheritance we can acheive using interface.
interface A {
	void sum();
}

interface B {
	void sum();
}

class Diamond implements A,B {
	int a,b;
	void input() {
		a=100;
		b=200;
	}
	
	public void sum(){
		int z=a+b;
		System.out.println("The sum of the number is :"+z);
	}
}
public class MultipleInheritance {
	public static void main(String [] args) {
		Diamond d = new Diamond();
		d.input();
		d.sum();
	}
}
OP:
The sum of the number is :300

----------------------------------------------------------------------------------
interface I1 {
	default void m1() {
		System.out.println("Default method of I1 interface...");
	}
}

interface I2 {
	default void m1() {
		System.out.println("Default method of I2 Interface...");
	}
}

class MyClass implements I1,I2 {
	public void m1() {
		System.out.println("m1 method of MyClass");
		I1.super.m1();
		I2.super.m1();
	}
}

class MultipleInheritance {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.m1();
	}
}
//m1 method of MyClass
//Default method of I1 interface...
//Default method of I2 Interface...
