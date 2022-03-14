package ExceptionHandling;

public class TryCatchExample4 {
	public static void main(String[] args) {
	try 
	{
	int data =50/0;
	}
	//handling the exception by usibg Exception class
	catch(Exception e)
	{
		System.out.println(e);
	}
	System.out.println("rest of the code");
	}
}
