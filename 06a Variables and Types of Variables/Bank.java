class Bank {
	public static void main(String[] args){
		
		BankAccount acc1 = new BankAccount();
		BankAccount acc2 = new BankAccount();

		BankAccount.setBankDetails("HDFC","UDGIR","HDF1235");

		System.out.println("\n acc1 object Details");
		acc1.setBankAccountDetails(123,"Vishnu",29000);
		acc1.display();

		System.out.println("\n acc2 object Details");
		acc2.setBankAccountDetails(222,"Harsh",80000);
		acc2.display();
			
		acc1.setBankDetails("ICICI","LATUR","ICR1223");

		System.out.println("Account Object Details");
		acc2.display();

		acc1.deposit(7000);
		System.out.println("\n acc1 object details");
		acc1.display();

		acc2.withdraw(5000);
		System.out.println("\n acc2 Details :");
		acc2.display();

		System.out.println("\n acc1 object details:");
		acc1.display();

		System.out.println("\n acc2 object details :");
		acc2.display();
		

	}
}