class Example11{
	 int a =10;
	
    {
		System.out.println("NON Ststic block a :"+a);
//		System.out.println("NON Ststic block a :"+b);
		System.out.println("NON Ststic block a :"+this.b);
	}
		public static void main(String[] args){
			Example11 e = new Example11();
			System.out.println("Main a :"+e.a);
			System.out.println("Main b :"+e.b);
		}
	int b = 20;
}