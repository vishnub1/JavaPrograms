// Case 3: When an exception occurs and is handled by the catch block
package ExceptionHandling;

public class FinallyExample3 {
	public static void main(String[] args) {
		try {
			System.out.println("inside the try block");
			int a=25/0;
			System.out.println(a);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception occurs");
			System.out.println(ae);
		}
		finally {
			 System.out.println("finally block is always executed");  
		}
		 System.out.println("rest of the code...");    
	}

}

// o/p:
//inside the try block
//Exception occurs
//java.lang.ArithmeticException: / by zero
//finally block is always executed
//rest of the code...
