class Test02_ArrayValues {
	public static void main(String[] args){
		int [] a = {50,60,70,80,90};

		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println();

		// wrong coding standard 
		/* reason static code if size is change code should be
		modified according to the current size.
		*/
		
		for(int i = 0; i<a.length; i++){
			System.out.println(a[i]);
	// correct coding standard

		}
	}

}