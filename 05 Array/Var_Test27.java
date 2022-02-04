// Passing Dynamic Values

import java.util.*;

class Var_Test27 {

	static void add(int...a){
		if(a.length==0){
			System.out.print("Value are not Passed !");
		}
			else{
				int sum = 0;
				for(int i = 0;i<a.length;i++){
					sum +=a[i];
				}
				System.out.println("Result :"+sum);
			}
	}
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		System.out.print("How Many Values you want to enter :");
		int noOfValues = sc.nextInt();
		
		int[] inputValues = new int[noOfValues];

		for(int i = 0;i<noOfValues;i++){
			System.out.print("Enter num"+(i+1)+":");
			inputValues[i]= sc.nextInt();
		}
		add(inputValues);  // input values = {n1,n2,n3,n4,n5...}
	}
}