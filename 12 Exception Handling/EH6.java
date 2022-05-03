class EH6 {
	public static void main(String[] args){
		try{
			int a = Integer.parseInt(args[0]);
			System.out.println("a :"+a);

			try{
				int [] x = new int[a];
				System.out.println("Arrayb size :"+x.length);
			}catch(NullPointerException npe){
				System.out.println("NPE is raised");
			}
			int b = a + 20;
			System.out.println("b :"+b);
		}catch(ArrayIndexOutOfBoundsException aie){
			System.out.println("pass one int value");
		}catch(NumberFormatException nfe){
			System.out.println("Pass only int values");
		}
		System.out.println("After outer try/catch");
	}
}