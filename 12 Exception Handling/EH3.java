class EH3 {
	 void m1(){
			System.out.println("1");
			try{
				System.out.println("2");
			}catch(ArithmeticException ae){
				System.out.println("3");
				System.out.println(10/2);
				System.out.println("4");
			}
			System.out.println("5");
		}
}