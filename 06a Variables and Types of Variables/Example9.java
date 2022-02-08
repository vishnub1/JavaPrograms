// life time and scope of a variable

class Example9 {
	static int a;
	static boolean b;
	static String s;

	public static void main(String[] args){
		System.out.println(a); // 0
		System.out.println(b); // false
		System.out.println(s); // null
	}
}