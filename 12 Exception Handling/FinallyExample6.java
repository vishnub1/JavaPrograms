package ExceptionHandling;

public class FinallyExample6 {
	public static void main(String[] args) {
		System.out.println(m1());
	}
	static int m1() {
		try {
			System.out.println("in try");
			return 10;
		}
		catch(ArithmeticException e) {
			System.out.println("in catch");
			return (20);
		}
		finally {
			System.out.println("in finally");
			return 30;
		}
		System.out.println("after try/catch/finally");
	  }
	}