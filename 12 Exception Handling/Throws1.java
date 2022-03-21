package ExceptionHandling;
import java.io.*;

public class Throws1 {
	void m() throws IOException{
		throw new IOException("device error");
	}
	void n() throws IOException {
		m();
	}
	void p() {
		try {
			n();
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}
		public static void main(String[] args) {
			Throws1 obj = new Throws1();
			obj.p();
			System.out.println("Normal flow..");
	
	}
}
