class EH12 {
	public static void main(String[] args){
		System.out.println(m1());
	}
	static int m1(){
		try{
			System.out.println("In try");
			System.out.println(10/0);		
		}catch(NullPointerException e){
			System.out.println("In catch");
		}finally{
			System.out.println("in finally");
			return 30;
		}
	}
}