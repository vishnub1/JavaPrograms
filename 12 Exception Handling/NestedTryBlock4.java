package ExceptionHandling;

public class NestedTryBlock4 {
	public static void main(String[] args) {
		try {
			try {
				System.out.println(10/0);
			}
			catch(ArithmeticException e) {
				System.out.println("inner try block");
			}
		}
		catch(ArithmeticException e) {
			System.out.println("outer try block");
		}
	}

}


// op==> inner try block