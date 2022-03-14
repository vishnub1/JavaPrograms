package ExceptionHandling;

import java.io.*;
class Division{
	public static void div() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a=-1;
			int b=-1;
			
			//infinite loop to promote message till user enter number
			while(true) {
				try {
					System.out.println("Enter first number:");
					a = Integer.parseInt(br.readLine());
					break;
				}
				catch(NumberFormatException nfe) {
					System.out.println("wrong input : enter only number");
				}
			}
			//infinite loop to prompt message till user enter number
			while(true){					
				try {
					System.out.println("enter the second number:");
					b = Integer.parseInt(br.readLine());
					try {
						int  c= a/b;
						System.out.println("Result :"+c);
					}
					catch(ArithmeticException ae) {
						System.out.println("Wrong input : Do not pass zero: ");
						continue;
					} 
					break;
				}
				catch(NumberFormatException nfe){
					System.out.println("Wrong input : Enter only number");
				}
			}
		}
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}
public class InnerTryProject {
	public static void main(String[] args) {
		Division.div();
	}

}
