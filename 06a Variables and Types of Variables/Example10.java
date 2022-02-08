class Example10 {
	static void m1(int p){
		int q = 10;

		if (p==10)	{
			int r = 20;
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
			System.out.println();
		}
		    System.out.println(p);
			System.out.println(q);
		//	System.out.println(r);
	}
		public static void main(String[] args){
			// Q how many variables are created from the below method call?
			m1(10);
			m1(20); // only one method is exicuted because 
					// when p==10 then only if will execute and put the value og r also
		}
}