//  Develop a program to defined a method with two parameter to take two integers
//inside this method and subtract those two values separetely and return those result

//inside main method we call this method and display return values


class AddSub {
	static int[] addSub(int a, int b){
		int add = a + b;
		int sub = a - b;

	//approach #1
//	int[] ia1 = new int[2];
//	int [0] = add;
//	int [1] = sub;
//	return ia1;

// approach 02;
//	int[] ia2 = {add,sub};
//	return ia2;


//approach 03 
	return new int[]{a+b,a-b};	
	}
}
	class Test09 {
		public static void main(String[] args){
			int[] ia = AddSub.addSub(5,6);
			System.out.println("Addition "+ia[0]);
			System.out.println("substraction "+ia[1]);

	}
}	
