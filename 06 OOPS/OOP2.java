class BankAccount {
	String name;
	long ano;
	double balance;
	
}
public class OOP2 {
	public static void main(String[] args){
		BankAccount b1 = new BankAccount();
		b1.name   = "vishnu Biradar";
		b1.ano    = 33625224;
		b1.balance= 500012.23;

		BankAccount b2 = new BankAccount();
		b2.name   = "Harsh Biraris";
		b2.ano    = 89548449;
		b2.balance= 566652.23;

	
		System.out.println(b1.name);
		System.out.println(b1.ano);
		System.out.println(b1.balance);
		System.out.println();

		System.out.println(b2.name);   
		System.out.println(b2.ano);    
		System.out.println(b2.balance);
		System.out.println();
	}
}