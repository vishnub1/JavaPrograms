Exception Handling :-
--------------------------------------
An exception is an abnormal situation or an unexpected situation in a normal execution flow.

Due to an exception our execution of the program will be disturbed first and then terminated permanently.

An exception occurs due to dependency, when one part of the program is dependent to another part in order to complete the task then there might a chance of getting an exception.

EXCEPTION ALSO OCCURS DUE TO THE WRONG INPUT GIVEN BY THE USER.
------------------------------------------------------------------------------------------------------------------------------------
The following program explains that whenever an exception occurs the execution of the program will be terminated abnormally and Program will be in Halt mode.

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("Main method started....");
		int a = 100;
		int b = Integer.parseInt(args[0]);
		
		int c = a/b;
		System.out.println("c value is :"+c);
		
		System.out.println("Main method ended....");

	}
}
ERROR:
Main method started....
java.lang.ArrayIndexOutOfBoundsException: 
	Index 0 out of bounds for length 0
	at interfaces.ExceptionDemo.main(ExceptionDemo.java:7)
------------------------------------------------------------------------------------------------------------------------------------
Exception Hierarchy :
----------------------------------------
As a programmer we are responsible to handle the exception, we are not responsible to handle the error. System Admin is responsible to handle the error.

The Exceptions which occurs commonly in java are called Checked Exception.

The Exceptions which occurs rarely in java are called Unchecked Exception.

Compile Time Exceptions comes under the category of Checked Exception

Errors and RuntimeExceptions comes under the category of Unchecked Exception.

From the Exception Hierarchy it is clear that Exception is the super class of all the exception we have in java.


Some criteria for exception in java :
------------------------------------------------

1)  10/0 ;  java.lang.ArithmeticException

2) int [] x = {12,90,67,56};
     System.out.println(x[4]);
     java.lang.ArrayIndexOutOfBoundsException

3) String y = null;
     y.length();     
     java.lang.NullPointerException

4) String a = "Ravi";
     int b = Integer.parseInt(a);
     java.lang.NumberFormatException
------------------------------------------------------------------------------------------------------------------------------
WAP in java to proof that Exception is the super class of all the Exception we have in java.

package interfaces;

public class ExceptionIsSuper {
	public static void main(String[] args) {
		Exception e1 = new ArithmeticException();
		System.out.println(e1);
		
		Exception e2 = new ArithmeticException("You have divided by zero");
		System.out.println(e2);
	}
}
OP:
java.lang.ArithmeticException
java.lang.ArithmeticException: You have divided by zero
---------------------------------------------------------------------------------
public class ArithmeticException extends RuntimeException {
	ArithmeticException()
	{  }

	ArithmeticException(String message)	{
		super(message);
	}
}
---------------------------------------------------------------------------------------------------------------------------------
The object orientation has provided some mechanism to handle the exception by using the following keyword :-

1) try 
2) catch
3) finally
4) throw
5) throws
---------------------------------------------------------------------------------------------------------------------------------
try :-
--------
Whenever our statement is error suspecting statement then put that statement inside the try block.

The try block will trace the program line by line and if any exception occurs then it will create the exception object and throw the exception object to the nearest catch block for handling purpose.

try block must be followed either by catch block or finally block or both. In between the try-catch we can't write any kind of statement.
---------------------------------------------------------------------------------------------------------------------------------
catch block :-
---------------------
The main purpose of catch block to handle the exception which is thrown by try block.

The catch block will only execute if there is an exception inside the try block.
---------------------------------------------------------------------------------------------------------------------------------
package com.ravi.basic;

public class TryDemo {
	public static void main(String[] args) {
		System.out.println("Welcome User");
		try	{
			int a = 10;
			int b = 0;
			int c = a/b; 
			System.out.println("c value is :"+c);	
		}
		catch(Exception e){
			System.err.println(e);
			System.out.println("...........................");
			e.printStackTrace();
			System.out.println("...........................");
			System.out.println(e.getMessage());
		}
		System.out.println("main method ended");
	}
}

Welcome User
java.lang.ArithmeticException: / by zero
...........................
java.lang.ArithmeticException: / by zero
	at interfaces.TryDemo.main(TryDemo.java:10)
...........................
/ by zero
main method ended
--------------------------------------------------------------------------------------------
//Exception handling describes to provide user-friendly messages to our client
public class CustomerDemo {
	public static void main(String[] args) {
		System.out.println("Welcome user!!!");
		try	{
	      int a = 10;
	      int b = 0;
	      int c = a/b;
	      System.out.println("c value is :"+c);
		}
		catch(ArithmeticException e) {
			System.err.println("Please don't put zero");
		}
		System.out.println("Hello user your program is completed!!!");
	}
}
OP:
Welcome user!!!
Please don't put zero
Hello user your program is completed!!!

----------------------------------------------------------------------------------------------------------------------------------
Multiple try-catch :-
-----------------------------------
Depending upon our requirements we can take multiple try catch block.
--------------------------------------------------------------------------------------------

public class MultipleTryCatch {
	public static void main(String[] args){
		System.out.println("Main started..");

		try	{
			int a=100,b=0,c;
			c = a/b;  // new ArithmeticException();
			System.out.println("c value is :"+c);
		}catch(ArithmeticException e){
			System.err.println("Divide by zero problem....");	
		}

		try{
			int x[] = {12,90};
			System.out.println(x[2]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("Array is out of limit...");	
		}
		System.out.println("Main completed..");
	}
}
OP:
Main started..
Divide by zero problem....
Array is out of limit...
Main completed..
-----------------------------------------------------------------------------------------------------------------------------------
Nested try block :
--------------------------------
In java it is possible to define nested try block i.e one try block inside another try block.

The inner try block will only execute if we don't have any exception in the outer try block.

We should use nested try block when the inner try block has some code which depends upon the code written inside outer try block.
-----------------------------------------------------------------------------------------------------------------------------------

package com.ravi.basic;
public class NestedTry {
	public static void main(String[] args){

		try { //Outer try
			String x = "Naresh";
			System.out.println("The length of "+ x+ " is :"+x.length());

			try { //inner try
				String y = "naresh";
				int z = Integer.parseInt(y);
				System.out.println("z value is :"+z);			  
			}catch(NumberFormatException e)	{
				System.err.println("Number is not in a format");	
			}

		}catch(NullPointerException e){
			System.err.println("Null Pointer problem...");			
		}
		System.out.println("Main is completed....");
	}
}
OP:
The length of Naresh is :6
Number is not in a format
Main is completed....
--------------------------------------------------------------------------------------------------------------------------------------
try with multiple catch block :
--------------------------------------------------------
We should take multiple catch block with a single try block for providing more clearity regarding the exception.

While working with multiple catch block with a single try the super class catch block must be the last catch block.

package com.ravi.basic;
public class MultyCatch {
	public static void main(String[] args) {
		System.out.println("Main Started...");		

		try	{
			int a=10,b=0,c;
			c=a/b;
			System.out.println("c value is :"+c);	

			int x[] = {12,78,56};
			System.out.println(x[4]);
		}catch(ArrayIndexOutOfBoundsException e1){
			System.err.println("Array is out of limit...");
		}catch(ArithmeticException e1){
			System.err.println("Divide By zero problem...");
		}catch(Exception e1){
			System.err.println("Super Catch block");		
		}	
		System.out.println("Main Ended...");
	}
}
OP:
Main Started...
Divide By zero problem...
Main Ended...
----------------------------------------------------------------------------------------------------------------------------------
public class FloatingPoint {

	public static void main(String[] args) {
		System.out.println(0/0.0);  //NaN
		
		System.out.println(10/0.0); //Infinity
		
		System.out.println(-10/0.0); //-Infinity
	}
}
OP:
NaN
Infinity
-Infinity
---------------------------------------------------------------------------------
finally block in java :-
--------------------------------------
The finally block is used to handle the resources. According to software engineering the resources are memory creation, buffer creation, Opening of a database, opening of a file and so on, So we need to handle them carefully.

finally is a block which is guranted for execution whether an exception has been thrown or not.

We should write all the closing statements inside the finally block so finally block will execute and close all the resources.
-------------------------------------------------------------------------------------------------------------------------------------
package com.ravi.basic_exception;


public class FinallyTest {
	public static void main(String[] args){
		System.out.println("Main method started...");
		try{
			int a = 100;
			int b = 0;
			int c = a/b;
			System.out.println("c value is :"+c);
		}finally {
			System.out.println("It is a finally block");
		}
		System.out.println("Main method ended...");
	}
}
OP:
Main method started...
It is a finally block
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at interfaces.FinallyTest.main(FinallyTest.java:9)
--------------------------------------------------------------------------------------------------------------------------------
package com.ravi.basic_exception;

public class FinallyTest1 {
	public static void main(String[] args){
		System.out.println("Main method started...");
		try	{
			int a = 100;
			int b = 0;
			int c = a/b;
			System.out.println("c value is :"+c);
		}catch(ArithmeticException e){
			System.out.println("Divide by zero problem");
		}finally {
			System.out.println("It is a finally block");
		}
		System.out.println("Main method ended...");
	}
}
OP:
Main method started...
Divide by zero problem
It is a finally block
Main method ended...

Note :- In between catch and finally, catch block has more priority.

--------------------------------------------------------------------------------------------------------------------------------------
Checked vs Unchecked exception :-
---------------------------------------------------------------
Checked Exception :
------------------------------------
In java some exceptions are very common exceptions are called Checked excption here compiler take very much care and wanted the clearity regarding the exception by saying that by using this code you may face some problem at run time and you did not explain me how would you handle this situation at runtime are called Checked exception, so provide either try-catch or declare the method as throws.

Unchecked Exception :-
-----------------------------------------
The exceptions which are rarely occurred in java and for these kinds of exception compiler does not take very much care are called unchecked exception.

Unchecked exceptions are directly entertain by JVM because they are rarely occurred in java.
---------------------------------------------------------------------------------------------------------------------------------------
Why compiler takes very much care regarding Checked Exception?
-In case of checked exception, handling the exception is compulsory because we deal with some other resources so compiler wanted some clearity hence compiler takes very much care regarding Checked Exception.
---------------------------------------------------------------------------------------------------------------------------------------
Exception Propogation :
--------------------------------------------
Whenever we call a method and if the the callee method contains any kind of exception and if callee method doesn't having any kind of exception handling mechanism then it will propagate the exception to caller method for handling purpose. This is called Exception Propagation.

If the caller method does not contain any exception handling mechanism then JVM will terminate the method from the stack frame hence the remaining part of the method(m1 method) will not be executed even if we handle the exception in another caller method like main.

If all the caller method does not contain any exception handling mechanism then exception will be handled by JVM, JVM has default exception handler which will provide the exception message and terminates the program abnormally.
------------------------------------------------------------------------------------------------------------------------------------
public class ExceptionPropagation {
	public static void main(String[] args) {
		System.out.println("main method started...");
		
		try	{
			m1();
		}catch(Exception e){
			System.out.println("Exception handeled in main method");
		}
		System.out.println("main method ended...");
	}
	public static void m1() {
		System.out.println("m1 method started...");
		m2();		
		System.out.println("m1 method ended...");
	}

	public static void m2()	{
		System.out.println(10/0);
	}
}
OP:
main method started...
m1 method started...
Exception handeled in main method
main method ended...
------------------------------------------------------------------------------------------------------------------------------------
return statement with try-catch and finally
------------------------------------------------------------------------------
If we have return statement inside try block then catch block should also contain return statement otherwise there will be a compilataion error.

It is always better to write return statement in finally so no need to define return statement inside try and catch.

After finally we should not write anything otherwise code will become unreachable.


public class ReturnExample {
	public static void main(String[] args) {
		System.out.println(methodReturningValue());
	}    
	@SuppressWarnings("finally")
	static int methodReturningValue() {
		try {
			System.out.println("Try block");
			System.out.println(10/0); 
		}catch (Exception e){
			System.out.println("catch block");

		}finally {
			System.out.println("Finally block");
			return 15;
		}
	}
}
OP:
Try block
catch block
Finally block
15
--------------------------------------------------------------------------------------------------------------------------------------
UserDefined Exception :
-------------------------------------------
We can create our own Userdefined exception according to requirement. 

We can create checked exception as well as unchecked exception
--------------------------------------------------------------------------------------------------------------------------------------
How to create userdefined Checked Exception :

The userdefined Exception class must be extended from Exception class as well as we need to handle the exception so try-catch or throws is compulsory.
--------------------------------------------------------------------------------------------------------------------------------------

import java.util.Scanner;

class InvalidAgeException extends Exception {
	InvalidAgeException() {
		
	}
	InvalidAgeException(String msg) {
		super(msg);
	}
}

public class GreaterMarksException {
	public static void main(String[] args)throws Exception {
		Scanner sc = new Scanner(System.in);			
		System.out.print("Enter your Age :");			
		int age = sc.nextInt();
		
		if(age < 18)
		throw new InvalidAgeException("Age is not valid");
		else
			System.out.println("Welcome to vote");
	}
}
OP:
Enter your Age :22
Welcome to vote
(or)
Enter your Age :15
Exception in thread "main" interfaces.InvalidAgeException: Age is not valid
	at interfaces.GreaterMarksException.main(GreaterMarksException.java:21)
---------------------------------------------------------------------------------------------------------------------------------
How to create userdefined UnChecked Exception :
--------------------------------------------------------------------------------------------
The userdefined class must extend from RuntimeException as well as hadling is not compulsory

public class GreaterMarksException extends RuntimeException {
	GreaterMarksException()	{
		
	}

	GreaterMarksException(String message){
		super(message);
	}
}
import java.util.Scanner;

public class UncheckedCustomException {
	public static void main(String[] args){
		try	{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Marks :");

			int marks = sc.nextInt();

			if(marks > 100)
				throw new GreaterMarksException("Marks is greater");
			else
				System.out.println("Your marks is :"+marks);  
		}catch(Exception e){
			System.out.println(e);
		}
	}
}
OP:
Enter your Marks :
88
Your marks is :88
(or)
Enter your Marks :
200
exception.GreaterMarksException: Marks is greater
(or)
Enter your Marks :
ada
java.util.InputMismatchException

