class NSB01 {
	int x=m1();
	int m1(){
		System.out.println("NSV");
		return 10;
	}
	{
		System.out.println("NSB1");
	}
	NSB01(){
		System.out.println("No Args Const");
	}
	public static void main(String[] args){
		System.out.println(" Main");
		NSB01 n = new NSB01();
	}
	{
		System.out.println("NSB2");
	}
	int y = m2();
	int m2(){
		System.out.println("NSV y");
		return 20;
	}
}