import java.util.Scanner;

public class Bank {
	public static void main(String[] args){
		
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter Bank Name :");
		BankAccount.bankName = scn.nextLine();

		System.out.print("Enter Branch Name :");
		BankAccount.branchName = scn.nextLine();

		System.out.print("Enter IFSC :");
		BankAccount.ifsc = scn.nextLine();

		// creating instance for diff customer objects
		System.out.println("How many account do you want to open ?");
		int noOfAccounts = scn.nextInt();

		BankAccount[] acc = new BankAccount[noOfAccounts];
		for(int index = 0;index<noOfAccounts;index++){
			System.out.println("\nEnter Customer"+ (index+1) +" details");
            acc[index] = new BankAccount(); 
            System.out.print("Enter accNum\t: ");
            acc[index].accNum = scn.nextLong();  scn.nextLine();
            System.out.print("Enter accHName\t: ");
            acc[index].accHName =  scn.nextLine();
            System.out.print("Enter balance\t: ");
            acc[index].balance = scn.nextDouble();
            System.out.println("\nEnter Customer"+ (index +1) +" address details");
            acc[index].address = new Address(); 
            System.out.print("Enter dnum\t: ");
            acc[index].address.dnum = scn.next();
            System.out.print("Enter strnum\t: ");
            acc[index].address.strnum = scn.nextInt(); scn.nextLine();
            System.out.print("Enter city\t: ");
            acc[index].address.city = scn.nextLine();
			}
			System.out.println("\n All Account Details");
			for(int index=0; index < noOfAccounts;index++){
				System.out.println("acc"+(index+1)+" details");
				acc[index].display();
				System.out.println();
			}
			System.out.println("\nPerfoming business operations on first account");
             acc[0].deposit(5000);
             double amt = acc[0].withdraw(2000);
             acc[0].currentBalance();
             acc[0].transferMoney(acc2, 5000);
	}
}