import java.util.*;
class A {
	void m1(int...ia){
		System.out.println(ia.length+"values are Passed");
		for(int i:ia){
			System.out.println(" "+i);
		}
	}
}
class Var_Test28
	{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter number with space separator:");
		String input = scn.nextLine();
		int[] iNums = null;

		if(input.isEmpty()){
			iNums = new int[0];
		}
		else{
			//splitting string into individual numbers
			String[] sNums = input.split(" ");

			//creating array with size to given nums
			iNums = new int[sNums.length];

			if(sNums.length !=0){
		//Copying nums from sNums to iNums array 
		 // by converting numbers from String form to int form 
		for (int i= 0;i<sNums.length ; i++){
			iNums[i] = Integer.parseInt(sNums[i]);
			}
	}
}
// invoking var-arg method by passing array witj 0 n nummber of values
A a1 = new A();
a1.m1(iNums);
	}
}

// OutPut

//	Enater number with space separator:
//	12 134 567 895 45443 33 67
//	7values are Passed
//	12
//	134
//	567
// 895
// 45443
// 33
// 67
// Press any key to continue . . .