Integral Literal :
------------------
10/0 :- Infinity
0/0    :- Undefined 

Whenever we divide a number by zero i.e by integral literal then in both the cases i.e Infinity and Undefined we will get java.lang.ArithmeticException because java software people has not provided any final variable to represent infinity and undefined.

Floating Point Literal :
----------------------
10 /0.0 :- Infinity
0/0.0    :- Undefined 

Whenever we divide a number by zero i.e by floating point literal then in both the cases i.e Infinity and Undefined java software people has provided final static variable to represent infinity and undefined as shown below.

10/0.0   :- Infinity     -> POSITIVE_INFINITY
-10/0.0  :- Infinity    -> NEGATIVE_INFINITY
0/0.0     :- NaN         -> Not a number


javap java.lang.Double  // POSITIVE_INFINITY,  NEGATIVE_INFINITY AND NaN

javap java.lang.Integer // No such kind of final static variable is here
------------------------------------------------------------------------------------------------
//Arithmetic Operator
// Division Operator
class Test16
{
	public static void main(String [] args)
	{
		System.out.println(-10/0.0); 	 //-intinity
		System.out.println(10/0.0); 	//infinity
		System.out.println(0/0.0);	  	//nan

		System.out.println(10/0);  		//ArithmeticException
		System.out.println(0/0);   		// ArithmeticException
	}
}
------------------------------------------------------------------------------------------------
Unary Operator :
-------------------
These operator works with single operand.

There are 3 types of Unary Operator

1) Unary minus Operator (-)

2) Unary increment Operator(++)

3) Unary decrement Operator (--)
------------------------------------------------------------------------------------------------

//*Unary Operators (Acts on only one operand)
//Unary minus Operator
class Test17
{
	public static void main(String[] args) 
	{
		int x = 15;
		System.out.println(-x);   //-15
		System.out.println(-(-x));  //15
	}
}

------------------------------------------------------------------------------------------------
//Unary Operators
//Unary Pre increment Operator
class Test18
{
	public static void main(String[] args) 
	{
		int x = 15;
		int y = ++x;
		System.out.println(x+" : "+y);    //16 : 16 
	}
}
-----------------------------------------------------------------------------------------------


//Unary Operators
//Unary Post increment Operator
class Test19
{
	public static void main(String[] args) 
	{
		int x = 15;
		int y = x++;
		System.out.println(x+":"+y);    // 16:15
	}
}
-----------------------------------------------------------------------------------------------
//Unary Operators
//Unary Pre increment Operator
class Test20
{
	public static void main(String[] args) 
	{
		int x = 15;
		int y = ++15; //error
		System.out.println(y);
	}
}
------------------------------------------------------------------------------------------------
//Unary Operators
//Unary Pre increment Operator
class Test21
{
	public static void main(String[] args) 
	{
		int x = 15;
		int y = ++(++x);
		System.out.println(y);
	}
}
------------------------------------------------------------------------------------------------
//Unary Operators
//Unary post increment Operator
class Test22
{
	public static void main(String[] args) 
	{
		int x = 15;
		x++;
		System.out.println(x);  //16
	}
}

-----------------------------------------------------------------------------------------------
//Unary Operators
//Unary post increment Operator
class Test23
{
	public static void main(String[] args) 
	{
		char ch ='A';
		ch++;
		System.out.println(ch);   //B
	}
}

------------------------------------------------------------------------------------------------
//Unary Operators
//Unary post increment Operator
class Test24
{
	public static void main(String[] args) 
	{
		double d = 15.15;
		d++;
		System.out.println(d);   //16.15
	}
}
 
//Unary Operators
//Unary Post decrement Operator
class Test25
{
	public static void main(String[] args) 
	{
		int x = 15;
		int y = x--;
		System.out.println(x+":"+y);   //14 : 15
	}
}
---------------------------------------------------------------------------------------------
//IQ   --> max(int, type of i, type of j)              
class Test26
{
	public static void main(String args[])
	{
		byte i = 1;
		byte j = 1;
		byte k = i + j;
		System.out.println(k);   // incompatible types: possible lossy conversion from int to byte
	}
}

----------------------------------------------------------------------------------------------

//IQ   --> max(int, type of i, type of j)              
class Test26
{
	public static void main(String args[])
	{
		byte i = 1;
		byte j = 1;
		byte k = (byte)(i + j);
		System.out.println(k);    //2
	}
}

---------------------------------------------------------------------------------------------

//IQ   --> max(int, type of b, type of j)
class Test27
{
	public static void main(String args[])
	{
		byte b = 6;
        b = b + 7;     
		System.out.println(b);
		

	    byte c = 6;
        c += 7;                           //short hand operator  c +=7   => c = c+ 7;
        System.out.println(c); 
	}
}
--------------------------------------------------------------------------------------
public class Test28
{
static int i =5;
	public static void main(String... args) 
	{
			System.out.println(i++); //5
			System.out.println(i); //6
			System.out.println(++i);//7
			System.out.println(++i  +  i++);  //16   
	}
}
--------------------------------------------------------------------------------------
class Test29 
{
	public static void main(String[] args) 
	{
		int x=2; int y=3;                   //x=3
		if((y==x++) | (x< ++y))      //means if 3 is equal to 2 or 3<4
		{
			System.out.println("x is :"+x+" y is :"+y);
		}
		
	}
}
--------------------------------------------------------------------------------------
public class Test30
{
        public static void main(String[] x)
        {
               int z = 5;
               if(++z > 5 || ++z > 6)
	   z++;   
               System.out.println(z);    //7
               
	    }
}

Imp: 
          |  -> Boolean OR operator

         || -> Logical OR operator
--------------------------------------------------------------------------------------

public class Test31
{
       public static void main(String[] argv) 
       {
             int val = 0;
             boolean test = ((val == 0) || (++val == 2));		       // O/P:
             System.out.println("test = " + test + "\nval = " + val);  //test = true 
       }								       // val = 0
}
--------------------------------------------------------------------------------------



Constructor :
--------------------------
Why it is called constructor ?
-----------------------------------
=>It is called constructor because it is used to construct the Object.

What is the advantage of writing constructor in our program ?
------------------------------------------------------------------------------
If we write constructor in our program then compiler will not add any kind of constructor, we initialize our all instance variables inside the constructor so variable initialization and variable re-initialization both are done in the same place (in a single line) as shown in the diagram.

Defination of Constructor :
-----------------------------------------------
It is a special method whose name is same as class name or in words we can say if the class name and method name both are same then it is called constructor.

The main purpose of constructor to initialize the object that initialize the instance variable of the class.

Every java class has a constructor either implicitly added by the compiler or explicitly written by the user.

A default constructor will be added by the compiler in a class to provide default values for the instance variables in case user has not written any kind of constructor.

Constructor never containing any return type including void also.

A constructor is automatically called and executed at the time of creating the object.

A constructor is called only once per object that means when we create the object constructor will be called and executed, if we create the object again then again the constructor will be called and executed.


Note :- A constructor can't be declared as static and final. A constructor cannot be inherited in java.


Java supports 4 kinds of constructor 
-------------------------------------------------------------------
1) default constructor

2) parameterized constructor

3) copy constructor

4) private constructor

default constructor
------------------------------------
	If no argument is passed to the constructor then it is called default constructor.

Eg:-

class Student
{
   int rollNumber;
   String studentName;

   Student()  //default constructor			//OP
   {							//111
       rollNumber = 111;				//Ravi
       studentName = "Ravi";
	   System.out.println(rollNumber);
	   System.out.println(studentName);
   }
   public static void main(String[] args){
	Student sd = new Student();
	}
}
------------------------------------------------------------------------------------
public class Person 
{
    private int personId;
    private String personName;
    
    public  Person()
    {
    	personId = 111;
    	personName = "Ravi";
    }
    
    public void talk()
    {
    	System.out.println("Person Id is :"+this.personId);
    	System.out.println("Person Name is :"+this.personName);
    }
	public static void main(String[] args){
	Person p = new Person();
	p.talk();
	}
}
OP:
Person Id is :111
Person Name is :Ravi
------------------------------------------------------
Parameterized Constructor :
------------------------------------------------------
If we pass one or more arguments to the constructor then it is called parameterized constructor.

Ex:
---

class Student 
{
    int rollNumber;
    String studentName;

    Student(int rollNumber, String studentName)  //parameterized
    {
         	 this.rollNumber = rollNumber;
	 this.studentName = studentName;    
    }
 }
 -----------------------------------------------------------------------------------
public class Person {
    private int personId;
    private String personName;

    Person() // default Constructor
    {
        personId = 111;
        personName = "Virat";
    }

    Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    public void showPersonData() {
        System.out.println("Person id is :" + personId);
        System.out.println("Person name is :" + personName);
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.showPersonData();
    }
}




import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter person id :");
        int pid = sc.nextInt();

        System.out.print("Enter Person Name :");
        String name = sc.nextLine();
        name = sc.nextLine();

        Person p2 = new Person(pid, name);

        p1.showPersonData();
        p2.showPersonData();

    }

}
------------------------------------------------------------------------------------
Note :
-------
Write a pogram too proof that whenever we create an Object, a separate copy of all the instance variables will be created every time.

public class Test {
    int x = 10;
    
	public static void main(String[] args) {
		Test t1 = new Test();
		
		Test t2 = new Test();
		
		System.out.println(++t1.x);  //11
		System.out.println(--t2.x);  //9
	}
}

As we can see in the above Program we have x instance variable so x has two copies, one with t1 reference variable and another one is with t2 reference variable.

But on the other hand if we make x variable as static variable then only one copy of x will be created and the same copy is sharable by all the Objects as shown in the program below.



public class Test {
    static int x = 10;
    
	public static void main(String[] args) {
		Test t1 = new Test();
		
		Test t2 = new Test();
		
		++t1.x;    ++t2.x;
		
		System.out.println(t1.x);  //12
		
		System.out.println(t2.x);  //12
	}
}


-------------------------------------------------------------------------------------------------------------------------------
WAP in java to describe that when we should declare instance variable and 
when we should declare static variable ?

instance variable :- 
---------------------
We should declare instance variable if and only if the value of the variable 
would be different for all the Objects.

Ex:- rollNumber, studentName, sudentAddress and so on

static variable :
------------------
We should declare static variable if and only if the value of the variable 
would be common for all the Objects.

Ex :- collegeName, centralLibrary, 

class Student {
	int rollNumber;
	String studentName;
	String address;
	static String collegeName = "JNTU";
	
	public Student(int rollNumber, String studentName, String address) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.address = address;
	}
	
	public void showStudentData() {
		System.out.println("Student Roll Number is :"+rollNumber);
		System.out.println("Student Name is :"+studentName);
		System.out.println("Student address is :"+address);
		System.out.println("College Name is :"+collegeName);
	}
}

public class StudentDemo {

	public static void main(String[] args) {

		Student s1 = new Student(111, "Virat", "Bangalore");
		s1.showStudentData();
		
		Student s2 = new Student(222, "Rahul", "Punjab"); 
		s2.showStudentData();
		
		Student s3 = new Student(333, "Rohit", "Mumbai");
		s3.showStudentData();
		
		Student s4 = new Student(444, "Dhoni", "Chennai"); 
		s4.showStudentData();
		
	}

}
-----------------------------------------------------------------------------------
HAS-A relation between the classes :
------------------------------------------------------------------------------------


//Company.java
public class Company {
	private String companyName;
	private String companyLocation;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyLocation() {
		return companyLocation;
	}
	public void setCompanyLocation(String companyLocation) {
		this.companyLocation = companyLocation;
	}	
}


//Employee.java
public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeAddress;
	private double salary;
	private Company company;
	
	public Employee(int employeeId,String employeeName,String employeeAddress,double salary,Company company) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.salary = salary;
		this.company = company;
	}
	public void showEmployeeData() {
		System.out.println("Employee Id is :"+employeeId);
		System.out.println("Employee Name is :"+employeeName);
		System.out.println("Employee Address is :"+employeeAddress);
		System.out.println("Employee Salary is :"+salary);
		System.out.println("Company Name is :"+company.getCompanyName());
		System.out.println("Employee location is :"+company.getCompanyLocation());
	}
}


//ComMain.java
public class ComMain {
	public static void main(String[] args) {
		Company c1 = new Company();
		c1.setCompanyName("Google");
		c1.setCompanyLocation("Cilicon Velly");
		
		Employee e1 = new Employee(12, "Sundar Pichai","India", 140000, c1);
		e1.showEmployeeData();
	}
}

----------------------------------------
Copy Constructor :
----------------------------------------

Whenever we pass any Object reference to the constructor then it is called Copy constructor.

The main purpose of copy consructor is to copy the contant of one Object to another Objcet.


class Student
{
   int rollNumber; 
   String studentName;

   Student(Student s) //copy constructor
   {
      rollNumber = s.rollNumber;
      studentName = s.studentName;
   }

}
---------------------------------------------------------------------------------------------------------------------------
//Player.java
public class Player {
  String name1, name2;
  
  Player() { //default constructor
	  name1 = "Virat";
	  name2 = "Rohit";
  }
  
  Player(Player p) { //copy constructor   
	 this.name1 = p.name2;
	 this.name2 = p.name1;
  }
  
  public void showPlayerData() {
	  System.out.println("Name one is :"+name1);
	  System.out.println("Name two is :"+name2);
  }
}

//Main1.java
public class Main1 {

	public static void main(String[] args) {
		Player p1 = new Player();
		
		Player p2 = new Player(p1);
		
		p1.showPlayerData();  p2.showPlayerData();
	}

}
-----------------------------------------------------------------------------------------------
copy_constructor
//Emoloyee.java
public class Employee {
    int employeeId;
    String employeeName;
    
    Employee(int employeeId, String employeeName) {
    	this.employeeId = employeeId;
    	this.employeeName = employeeName;
    }
}

//Manager.java
public class Manager {
   private int managerId;
   private String managerName;
   
   Manager(Employee employee) { //Employee data we are copying to Manager
	   managerId = employee.employeeId;
	   managerName = employee.employeeName;
   }
   
   public void show(){
	   System.out.println("Manager id is :"+managerId);
	   System.out.println("Manager Name is :"+managerName);
   }
}


//Main.java
public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(111, "Ravi");
		
		Manager m1 = new Manager(e1);
		m1.show();
	}
}
-------------------------------------------------------------------------------------------------------------------
private constructor :-
-----------------------
We can declare a construor as private to make singletone class. In this class we can take static method which can be invoked without creating an object. 
--------------------------------------------------------------------------------------
class Customer 
{
	private Customer(){}

    static void m1()
	{
		System.out.println("m1 static method....");
	}

	public static void main(String[] args) 
	{
		Customer c1 = new Customer(); //creating one object
		Customer.m1();
	}
}
----------------------------------------------------------------------------------------------

Inheritance :-
------------------------
Deriving a new class from existing class in such a way that the new class will acquire all the features and properties (except private) of existing class is called Inheritance.

It is one of the most important feature of oops which provides "CODE REUSABILITY".

In java we provide inheritance using a keyword called 'extends'.

Using inheritance mechanism the relationship between the classes is parent and child, According to C++ the parent class is called Base class and the Child class is called Derived class whereas According to Java the parent class is called as super class and the child class is called as sub class.

Using inheritance all the features of super class is by-default available to the sub class so the sub class need not to start the process from begning onwards.

Inheritance follows top to bottom approach, In this hierarchy if we move towards upward direction more generalized properties will occur and on the other hand if we move towards downward direction more specialized properties will occur.

Inheritance provides two kinds of relationship
IS-A Relation :- It occurs between the classes.
HAS-A Relation :- It occurs between the class and its property.

Types of Inheritance :
---------------------------------------
1) Single level inheritance

2) Multi level inheritance 

3) Hierarchical inheritance
----------------------------------------------------------------------------------------------
package com.ravi.single_level;

public class Emp 
{
   int employeeNumber;
   String employeeName;
   String employeeAddress;
   
   public void setEmp()
   {
	   employeeNumber = 111;
	   employeeName = "Mandhana";
	   employeeAddress = "Delhi";
   }
   
   public void disEmp()
   {
	   System.out.println("Employee Number is :"+employeeNumber);
	   System.out.println("Employee Name is :"+employeeName);
	   System.out.println("Employee Address is :"+employeeAddress);
   }
}

package com.ravi.single_level;

public class PEMP extends Emp
{
	String department;
	String designation;
	
	public void setPEMP()
	{
		department = "Cricket";
		designation ="Batsman";
	}
	
	public void disPEMP()
	{
		System.out.println("Employee Departmet is :"+department);
		System.out.println("Employee Designation is :"+designation);
	}

}

package com.ravi.single_level;

public class Main {

	public static void main(String[] args) 
	{
		PEMP p = new PEMP();
		p.setEmp();
		p.setPEMP();
		p.disEmp();
		p.disPEMP();
	}

}
-----------------------------------------------------------------------------------------------
Program on multilevel inheritance 
----------------------------------------
package com.ravi.multilevel;

public class Student 
{
  int rollNumber;
  String studentName;
  String studentAddress;
  double fees;
}

package com.ravi.multilevel;

public class Science extends Student
{
   int physics, chemistry;
}

package com.ravi.multilevel;

public class PCM extends Science
{
  int math;
  
  PCM()
  {
	  
  }
  
  PCM(int rollNumber, String studentName, String studentAddress, double fees, int physics, int chemistry, int math)
  {
	  this.rollNumber = rollNumber;
	  this.studentName = studentName;
	  this.studentAddress = studentAddress;
	  this.fees = fees;
	  this.physics = physics;
	  this.chemistry = chemistry;
	  this.math = math;	  
  }
  public void showStudentData()
  {
	  System.out.println(rollNumber+"\n"+studentName+"\n"+studentAddress+"\n"+fees+"\n"+physics+"\n"+chemistry+"\n"+math);
  }
  
  public void result()
  {
	  int total = physics + chemistry + math;
	  System.out.println("The total marks is :"+total);
  }
  
  
}
package com.ravi.multilevel;

public class Main {

	public static void main(String[] args) 
	{
		PCM p = new PCM(111, "Ravi", "Ameerpet", 16000, 78, 89, 90);
		p.showStudentData();
        p.result();
	}

}
----------------------------------------------------------------------------------------------
super keyword :
-------------------
It is used to access the member of immediate super class. In java we can use super keyword in 3 ways

1) To call the variable of the super class 
2) To call the method of super class
3) To call the constructor of the super class***


To call the variable of super class :-
---------------------------------------
Whenever super class variable name and sub class variable name both are same and if we create an object of sub class then it will give more priority to its own class variable if we want to call super class variable then we should use super keyword.

super keyword always refers to its immediate super class as well as we should only use super keyword whenever the member of super class name and the member of sub class both are same.

package com.ravi.superdemo;

class Super
{
	int x = 100;
}
class Sub extends Super
{
	int x = 200;
	
	Sub()
	{
		System.out.println("Sub class x value is :"+x);
		System.out.println("Super class x value is :"+super.x);
	}
}
public class SuperVar 
{

	public static void main(String[] args) 
	{
		Sub s = new Sub();

	}

}
----------------------------------------------------------------------------------------------
2) To call the method of super class
------------------------------------------
Whenever the super class method name and sub class method name both are same and if we create an object of sub class then it will give more priority to its own class method.
        If we want to invoke the super class method then we should use super 
keyword.

package com.ravi.superdemo;

class Parent
{
	void show()
	{
		System.out.println("Parent class Show method...");
	}
}
class Child extends Parent
{
	void show()
	{
		super.show();
		System.out.println("Child class show method");
		
	}
}

public class SuperMethod 
{

	public static void main(String[] args) 
	{
		Child c = new Child();
		      c.show();

	}

}
-----------------------------------------------------------------------------------------------
3) To call the constructor of super class :-
-----------------------------------------------
To call the super class constructor:-
----------------------------------------
Whenever we write a class in java and if we have not written any kind of constructor then automatically the compiler will add one default constructor to the class.
The first line of any constructor is reserved either for super() or this(). If a developer does not specify either super() or this() to the first line of constructor then compiler will automatically add super() to the first line of constructor.

----------------------------------------------------------------------------------------------
Case 1: To call the default constructor of super class :
---------------------------------------------------------------
package com.ravi.supercase1;

class Super
{
	Super()
	{
		System.out.println("Default constructor of super class");
	}
}
class Sub extends Super
{
	Sub()
	{
		System.out.println("Default constructor of sub class");
	}
}

public class CallingSuperClassDefaultConstructor 
{

	public static void main(String[] args) 
	{
		Sub s = new Sub();

	}

}
---------------------------------------------------------------------------------------------
Case II :- To call the parameterized constructor of super class

package com.ravi.supercase1;

class Parent
{
	Parent(String x)
	{
		System.out.println("Default constructor of Parent class "+x);
	}
}
class Child extends Parent
{
	Child()
	{
		super("Hello ");
		System.out.println("Default constructor of Child class");
	}
}


public class CallingParameterizedConstructorOfSuperClass 
{

	public static void main(String[] args)
	{
		Child c = new Child();

	}

}
----------------------------------------------------------------------------------------------
package com.ravi.supercase1;

class A
{
	A()
	{
		System.out.println("class A");
	}
}
class B extends A
{
	
}

class C extends B
{
	C()
	{
		System.out.println("Class C");
	}
}
public class Main 
{

	public static void main(String[] args)
	{
		C c1 = new C();
	}
}
----------------------------------------------------------------------------------------------
Case III :- To call the default constructor of same class

package com.ravi.thisdemo;

class Super
{
	Super()
	{
		System.out.println("It is default constructor of super class");
	}
	
	Super(int x)
	{
		this();
		System.out.println(x+ " It is parameterized constructo of super class");
	}
}

class Sub extends Super
{
	Sub()
	{
		
		super(9);
		System.out.println("It is the default constructor of sub class");
	}
	
}

public class CallingDefaultConstrctorOfSameClass 
{

	public static void main(String[] args) 
	{
		Sub s = new Sub();

                

	}

}
----------------------------------------------------------------------------------------------
case IV :- To call the parameterized constructor of same class.

package com.ravi.thisdemo;

class Base
{
	Base()
	{
		this("Hello");
		System.out.println("It is the default constructor of super class");
	}
	
	Base(String message)
	{
		System.out.println(message+" It is the parameterized constructor of super class");
	}
}
class Derived extends Base
{
	Derived()
	{
		System.out.println("It is default constructor of sub class");
	}
}

public class CallingParameterizedConstructorOfSameClass 
{

	public static void main(String[] args)
	{
		Derived d = new Derived();

	}

}
----------------------------------------------------------------------------------------------
package com.ravi.shape_square;

class Shape
{
	int x;        //x = 4
	Shape(int x)  //x = 4
	{
		this.x = x;
		System.out.println("x value is :"+x);
	}
}
class Square extends Shape
{

	Square(int y) 
	{
		super(y); //calling the parameterized constructor of super class		
	}
	
	public void area()
	{
		System.out.println("The area of square is :"+(x*x));
	}
}

public class Main 
{

	public static void main(String[] args) 
	{
		Square ss = new Square(4); ss.area();
	}
}
----------------------------------------------------------------------------------------------
package com.ravi.shape_rectangle;

class Shape
{
	int x;       //x = 4 -> 5  
	Shape(int x) //x = 4 -> 5
	{
		this.x = x;
		System.out.println("x value is :"+x);
	}
}
class Square extends Shape
{

	Square(int y) //y = 4 -> 5
	{
		super(y); //calling the parameterized constructor of super class		
	}
	
	public void area()
	{
		System.out.println("The area of square is :"+(x*x));
	}
}

class Rectangle extends Square
{
     int c;
	Rectangle(int l, int b)   //l=5     b = 6
	{
		super(l);
		c = b;
	}
	
	public void area()
	{
		System.out.println("The area of Rectangle is :"+(x*c));
	}
}

public class Main {

	public static void main(String[] args) 
	{
		Square ss =new Square(4); ss.area();
		
		Rectangle rr = new Rectangle(5, 6); rr.area();
		
		

	}

}
