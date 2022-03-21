package ExceptionHandling;

public class ThrowTest1 {
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("person is not eligible to vote");
		}
		else {
			System.out.println("Person is eligible to vote !!");
		}
	}
	public static void main(String[] args1) {
		validate(20 );
		System.out.println("rest of the code..1");

	}
}
// validate <18
//Exception in thread "main" java.lang.ArithmeticException: person is not eligible to vote
//at ExceptionHandling.ThrowTest1.validate(ThrowTest1.java:6)
//at ExceptionHandling.ThrowTest1.main(ThrowTest1.java:13)

//validate >18
//Person is eligible to vote !!
//rest of the code..1
