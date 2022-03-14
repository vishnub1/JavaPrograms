package ExceptionHandling;

public class NestedTryBlock2 {
	public  static void main(String[] args) {
		// outer try block
		try {
			//inner try
			try {
				System.out.println("going to divided by 0");
				int b=39/0;
			}
			//catch block of inner try block 1
			catch(ArithmeticException e) {
				System.out.println(e);
			}
			//inner try block 2
			try {
				int a[] = new int[5];
				
				//assigning the value out of array bounds
				a[5] =4;
			}
			//catch block of inner try block 2
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
			System.out.println("outer statement");
		}
		catch(Exception e) {
			System.out.println("handled the exception (outer catck)");
		}
		System.out.println("normal flow..");		
	}

}
