package ExceptionHandling;

public class TryCatchExample9 {
	public static void main(String[] args) {
		try
		{
			int arr[] = {1,3,5,7};
			System.out.println(arr[10]);  //may throw exception
		}
		//handling the exception
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest o fthe code");
	}
}

//output
//java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 4
//rest o fthe code