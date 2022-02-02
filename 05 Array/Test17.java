import java.util.Arrays;

class Test17 {
	static int[] ia1 = new int[5]; 
//	int [] ia2 = {10,22,33,44};       non-static variable ia2 cannot be referenced from a static context


	 public static void main(String[] args){
		 int[] ia3 = new int[3];
		 		
	System.out.println(ia1[2]);
//	System.out.println(ia2[2]);
	System.out.println(ia3[2]);

		Test17 t = new Test17();
		System.out.println(t.ia1[3]);
	 }
}


