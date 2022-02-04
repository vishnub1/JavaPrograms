// PassingDynamic vales  Addition

import java.util.Scanner;

class Var_Test25 {
	static void add(int...a){
		if(a.length==0){
			System.out.println("values are not Passed");
		}
		else{
			int sum = 0;
			for(int i = 0;i<a.length;i++){
				sum += a[i];
			}
			System.out.println("Result :"+sum);
		}
	}
public static void main(String[] args){

	Scanner sc =  new Scanner(System.in);

	System.out.print("Enter the Num 1: ");
	int n1 = sc.nextInt();

	System.out.print("Enter the Num 2: ");
	int n2 = sc.nextInt();

	System.out.print("Enter the Num 3: ");
	int n3 = sc.nextInt();

	add(n1,n2,n3);
	}
}
