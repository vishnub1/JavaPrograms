// Addition with Array Program

class Addition{
	static void add(int... a){
		System.out.println(a.length+" values are passed");
		for(int i = 0;i<a.length;i++){
			System.out.println(" values "+(i+1)+" is "+a[i]);
		}
	}
}
class Var_Test22 {
	public static void main(String[] args){
		Addition.add();
		Addition.add(4);
		Addition.add(2,4);
		Addition.add(12,31,44);
		Addition.add(11,33,44,55);
	}
}