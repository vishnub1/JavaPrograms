class Test08 {
	public static void main(String[] args){
		
		int [] ia1 = new int [5];
		int [] ia2 = {3,3,45,56,1};
		
		m1(ia1);
		m1(ia2);
		m1(new int[7]);
		m1(new int[] {51,5,1,4,5});
	}
	static void m1(int[] ia ){

		System.out.println(java.util.Arrays.toString(ia));
	}
}