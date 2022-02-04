// Addition with Array Program
class Var_Test24 {
	static void add(int... a){
		if(a.length == 0){
		System.out.println("values are not passed");
	}else{
			int sum = 0;
			for (int i = 0;i<a.length ;i++ ) {
				sum = sum + a[i];
			}
			System.out.println("Result :"+ sum);
		}
}
public static void main(String[] args){
	add();
	add(5,6);
	add(5,6,5);
	add(5,6,4,3);
	add(5,6,3,6,7);

	add(new int [] {5,6,7,8,9});
	}
}
