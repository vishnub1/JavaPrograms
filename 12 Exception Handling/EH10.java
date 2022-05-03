class EH10 {
	public static void main(String[] args){
		try{
			System.out.println("In try");
		}finally{
			System.out.println("in finally");
		}
		System.out.println("after try/catch/finally");
	}
}