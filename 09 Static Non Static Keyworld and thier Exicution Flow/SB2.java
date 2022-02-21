class SB2 {
	public static void main(String[] args){
		System.out.println("main");
	}
	static {
		System.out.println("SB");
	}
	static {
		System.out.println("SB2");
	}
}

/*OP
SB
main
SB2
*/