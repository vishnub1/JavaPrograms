class This1 {
	int x = 10;
	int y = 20;

	void m1(){
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		int x =50;
		System.out.println("x :"+x);
		System.out.println("x :"+this.x);  //x=10 class level why?
		System.out.println("y :"+y);
	}
	public static void main(String[] args){
		This1 t = new This1();
		t.m1();
	}
}