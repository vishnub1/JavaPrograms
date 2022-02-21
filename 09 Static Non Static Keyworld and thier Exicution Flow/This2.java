class This2 {
	int x = 10;
	int y = 20;

	void m1(){
		System.out.println("x :"+this.x);
		System.out.println("y :"+this.y);
		System.out.println("  ");
		int x =50;
		System.out.println("x :"+x);
		System.out.println("x :"+this.x);  //x=10 class level why?
		System.out.println("y :"+this.y);

	}
	public static void main(String[] args){
		This2 t = new This2();

		t.m1();
	}
}