package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowTest2 {
	public static void method() throws FileNotFoundException{
		FileReader file= new FileReader("E:\Camera\1632326903037.jpg");
		BufferedReader fileInput = new BufferedReader(file);
		throw new FileNotFoundException();
	}
	public static void main(String[] args) {
		try {
			method();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("rest of the code..");
	}
	
}
