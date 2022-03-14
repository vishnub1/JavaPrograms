package ExceptionHandling;

public class TryCatchExample6 {
	public static void main(String[] rags) {
		int i=40;
		int j=0;
		int data;
		try {
			data =i/j;  //throe exception
		}
		//handling exception
		catch(Exception e)
		{
			System.out.println(i/(j+2));    // means j=!0  
		}					//(40/(0+2)) = 20
	}

}
