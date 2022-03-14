package ExceptionHandling;

public class MultipleCatchBlock4 {
	public static void main(String[] args) {
		try {
		String s= null ;
		System.out.println(s.length());
		//}
	    //catch(Exception e){  
	    //	System.out.println("Parent Exception occurs");
	    }
		catch(NullPointerException e) {
			System.out.println("NullPointerExceptio occurs");
		}
		System.out.println("Rest of the code");
	}
}
