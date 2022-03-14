package ExceptionHandling;

public class NestedTryBlock3 {
	public static void main(String[] args) {
		//outer try(main try) block
		try {
			try {  		//inner try block 1
				try {    //inner try block 2
					int arr[] = {1,2,3,4,5};
					//printing the array  element out of its bounds
					System.out.println(arr[10]);
				}
				//to handle AritmeticException
				catch(ArithmeticException e) {
					System.out.println("Arrithmetic excepption");
					System.out.println("inner block 2");
				}
			}
			// to handle ArithmeticException 
			catch(ArithmeticException e) {
				System.out.println("ArithmeticException ");
				System.out.println("inner block 1 ");
			}
		}
		catch(ArrayIndexOutOfBoundsException e4) {
			   //System.out.println(e);
			   System.out.println("outer main try block");
		}
		catch(Exception e5) {
			System.out.println("exception");
			System.out.println("handled in main try -block");
		}
		
	}

}
