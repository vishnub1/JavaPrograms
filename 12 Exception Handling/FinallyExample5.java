package ExceptionHandling;

public class FinallyExample5 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static void m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in Finally");
		}
		return 30;
	}

}
//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//	The method println(boolean) in the type PrintStream is not applicable for the arguments (void)
//
//	at ExceptionHandling.FinallyExample5.main(FinallyExample5.java:5)

// imp 
// if we place return statement in finally block we cannot place statement after finally block it
// leads to ce: unreachable statement.