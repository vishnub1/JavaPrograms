class Example9 {
	int x=10;
	int y=10;

	void m1(){
		Example9 e1 = new Example9();
		e1.x=50;
		e1.y=60;
	}
	public static void main(String[] args){
		Example9 e2 = new Example9();

		System.out.println(e2.x+"..."+e2.y);
		e2.m1();
		System.out.println(e2.x+"..."+e2.y);
	}
}