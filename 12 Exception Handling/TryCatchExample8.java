package ExceptionHandling;

public class TryCatchExample8 {
	public static void main(String[] args) {
		try
		{
			int data = 50/0;   // throw exception
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of the code:");
	}

}