class EH9 {
	public static void main(String[] args){
		try{
			System.out.println("In try");
			System.out.println(10/0);
		}catch(NullPointerException ne){
			System.out.println("In catch");
		}finally{
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");
	}
}