package ExceptionHandling;

public class MultipleCatchBlock1 {
	
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndesOutOfBoundsException Occurs");
		}catch(ArithmeticException e) {
			System.out.println("Arithmenatic Exception Occurs");
		}catch(Exception e) {
			System.out.println("Parent Exception occurs");
		}
		System.out.println("rest of the code");
	}
}

