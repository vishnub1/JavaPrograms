class Test_11 {
	public static void main(String[] args){

		int[] ia1 = new int[5];
		int[] ia2 = {3,4,5,6,7};
		m1(ia1);
		m1(ia2);

		m1(new int[7]);
		//m1({2,3,4,5,6});
		m1(new int[]{5,2,2,4,5});

	// anonymous array
		//if we want to create a array object with explicit values to pass
		//if as argument and return value of a method without explicit
		//referenced variable we must use third syntax combination of both new and {}.
	}

	static void m1(int[] ia){
		System.out.println(java.util.Arrays.toString(ia));
	}
}