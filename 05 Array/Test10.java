class Test10 {
	public static void main(String[] args){
	// First syntax:
	  // we must choose this syntax if we know type of values and number of values
	// and the actual values are coming at run time in the next line of code
		int [] ia = new int[5];

		ia[0] = 3;
		ia[1] = 4;
		ia[2] = 5;
		ia[3] = 6;
		ia[4] = 7;

		System.out.println(java.util.Arrays.toString(ia));

	//second syntax initialzer syntax{}
	//we muust choose this syntax if we know type of values number of values 
	//and also actual values to store.

		int[] ia2 = {1,2,3,4,5};
		System.out.println(java.util.Arrays.toString(ia2));

	}
}