// case :When an exception does not occu

package ExceptionHandling;

public class FinallyExample1 {
	public static void main(String[] args) {
		try {
			System.out.println("Result :"+10/0);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception occurs");
		}
		finally {
			System.out.println("This is finally block always exicute");
		}
		
	}

}


/*  O/P
 This is finally block always exicute
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.FinallyExample1.main(FinallyExample1.java:6)
 */