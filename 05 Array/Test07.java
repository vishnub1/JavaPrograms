// develop a progrma to store the 5 integer and display them using array 

 class Test07_01 {
	public static void main(String[] args){

		// array variable declaration
		int [] ia1 = new int[5];		

	  //reading runtime values from array
		System.out.println(ia1[0]);
		System.out.println(ia1[1]);
		System.out.println(ia1[2]);
		System.out.println(ia1[3]);
		System.out.println(ia1[4]);
		System.out.println();
		
		// Initialization array object
		 ia1[0] = 3;
		 ia1[1] = 4;
		 ia1[2] = 5;
		 ia1[3] = 6;
		 ia1[4] = 7;

	//reading runtime values and displaying values available in array
		for (int i = 0 ;i<ia1.length ;i++)	{
		System.out.println(ia1[i]);

		System.out.println();
		// modified values 
		ia1[1] = 8;
		ia1[2] = 12;

	// displaying array modified values

	System.out.println(java.util.Arrays.toString(ia1));
	
		}
	}
}
