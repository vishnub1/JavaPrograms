public class Cons02 {
	Cons02(){
		System.out.println("IN Construtor");
	}
	void Cons02(){
		System.out.println("IN Method");
	}
	public static void main(String[] args){
		Cons02 c = new Cons02();          // goto line 3   constructor called
		c.Cons02();						  //  goto line6    method called
	}
}