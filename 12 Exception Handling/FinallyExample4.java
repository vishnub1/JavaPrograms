package ExceptionHandling;

public class FinallyExample4 {
	public static void main(String[] args) {
		m1();
		System.out.println("After m1 calling");
	}
	static void m1() {
		try {
			System.out.println("in try");
			System.out.println(10/0);
		}
		catch(NullPointerException e) {
			System.out.println("in catch");
		}
		finally {
			System.out.println("in Finally");
			return;
		}
	}

}


/*
 * in try
in Finally
After m1 calling
 */