//// Addition with Array Program

class Addition{
	static void add(int[] a){
		System.out.println(a.length+" values array is passed");
		

		for (int i=0;i<a.length;i++) {
			System.out.println("value  "+(i+1)+"  is "+a[i]);
		}
	}
}
public class Var_Test21 {
	public static void main(String[] args){
	//	Addition.add();
	//	Addition.add(new int[]{   }); // 0 values are passed
	//	Addition.add(new int[]{3 }); // 1 values are passed
		Addition.add(new int[]{3 ,2}); // 2 values are passed
		Addition.add(new int[]{3,1,6,8}); //4  values are passed
		
	}
}