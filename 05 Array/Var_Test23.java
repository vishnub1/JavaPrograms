// Addition with Array Program

class Var_Test23 {
	static void add(int [] a){
		if(a.length==0){
			System.out.println("values are not passed");
		}else{
			int sum = 0;
			for(int i = 0;i<a.length;i++){
				sum = sum + a[i];
			}
			System.out.println("Result:"+sum);
		}
	}
	public static void main(String[] args){
		add(new int[] {});
		add(new int[]{5});
		add(new int[]{5,3});
		add(new int[]{5,3,7});
		add(new int[]{5,3,7,32});
	}
}
