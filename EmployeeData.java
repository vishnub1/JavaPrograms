import java.util.Scanner;
public class EmployeeData {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Eno: ");
		int eno = sc.nextInt();

		sc.nextLine();

		System.out.print("Enter the Ename: ");
		String ename = sc.nextLine();

		System.out.print("Enter the Salary: ");
		Double sal = sc.nextDouble();

		sc.nextLine();

		System.out.print("Enter the Dept: ");
		String dept = sc.nextLine();
		
		System.out.println();
		System.out.println("Confirm the Employee Details:");
		System.out.println("Eno  : "+eno);
		System.out.println("Ename: " +ename);
		System.out.println("Salary: " +sal);
		System.out.println("Dept  :" +dept);
	}
}