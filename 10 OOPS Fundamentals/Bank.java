public class Bank {
	// hiding class data
	private double balance;

	public void setBalance(double balance){
		this.balance = this.balance + balance;
	}
	public double getBalance(){
		return balance;
	}
}