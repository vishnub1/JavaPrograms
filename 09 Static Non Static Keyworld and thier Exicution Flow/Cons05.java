// non static block example.

class Cons05 {
	{
		System.out.println("in Non Static block");
	}
	Cons05(){
		System.out.println(" Not Arg Cons\n");
	}
	Cons05(int x){
		System.out.println("int Args cons");
	}
	public static void main(String[] args){
		System.out.println("Main");
		Cons05 c = new Cons05();
		Cons05 c1 = new Cons05(10);
	}
}