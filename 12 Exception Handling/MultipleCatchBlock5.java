package ExceptionHandling;

public class MultipleCatchBlock5 {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5]=30/0;
		}
		catch(Exception e) {
		    System.out.println("Common task complited");
		}
		catch(ArithmeticException e) {
			System.out.println("Task 1 is complited");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.print("task 2 complited");
		}
		System.out.print("rest of the code");		
	}

}
//Unreachable catch block for ArithmeticException.
//It is already handled by the catch block for Exception

// comment out the line 9 10 and 11 then run
