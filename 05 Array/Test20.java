class Addition {
		static void add(){
		System.out.println("no-args");
	}
	static void add(int a){
		System.out.println("1 int arg");
	}
	static void add(int a, int b){
		System.out.println("2 int array");
	}
	static void add(int a, int b, int c){
		System.out.println("3 int array");
	}
	static void add(int a ,int b,int c, int d){
		System.out.println("4 int array");
	}
}
public class Test20 {
	public static void main(String[] args){
		Addition.add();
		Addition.add(5);
		Addition.add(5,7);
		Addition.add(5,7,8);
		Addition.add(5,7,8,9);
	}
}
