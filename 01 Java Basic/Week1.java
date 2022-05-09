Class Loader subsystem with JVM Architectute :-
------------------------------------------------------
The three main component of JVM 

	1) class loader sub system

	2) Runtime Data Areas

	3) Execution engine

In order to load the required .class file, JVM makes a request to class loader sub system. The class loader sub system follows delegation hierarchy algorithm to load the required .class file from different area.

To load the required .class file we have 3 different kinds of class loader

1) Bootstrap class loader

2) Extension/Platform class loader

3) Application/System class loader

Bootstrap class Loader :-
--------------------------------------------
It is responsible to load the required .class file from java API that means all the predefined classes .class file will be loaded by Bootstrap class loader.
It the super class of Extension class loader as well as It has the highest priority among all the class loader.

Extension/Platform  class  Loader :-
---------------------------------------------------------------
It is responsible to load the required .class files from ext (extension) folder. Inside the extension folder we have jar file(Java level zip file) given by some third party or user defined jar file.
It is the super class of Application class loader as well as It has more priority than Application class loader.

Application class Loader :-
---------------------------------------------
It is responsible to load the required .class file from class path level i.e Environment variable. It has lowest priority as well as It is the sub class of Extension class loader.


How Delegation Hierarchy algorithm works :-
----------------------------------------------------------------------------------
Whenever JVM makes a request to class loader sub system to load the required .class file into JVM memory, first of all class loader sub system makes a request to Application class loader, Application class loader will delegate the request to the Extension class loader, Extension class loader will also delegate the request to Bootstrap class loader.
Bootstrap class loader will load the .class file from lib folder(rt.jar) and then by pass the request to extension class loader, Extension class loader will load the .class file from ext folder(*.jar) and by pass the request to Application class loader, It will load the .class file from environment variable into JVM memory. 

Note :- 
If all the class loaders are unable to load the .class file into JVM memory then we will get a Runtime exception i.e java.lang.ClassNotFoundException

-------------------------------------------------------------------------------------------------------------------
Write a program to show that Application class loader is responsible to load our userdefined classes as well as platform class loader is the super class for Application class loader.

class Test 
{
	public static void main(String[] args) 
	{
		System.out.println(Test.class.getClassLoader());

		System.out.println(Test.class.getClassLoader().getParent());
	}
}

-------------------------------------------------------------------------------------------------------------------
Linking :-
-------------
verify :-
-------
It ensures the correctness of the .class files, If any suspicious activity is there in the .class file then It will stop the execution immediately by throwing an exception i.e java.lang.VerifyError.

There is something called ByteCodeVerifier, responsible to verify the .class file i.e byte code. Due to this verify module JAVA is highly secure language.

Prepare :-
-----------
It will allocate the memory for all the static data member, here all the static data member will get the default values so if we have static int x = 100;
then for x we will get the default value i.e 0.

Resolve :-
-----------
All the symbolic references will be converted to direct references.

Initialization :-
-----------------
In Initialization, all the static data member will get their actual value as well as if any static block is available in the class then the static block will be executed here.


static block :-
---------------
It is a very special block in java which will be executed at the time of loading the .class file into JVM memory by class loader subsystem.

The main purpose of static block to initialize the static data member of the class.

static block will be executed only once because class loading is possible only once in java.

If we have multiple static blocks in a class then It will be executed according to order.


//program on static block
----------------------------
class Foo
{
    Foo(){
		System.out.println("Default constructor....");
	}

	{
		System.out.println("Instance block.....");
	}


	static{
		System.out.println("Static block.....");
	}
}
public class StaticBlock {
	public static void main(String[] args) 
	{
		Foo f1 = new Foo();

		Foo f2 = new Foo();
	}
}



//Another program on static block

In the below program we have two separate java files Demo.java and StaticBlockVar.java hence we can declare both the classes as public.

public class Demo {
	static int x;

	static {
		x = 100;
	}

	static {
		x = 200;
	}

	static {
		System.out.println(x);
	}
}
public class StaticBlockVar {
	public static void main(String[] args) {
		Demo d1 = new Demo();
	}
}
O/P  : 200

Note :- We can't execute a java program without main method, Upto jdk 1.6 it was possible to execute a java program without main method be writing the static block. From JDK 1.7 onwards now we can't execute java program without main method.
------------------------------------------------------------------------------------------------------
How to load the .class file Dynamically Or Explicitly :
-------------------------------------------------------
Java software people has provided a predefined class called Class available in java.lang package.

This class contains a predefined static method forName(), through which we can load the required .class file into JVM memory dynamically.

It throws a checked exception i.e java.lang.ClassNotFoundException

Class.forName("Test");   -> try-catch  OR throws

class Foo{
	static	{
        System.out.println("Static block executed.....");
	}
}
class Main {
	public static void main(String[] args) throws Exception{
		Class.forName("Foo");  //Dynamically loading the Foo class
	}
}
-----------------------------------------------------------------------------------------------------
*What is the difference between java.lang.ClassNotFoundException and 
-------------------------------------------------------------------------------
java.lang.NoClassDefFoundError:-
--------------------------------------


java.lang.ClassNotFoundException :-
-----------------------------------------
It occurs when we try to load the required .class file at runtime by using Class.forName() statement and if the required .class file is not available at runtime then we will get an exception i.e java.lang.ClassNotFoundException.

class Demo{
	static {
		 System.out.println("It is a static block...");
	}
}
class ClassNotFoundExceptionDemo {
	public static void main(String[] args) throws Exception {
		Class.forName("Student");
	}
}

Note :- In the above program Student.class file is not available in the current folder so we will get java.lang.ClassNotFoundException
-----------------------------------------------------------------------------------------------------
java.lang.NoClassDefFoundError:-
--------------------------------------
It occurs when the class was present at the time of compilation but at runtime the required .class file is not available(mannually deleted by user) then we will get an exception i.e java.lang.NoClassDefFoundError.

class Message {
	void greet() {
		System.out.println("Hello learner!!!!");
	}
}

class NoClassDefFoundErrorDemo {
	public static void main(String[] args) {
		Message m = new Message();
		m.greet();
	}
}

Note :- delete the Message.class file after compilation and then execute the program.
--------------------------------------------------------------------------------------------------------------------------------------
What is the drawback of new keyword :-
---------------------------------------------
We know 'new' keyword is used to create the object but It demands the class name at the beginning or at the time of compilation.

new keyword is not suitable to create the object for the classes which are coming at runtime dynamically.

In order to create the Object for the classes which are coming at runtime either from database or files, we should use newInstance() method available in class called Class.


class Customer {
}
class DrawbackOfNew {
	public static void main(String[] args) throws Exception {
		Object obj = Class.forName(args[0]).newInstance();

		System.out.println("Object created for :"+obj.getClass().getName());
	}
}


javac DrawbackOfNew.java

java DrawbackOfNew Customer

java DrawbackOfNew java.lang.String 
----------------------------------------------------------------------------------------------------
class Customer{
	public void message() {
		System.out.println("Hello Customer how are you???");
	}
}
class DynamicMethodCall {
	public static void main(String[] args) throws Exception {
		Object obj = Class.forName(args[0]).newInstance();
		
		Customer cust = (Customer) obj;
		cust.message();
	}
}
-----------------------------------------------------------------------------------------------------
A static method does not act upon instance variable why ?
----------------------------------------------------------------
class Test {
	int x = 100;
	public static void main(String[] args) {
		System.out.println("x value is :"+x); //error
	}
}

The above program will generate the error because we are trying to access instance variable from static method without having object.

All the static members are getting executed at the time of loading .class file into JVM memory but instance variables are created or initialized at the time of Object creation so at the time of execution of static method instance variables are not present that is the reason we cannot access instance variable inside a static method. 

class Test{
	int x ;
	void input(int x){
		 this.x = x;
	}
	public static void access(){
		 System.out.println("x value is :"+x); //error
	}
}
class InstanceAccess {
	public static void main(String[] args) {
		Test t1 = new Test();
		t1.input(10);
		Test.access();

	}
}
----------------------------------------------------------------------------------------------------
Runtime data Areas :
------------------------
Method area :-
---------------
In this area all class level information is available. Actually the .class file is dumpped here hence we have all kinds of information related to class is available like name of the class, name of the immediate super class, method and variable name, static variable, name of the method and so on.


There is only one method area per JVM.

Whenever our .class files dumpped inside the method area then it returns Class class object.
----------------------------------------------------------------------------------------------------

import java.lang.reflect.Method;
class ClassDescription 
{
	public static void main(String[] args) throws Exception
	{
		Class cls = Class.forName(args[0]);
		System.out.println("Class Name is : "+cls.getName());

        System.out.println("Package Name is : "+cls.getPackageName());
		  
		                
		Method  [] method 	=   cls.getDeclaredMethods();
		System.out.println("..........Methods are ................");

         int counter = 0;
		for (Method x : method )
		{
			counter++;
			System.out.println(x.getName());
		}
		System.out.println("Total methods are :"+counter);
	}
}
-----------------------------------------------------------------------------------------------------

Heap memory :-
------------------
It stores information regarding object and instance variables. All the objects are created as a part of HEAP memory so automatically all the instance variables are also the part of HEAP memory.

There is only one HEAP area per JVM.



Stack area :-
--------------
For every thread, JVM creates a seperate runtime stack. Each stack is created as a part of stack memory. All the local variables are also the part of stack memory.
Each entry in the stack is called Stack Frame, Each stack frame containd three parts
1) Local variable Array
2) Frame Data
3) Operand Stack


Garbage collector :-
----------------------
It is an automatic memory management in java. JVM internally contains a component called Garbage collector, It is responsible to delete the unused objects or the objects which are not containing any references in the memory.

Heap and stack diagram
      OR
Grabage collector program 
     OR 
Output of any complex program
----------------------------------------------------------------------------------------------------
class Customer
{
	private String name;
	private int id;

	public Customer(String name , int id)
	{
		this.name=name;
		this.id=id;
	}
	public void setId(int id)  //setter   
	{
		this.id=id;
	}
	public int getId() //getter
	{
		return id;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		int val=100;
		Customer e = new Customer("Ravi",2);
		m1(e);	
		//gc   3000x object is eligible for Garbage collector
		System.out.println(e.getId());
	}
	public static void m1(Customer e)
	{
		e.setId(5);
		e=new Customer("Rahul",7);
		e.setId(9);
		System.out.println(e.getId());
	}
}
-------------------------------------------------------------------------------------------------------
public class Employee
{
	int id=100;
	public static void main(String[] args) 
	{
		int val=200;
		Employee e1 = new Employee();
		e1.id=val;
		update(e1);
		
		System.out.println(e1.id);
        		Employee e2 = new Employee(); 
		e2.id=500;

		switchEmployees(e2,e1);
		
		    //gc 2 objects 2000x and 4000x
		    System.out.println(e1.id);
		    System.out.println(e2.id);
	    }
     
	 public static void update(Employee e) {
                           e.id=900;
		e=new Employee();
		e.id=400;
	 }

	 public static void switchEmployees(Employee e1,Employee e2)
	  {
		 int temp=e1.id;
		 e1.id=e2.id;
		 e2= new Employee();
		 e2.id=temp;
	  }
   }

---------------------------------------------------------------------------------------------------------
class Test1
{
	public static void main(String[] args) 
	{

		int x ;  //Local variable must be initialized
		System.out.println(" x value is :"+x);

		//public int y = 12; //we cann't use private, public and protected
	}
}
//A local variable must be initialized as well as we can't use access modifier like public protected and private

-------------------------------------------------------------------------------------------------------
public class MainThread 
{

	public static void main(String[] args) 
	{
	  Thread t =	Thread.currentThread();
	  System.out.println("Current Thread Name is :"+ t.getName());
	}
}

The above program describes that whenever we define a main method internally main thread is created by JVM.
-------------------------------------------------------------------------------------------------------
PC Register :-
--------------
In order to hold the current executing instruction of a thread we use PC register (Program Counter Register). For a single JVM we can have multiple PC Registers.


Native method stack :-
--------------------------
For every thread in java a separate native stack is created. It stores the native method information.

Interpreter :- 
---------------
JVM stands for Java Virtual Machine. It is a software in the form of Interpreter written in 'C' language. 

The main purpose of JVM to load and execute the .class file.JVM has a component called class loader subsystem responsible to load the required .class file as well as It allocates the necessary memory needed by the java program.

JVM executes our program line by line. It is slow in nature so java software people has provided a special compiler i.e JIT compiler to boost up the execution.


JIT compiler :-
-----------------
It stands for just in time compiler. It is the part of JVM which increases the speed of execution of a java program.

It holds the frequently used instruction and make it available at the time of executing java program by JVM so the execution will become faster.
----------------------------------------------------------------------------------------------------------------------------------
Interview Question :
-----------------------
//Program on integral litral
class Test1 
{
	public static void main(String[] args) 
	{
		int a = 010;     //octal 0-7
		int b = 0xadd; //Hexadecimal 0-f
		int c = 0b111; //Binary 0 and 1		
       		System.out.println("a value is :"+a);
System.out.println("b value is : "+b);
		System.out.println("c value is : "+c);
		
	}
}
------------------------------------------------------------------------------------------------
public class Test2
{
public static void main(String[] args)
	{
		short s = 135;
		byte b =(byte) s;

		System.out.println("Value is :"+b);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		long l = 123L;
		float f = l;            //intgeral literal we can assign to  floating point literal
		System.out.println(f);
	
	}
}

Note :
-------
Any Integral Literal we can assign to floating point literal but floating point literal we can't assign to integral literal.
------------------------------------------------------------------------------------------------

class Test3 
{
	public static void main(String[] args) 
	{
		double x = 015.29; 

		 double y = 0167;  

		 double z = 0187; //error

		System.out.println(x+","+y+","+z);
	}
}

-----------------------------------------------------------------------------------------------

class Test4 
{
	public static void main(String[] args) 
	{
		double x = 0X29;

		double y = 0X9.15; 
		
		System.out.println(x+","+y);
	}
}
----------------------------------------------------------------------------------------------
class Test5 
{
	public static void main(String[] args) 
	{
		double a = 0791; //error

		double b = 0791.0;

		double c = 0777;

		double d = 0Xdead; 

		double e = 0Xdead.0; /error
	}
}
----------------------------------------------------------------------------------------------

class Test6 
{
	public static void main(String[] args) 
	{
	   double a = 1.5e3;
	   float b = 1.5e3; //error
	   float c = 1.5e3F;  
	   double d = 10;    
	   int e = 10.0; //error     
	   int f = 10D;  //error 
	   int g = 10F; //error
	}
}
----------------------------------------------------------------------------------------------
public class Test7
{
    public static void main(String[] args)
    {
        boolean c = 0; //error
        boolean d = 1; //error
        System.out.println(c);
        System.out.println(d);       
    }
}
------------------------------------------------------------------------------------------------
class Test8
{
	public static void main(String[] args) 
	{
		boolean x = "true"; //error
		boolean y = "false"; //error
		System.out.println(x);
                           System.out.println(y); 
	}
}
---------------------------------------------------------------------------------------------------------------------------------------
note :- true, false and null look like a keyword but they are actually literals 
---------------------------------------------------------------------------------------------------------------------------------------
class Test9
{
	public static void main(String[] args) 
	{
		char c1 = 'A';

		char c2 = 65535;

		char c3 = '\u0041';
		  
		char c4 = '\u0061';

		System.out.println("c1 = "+c1+", c2 ="+c2+", c3 ="+c3+" c4="+c4);
	}
}
------------------------------------------------------------------------------------------------
class Test10 
{
	public static void main(String[] args) 
	{
		String x = "india";
		 x.toUpperCase();
		System.out.println(x);
	}
}

It will print india in small letter.
------------------------------------------------------------------------------------------------
== and equals(String x)
== checks reference   and  equals() checks content
class Test11
{
	public static void main(String[] args) 
	{
		String s1="naresh";
		String s2="naresh";
		String s3=new String("naresh");

		 System.out.println(s1.equals(s2));
		 System.out.println(s1.equals(s3));

		 System.out.println(s1==s2); 
		 System.out.println(s1==s3); 
	}
}
O/P::
true
true
true
false
------------------------------------------------------------------------------------------------

//IQ
class Test12{
	public static void main(String args[]){		
		String s=15+29+"Ravi"+40+40;  
System.out.println(s);
	    	int x = 12; int y = 14;
		System.out.println("Sum of x and y is :"+x+y); 
		System.out.println("Sum of x and y is :"+(x+y)); 
	}
}
OP;
44Ravi4040
Sum of x and y is :1214
Sum of x and y is :26
------------------------------------------------------------------------------------------------

//IQ
class Test13
{
	public static void main(String args[])
	{
		String x = "India";
		System.out.println("it's length is :"+x.length);  //error  ( x.length() )
	}
}

-----------------------------------------------------------------------------------------------
//IQ
class Test14
{
	public static void main(String args[])
	{
		String [] x = new String[3]; 
		System.out.println("it's length is :"+x.length()); //error  (x.length)
		
	}
}
------------------------------------------------------------------------------------------------
//Working with append() to describe the mutability
class Test15
{
public static void main(String args[])
	{
		StringBuilder sb1=new StringBuilder("Data");
		sb1.append("Base");
		System.out.println(sb1);	

		StringBuffer sb2=new StringBuffer("Tata");
		sb2.append("Nagar");
		System.out.println(sb2);	

		String sb3=new String("Data");
		sb3.concat("Base");
		System.out.println(sb3);	
	
	}
}
OP:
DataBase
TataNagar
Data
