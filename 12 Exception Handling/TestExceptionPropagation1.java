package ExceptionHandling;

class TestExceptionPropagation1{
	void m1() {
		int daat =50/0;
	}
	void n() {
		m();
	}
	void p() {
		try {
			n();
		}
		catch(Exception e) {
			System.out.println("Exceprion Handled");
}

public class TestExceptionPropagation1 {
	public static void main(String[] args) {
		TestExceptionPropagation1 obj = new TestExceptionPropagation1();
		obj.p();
		System.out.println("normal flow..");
	}
}
