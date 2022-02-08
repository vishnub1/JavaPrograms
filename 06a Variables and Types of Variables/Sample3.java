// local variable should not be accessed without initialization

class Sample3 {
	public static void main(String[] args){
		int a = 10;
		int b;

		System.out.println("a : "+a);
	//	System.out.println("b : "+b);  error: variable b might not have been initialized

	a = a + 10;
	System.out.println("a : "+a);

	// b = b + 10;error: variable b might not have been initialized
	
	b = 20;
	System.out.println("b:"+b);

	b = b + 20;
	System.out.println("a : "+a);
	System.out.println("b :"+b);

	}
}