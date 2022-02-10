class BankAccount {
	static String bankName;
	static String branchName;
	static String ifsc;

	long accNum;
	String accHName;
	double balance;

	static void setBankDetails(String bankN,String branchN,String ifc){
		bankName = bankN;
		branchName = branchN;
		ifsc = ifc;
	}
	void setBankAccountDetails(long accN,String accHN,double bal){
		accNum = accN;
		accHName = accHN;
		balance = bal;
	}
	void deposit(double amt){
		balance = balance + amt;
	}
	void withdraw(double amt){
		balance = balance - amt;
	}
	void currentBalance(){
		System.out.println(balance);
	}

	static void bankName(){
		System.out.println(bankName);
	}
	static void branchName(){
		System.out.println(branchName);
	}
	static void ifsc(){
		System.out.println(ifsc);
	}
	void display(){
		System.out.println("Bank Name \t:"+bankName);
		System.out.println("Branch Name\t:"+branchName);
		System.out.println("ifsc code\t:"+ifsc);
		System.out.println("accNum\t\t:"+accNum);
		System.out.println("accHName\t:"+accHName);
		System.out.println("balance \t:"+balance);
	}
}