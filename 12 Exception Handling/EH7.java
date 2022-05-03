class EH7 {
	public static void main(String[] args){
		try{
			System.out.println("In try");
		}catch(ArithmeticException ae){
			System.out.println("In catch");
		}finally{
			System.out.println("in finally");
		}
		System.out.println("last");
	}
}