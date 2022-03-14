//Case 2: When an exception occurr but not handled by the catch block


package ExceptionHandling;

public class FinallyExample2 {
	public static void main(String[] args) {
		try {
			int a =20/0;
			System.out.println(a);
		}
		catch(NullPointerException nfe) {
			System.out.println("Null Pointer Exception ");
		}
		finally {
			System.out.println("This is finally block always exicute");
		}
	}

}

/*   o/p
 This is finally block always exicute
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at ExceptionHandling.FinallyExample2.main(FinallyExample2.java:9)

*/
