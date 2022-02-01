class Test01_Array {
	public static void main(String[] args) {
		// array variable declaration
		int [] ia1;

		//array object creation
		ia1 = new int[5];

		//reading and displaying values from array
		System.out.println(ia1[0]);
		System.out.println(ia1[1]);
		System.out.println(ia1[2]);
		System.out.println(ia1[3]);
		System.out.println(ia1[4]);
		System.out.println();

		//intializing array object
		ia1[0] = 3;
		ia1[1] = 4;
		ia1[2] = 5;
		ia1[3] = 6;
		ia1[4] = 7;


		//reading and displaying values available in array
		for (int i = 0 ;i<ia1.length ;i++ ){
			System.out.println(ia1[i]);
		}
		System.out.println();

		//modified array values

		ia1[1] = 8;
		ia1[4] = 9;

		//displaying array modified values

		System.out.println(java.util.Arrays.toString(ia1));

	}
}
