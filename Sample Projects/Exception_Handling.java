// com.nareshit.blogic
// Bank.java
package com.nareshit.blogic;
import com.nareshit.exceptions.*;
public interface Bank{
	public void deposite(double amt)throws InvalidAmountException;
	public double withdraw(double amt)throws InSufficientFundsException;
	public void balanceEnquiry();
}

// HDFCBank.java
package com.nareshit.blogic;
import com.nareshit.exceptions.*;
public class HDFCBank implements Bank{
	private double balance;
	public void deposite(double amt)throws InvalidAmountException{
		if(amt <= 0) {
			throw new InvalidAmountException(amt+"is invalid amount");
		}
		balance = balance + amt;
	}
	public double withdraw(double amt)throws InSufficientFundsException{
		if(balance < amt) {
			throw new InSufficientFundsException("Insufficient Funds");
		}
		balance = balance - amt;
		return amt;
	}
	public void balanceEnquiry() {
		System.out.println("Current Balance :"+balance);
	}
}



// com.nareshit.exceptions
// InSufficientFundsException.java
package com.nareshit.exceptions;
@SuppressWarnings("serial")
public class InSufficientFundsException extends Exception{
	public InSufficientFundsException(){
		super();
	}
	public InSufficientFundsException(String msg){
		super(msg);
	}
}


// InvalidAmountException.java
package com.nareshit.exceptions;
@SuppressWarnings("serial")
public class InvalidAmountException extends Exception{
	public InvalidAmountException(){
		super();
	}
	public InvalidAmountException(String msg){
		super(msg);
	}
}



// com.nareshit.user
// Cashier.java
package com.nareshit.user;
import java.io.*;
import com.nareshit.blogic.*;
import com.nareshit.exceptions.*;

public class Cashier {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			Bank acc1 = new HDFCBank();
			String option ="";
			do {
				System.out.println("1.Deposite");
				System.out.println("2.Withdraw");
				System.out.println("3.Balance Enquairy");
				System.out.println("==Enter Option 👇👇==");
				option = br.readLine();
				switch(option) {
				case "1":{
					System.out.print("Enter Deposite Amount :");
					String s = br.readLine();
					double amt = Double.parseDouble(s);
					
					acc1.deposite(amt);
					acc1.balanceEnquiry();
					break;
				}
				case "2":
				{
					System.out.print("Enter Withdraw Amount :");
					String s = br.readLine();
					double amt = Double.parseDouble(s);
					
					double withDrawAmt = acc1.withdraw(amt);
					System.out.println("Withdrawn amount :"+withDrawAmt);
					
					acc1.balanceEnquiry();
					break;
				}
				case "3":
				{
					acc1.balanceEnquiry();
					break;
				}
				default:
					System.out.println("Invalid Option");
				}
				System.out.println("Do you want to continue(Yes/No)");
				option  = br.readLine();
			}while(option.equalsIgnoreCase("Yes"));
		}catch(InvalidAmountException ie) {
			System.out.println(ie.getMessage());
		}catch(InSufficientFundsException e) {
			System.out.println(e.getMessage());
		}catch(NumberFormatException e) {
			System.out.println("Please enter ONLY number");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
