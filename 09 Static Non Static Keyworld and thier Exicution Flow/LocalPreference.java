class LocalPreference {
	static int a=10;
	static int b=20;

	public static void main(String[] args){
		System.out.println(a+"..."+b);			// local prefernce
		a=150;
		System.out.println(a+"..."+b);
	}
}