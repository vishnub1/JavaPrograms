public class BankAccount{
	// BankAccount proprties 
	private long accNO;
	private double balance;
	private String username;
	private String password;

	//parameterized constructor to intialize instance
	public BankAccount(long accNo, double balance, String username,String password){
		this.accNO	=accNO;
		this.balance=balance;
		this.username=username;
		this.password=password;
	}
	// BankAccount Behaviours(an operation a transaction)

	public void deposite(double amt)throws InvalidAmountException{
		if (amt<=0){
			throw new InvalidAmountException();
		}
		balance = balance+ amt;
	}
	public double withdraw(double amt)throws InsufficientFundsException();
	if(balance<amt){
		throw new InsufficientFundsException();
	}
		balance = balance-amt;
		return amt;
	}
}
