class Test {
	public static void main(String[] args){
		System.out.println("Original Values");
		System.out.println("From mm a"+ Example.a);
		Example.m2();

		Example.m1();

		System.out.println("/a After modifying val in m1 ");
		System.out.println("From MM a "+Example.a);
		Example.a =60;

		System.out.println("\n After modifying val in mm ");
		System.out.println("From mm "+Example.a);

	}
}
