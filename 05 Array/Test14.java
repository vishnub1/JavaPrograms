class Test14 {
	static void m1(int[] ia){
		ia[2] = 5;
}
	public static void main(String[] args){
		int[] ia = {10,20,30,40};
		m1(ia);

		for(int i = 0;i<ia.length;i++){
			System.out.println(ia[i]+"\t");
		}
	}
}
	 