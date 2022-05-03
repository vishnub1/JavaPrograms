class EH4 {
	public static void main(String[] args){
		try{
			System.out.println("Outer try");
			try{
				System.out.println("inner try");
				System.out.println(10/0);
			}catch(Exception e){
			    System.out.println("in inner catch");
			}
				System.out.println("after inner try/catch");
		}catch(Exception e){
			System.out.println("In outer catch");
		}
		System.out.println("In outer catch");
	}
}