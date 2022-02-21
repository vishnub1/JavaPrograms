//static variable and static block

class Example10{
	static int a =10;
	
	static {
		System.out.println("Ststic block a :"+a);
	//	System.out.println("Ststic block a :"+b);
		System.out.println("Ststic block a :"+Example10.b);
	}
		public static void main(String[] args){
			System.out.println("Main a :"+a);
			System.out.println("Main b :"+b);
		}
	static int b = 20;
}