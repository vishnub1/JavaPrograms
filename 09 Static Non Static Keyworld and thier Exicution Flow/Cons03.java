class Cons03{
	Cons03(){
		System.out.println("In Constructor");
	}
	Cons03(int x){
		System.out.println("In Int type constructor");
	}
	public static void main(String[] args){
		System.out.println("In Main");
		Cons03 c = new Cons03();
		Cons03 c1 = new Cons03(20);
	}
}