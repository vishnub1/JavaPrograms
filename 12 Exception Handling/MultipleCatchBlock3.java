package ExceptionHandling;

public class MultipleCatchBlock3 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30/0;
			System.out.println(a[10]);
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException occ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e) {
			System.out.println("Rest of the code ");
		}
	}

}
