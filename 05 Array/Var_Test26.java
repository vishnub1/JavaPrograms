// Passing Dynamic values

import java.util.Scanner;

class Var_Test26 {
static void add(int...a){
	if (a.length == 0)	{
		System.out.println("Values are not passed !");
	}else{
			int sum = 0;
			for(int i = 0 ; i<a.length; i++){
				sum += a[i];
			}
				System.out.println("Result :"+sum);
		}
}
public static void main(String[] args){

	Scanner sc = new Scanner(System.in);

	System.out.print("How Many values you want to Input ?:");
	int noOfValues = sc.nextInt();

	int[] inputValues = new int[noOfValues];

	for (int i = 0;i<noOfValues;i++){
		System.out.print("Enter num"+(i+1)+":");
		inputValues[i] = sc.nextInt();
		}
		add(inputValues); //input values={n1,n2,n3,n4.....}
	}
}
