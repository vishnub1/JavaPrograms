class Cons01 {
	Cons01(){
		System.out.println("Constructor");
	}
	public static void main(String[] args){
		System.out.println("MAIN");
		Cons01 c = new Cons01();
//		Cons01();    
		
//		Rule: Constructor must be calling along with new Keyword , else CE
	}
}