package ExceptionHandling;

public class FinallyInner1 {
	public static void main(String[] args) {
		m1();
	}
	static void m1() {
		try {
			System.out.println("in outer try");
			try {
				System.out.println("in inner try");
		}
		catch(NullPointerException e) {
			System.out.println("in inner catch");
		}
		finally {
			System.out.println("in inner Finally");
		}
			System.out.println("After inner try/catch/finally");
		}
		catch(NullPointerException e) {
			System.out.println("in outer catch");
		}
		finally {
			System.out.println("in outer finally");
		}
		System.out.println("After outer try/catch/ finally");
	}
//	
//	in outer try
//	in inner try
//	in inner Finally
//	After inner try/catch/finally
//	in outer finally
//	After outer try/catch/ finally

}
