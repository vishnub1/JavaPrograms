class Example1 {
	static int a = 20;
//	int a = 20; // error: variable a is already defined in class Example1
	
	public static void main(String[] args){
		// it is allowed to define " a" variable in method this method  
		int a = 30;

		// creatying local variable
		int p = 20;
		System.out.println(a);  // accessing local value 30
		//double p = 30;       CE
	}
	static void m1(){
		int p =40;
	}
}