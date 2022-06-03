Polymorphism :-
------------------------------
It is Greek word whose meaning is "SAME OBJECT HAVING DIFFERENT BEHAVIOR".

Poly = Many 

morphism = Forms

void person(Walking)
void person(Running)
void person(Sleeping)
void person(Moving)
void person(Riding)
----------------------------
Poly means "many" and morphism means "form". It is a Greek word whose meaning is "SAME OBJECT HAVING DIFFERENT BEHAVIOR"

In our real life a person or a human being can perform so many task similarly in our programming languages a method or a constructor can perform so many task.

Polymorphism can be divided into two categories :

1) Compile time Polymorphism OR Static Polymorphism or early binding

2) Run time Polymorphism OR Dynamic Polymorphism or late binding

Compile time polymorphism :-
----------------------------------
The polymorphism which exist at the time of compilation is called static polymorphism. In static polymorphism compiler has a very good idea that which method is invoked depending upon the type of parameter we have passed in the method.

This type of preplan polymorphism is called static or compile time polymorphism.

Ex:-  Method Overloading

Runtime polymorphism :-
----------------------------
The polymorphism which exist at runtime is called dynamic polymorphism. In dynamic polymorphism, compiler does not have any idea that which method is invoked, at runtime only the JVM will decide that which method is invoked depending upon the class type.

This type of polymorphism is called dynamic or Runtime polymorphism Or dynamic method dispatch.

Eg:- Method Overriding


Method Overloading :-
---------------------------------------
Writing two or more methods in the same class or in the super nd sub class in such a way that the method name must be same and argument must be different is called method overloading.

While working with method overloading we can change the return type of the method.
---------------------------------------------------------------------------------------------------------------
//program on constructor Overloading
package polymorphism;
class Add{
	Add(int a,int b){
		System.out.println("sum of two number :"+(a+b));
	}
	Add(int a,int b,int c){
		System.out.println("sum of three no :"+(a+b+c));
	}
}
public class StaticPoly {
	public static void main(String[] args) {
		Add a1 = new Add(1,3,4);
		Add a2 = new Add(3,4);
	}
}
//sum of three no :8
//sum of two number :7

---------------------------------------------------------------------------------
//Program on method overloading
package polymorphism;
class Addition {
	int add(int a1,int a2){
		int a3 = a1+a2;
		return a3;
	}
	float add(float f1,float f2){
		float f3 = f1+f2;
		return f3;
	}
}
class MethodOverload1 {
	public static void main(String args[]) {
		Addition a = new Addition();
		int x = a.add(12,34);
		float y =a.add(2.45f,2.11f);
		System.out.println("Addition of two int is :"+x);
		System.out.println("Addition of two float is :"+y);
	}
}
//sum of three no :8
//sum of two number :7
---------------------------------------------------------------------------------
While working with method Overloading if the same literal can assign to 2 or more methods then it will give more priority  to the nearest data type Or in other words child priority is more than parent priority

package polymorphism;
class Test{
	public void check(int b){
		System.out.println("int executed");
	}
	public void check(long s) {
		System.out.println("long executed");
	}
}
class OverLoadCheck1 {
	public static void main(String[] args) {
		Test t = new Test();
		t.check(672323992);
	}
}
//int executed
---------------------------------------------------------------------------------
package polymorphism;

class Test1 {
	public void check(String b)	{
		System.out.println("String executed");
	}
	public void check(Object s) {
		System.out.println("Object executed");
	}
}
public class OverLoadCheck2 {
	public static void main(String [] args){
		Test1 t = new Test1();
		t.check("Naresh");
	}
}
//String executed
---------------------------------------------------------------------------------
var-args in java :
-------------------

It stands for variable arguments. It is actually an array variable which can hold 0 parameter to n number of parameters of same type.

It is represented by ... (exactly 3 dots).By using this var-args conecpt, now we need to define only one method body for accepting different kinds of parameter.


var-args must be only one argument as well as last argument in the method otherwise there will be a compilation error.
----------------------------------------------------------------------------------
package var_args;
class Test{
	public void input(int ...a) {
		System.out.println("Executed");
	}
}

public class VarArgs {
	public static void main(String[] args) {
		Test t = new Test();
		t.input();
		t.input(5);
		t.input(5,10);
		t.input(5,10,20);
	}
}
//Executed
//Executed
//Executed
//Executed
---------------------------------------------------------------------------------
//program to add paameter values
package var_args;

class Test {
	public void input(int ...a) { //a[0] =5       a[1]=10
		int total = 0;
		for (int b : a ) {
			total = total + b;    
		}
		System.out.println("Sum of parameter is :"+total);
	}	
}
class VarArgs {
	public static void main(String... args)	{
		Test t = new Test();
		t.input();
		t.input(5);
		t.input(5,10);	
		t.input(5,10,15);
		t.input(5,10,15,20);
	}
}
//Sum of parameter is :0
//Sum of parameter is :5
//Sum of parameter is :15
//Sum of parameter is :30
//Sum of parameter is :50
----------------------------------------------------------------------------------
//var args must be last and only one parameter
package var_args;
class Test {
	public void input(int x, int ...a) {
		for (int z : a ){
			System.out.println(z);
		}
	}	
}
class VarArgs {
	public static void main(String... args) {
		Test t = new Test();
		t.input(5,10,15,20,30);
	}
}
//10
//15
//20
//30
---------------------------------------------------------------------------------------------
Method Overriding :
-------------------------------------

Writing two or more methods in super and sub class in such a way that method signature (Method name along with parameter) must be same is called Method Overriding.

Method Overriding is only possible with inheritance, if there is no inheritance there is no method overriding.

Generally we can't change the return type of the method while overriding a method but from JDK 1.6 onwards we can change the return type of the method by using a concept called Co-variant.

Advantage of Method Overriding :
----------------------------------------
The advantage of method overriding is, Each class can specify its own behavior without changing the method name.

-----------------------------------------------------------------------------------------------------
package overriding;

class Animal{
	void eat() {
		System.out.println("I can't say");
	}
}
class Dog extends Animal{
	void eat() {
	System.out.println("Non-veg");
	}
}
public class AnimalDemo {
	public static void main(String[] args) {
	Animal a = new Dog();
	a.eat();
	}
}
//Non-veg
------------------------------------------------------------------------------------
@Override Annotation :
-------------------------------------------
It is a new Feature introduced in java from jdk 1.5 onwards. It is different from comment beacuse it ensures the compiler as well as User that the method is an overriden method and It must be available in the super class.

If we use @Override annotation and If we are not overriding the method from super class then compiler will generate an error.

It is optional but recomended.


package overriding;

class RBI{
	void loan() {
		System.out.println("Bank should provid loan.");
	}
}
class SBI extends RBI{
	@Override
	void loan() {
		System.out.println("SBI provides loan @9.2%");
	}
}
class BOB extends RBI{
	@Override
	void loan() {
		System.out.println("BOB provides loan @8.5%.");
	}
}
public class RBIDemo {
	public static void main(String[] args) {
	//Dynamic Methid dispatch
		RBI r;
		r=new SBI();
		r.loan();
		
		r=new BOB();
		r.loan();
	}
}
//SBI provides loan @9.2%
//BOB provides loan @8.5%.

------------------------------------------------------------------------------------
package com.ravi. dynamic;
package overriding;

class Shape{
	void draw() {
		System.out.println("I dont know what it will draw");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Rectangle..");
	}
}
class Square extends Shape{
	@Override
	void draw() {
		System.out.println("Drawing Square..");
	}
}
public class ShapeDemo {
	public static void main(String[] args) {
		Shape s1;
		s1 = new Rectangle();
		s1.draw();
		
		s1 = new Square();
		s1.draw();
	}
}
//Drawing Rectangle..
//Drawing Square..

------------------------------------------------------------------------------------------------------------------------------------
Role of access modifiers while overriding a method :-
-------------------------------------------------------------------------------
Method Overriding is only possible with inheritance, if there is no inheritance there will not be method overriding so private access modifer is not allowed at overriding.

While overriding a method the access modifier of sub class method must be greater or equal to the access modifer of super class method.

The following statement described the access modifer from greater to less

public > protected > default

(public is greater than protected, protected is greater than default)
-----------------------------------------------------------------------------------
package com.ravi.dynamic;

package modifiers;

class A{
	public void show()	{
		System.out.println("Super class show method");
	}
}
class B extends A{
	protected void show() { //error
		System.out.println("Sub class show method");
	}
}

public class AccessModifierDemo {
	public static void main(String[] args)	{
		A a = new B();  
		a.show();
	}
}
-----------------------------------------------------------------------------------
Co-variant in Java :
----------------------------------
In general we can't change the return type of the method while overriding a method.

From JDK 1.6 onwards Java software people has provided a new concept called Co-variant through which we can change the return type of the method.

We can change the return type of the method using co-variant , co-variant describes the return type of the method must be in inheritance relationship.

The following program describes we can't change the return type of the method while overriding a method.

class Shape{
	void draw(){
		System.out.println("Don't know about the shape...");
	}
}
class Rect extends Shape{
	@Override
	int draw()	{ //we can't change return type here
       System.out.println("Drawing Rectangle....");
	   return 0;
	}
}
public class CoVariant {
	public static void main(String[] args)	{
		Shape s1 = new Rect();
		s1.draw();
	}
}

The following describes we can change the return type of the method while overriding by implementing Co-variant concept 

class Base{
	Object show(){
		System.out.println("Base class show method");
		return new String();
	}
}
class Derived extends Base{
	@Override
	java.util.Date show()	{
		System.out.println("Derived class show method");
		return null;
	}
}
public class CoVariant {
	public static void main(String[] args)	{
	   Base b = new Derived(); 
	   b.show();	
	}
}
//Derived class show method
----------------------------------------------------------------------------------------------
public class Test {
	public static void main(String[] args)	{
		Test t1 = new Test();
		System.out.println(t1);  //output is Ravi
	}

	@Override
	public String toString(){
		return "Ravi";
	}
}
Note :- IN java whenever we pass an Object reference to System.out.println() then it will invoke the toString() method of Object class but if we override the toString() method in our own class then we will get the output of our own class
as shown in the above program.
----------------------------------------------------------------------------------------------
final keyword :- (To provide some restriction)
-----------------------------
To declare a class as a final :- 
--------------------------------
We can't inherit final class. When the class composition is very important and if we don't want the share the features and properties of class then we should declare a class as a final class.

If we declare a class as a final its variables can be modified, only the class behaviour is final.

package com.ravi.finaldemo;

 final class A{
	private int x=100;
	
	public void setData(){
		x = 120;
		System.out.println(x);//120 
	}
}
class B extends A { //error

}
public class FinalClassEx {
	
	public static void main(String[] args)	{
		B b1 = new B();
		b1.setData();		
	}
}
----------------------------------------------------------------------------------------------
To declare a method as a final :
--------------------------------------------------------
If a method is declared as final we can't override the method  in the sub class. We should declare a method as final when we don't want to change the method body in the sub class method implementation.


class A{
	int a = 10;
	int b = 20;
	final void calculate()  {
		int sum = a+b;
		System.out.println("Sum is :"+sum);
	} 
}
class B extends A {
	@Override
	void calculate() {//error 
		int mul = a*b;
		System.out.println("Mul is :"+mul);
	}
}
public class FinalMethodEx {
	public static void main(String[] args)	{
		A a1 = new B();
		a1.calculate();
	}
}

---------------------------------------------------------------------------------------------

To declare a field (variable) as a final :
----------------------------------------------------------------------
We cannot perform re-assignment to a final variable. The final variable we write by uppercase letter in java.

class A {
	final int A = 10;
	
	public void setData() {
//		 A = 10; //error re-assignment is not possible
		 System.out.println("A value is :"+A);
	}
}
public class FinalVarEx {
	public static void main(String[] args){
		A a1 = new A();
		a1.setData();
	}
}
//A value is :10
