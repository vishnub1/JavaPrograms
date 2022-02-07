// limitations of variables a vales changes 

class Sample {
	public static void main(String[] args){
		int a = 30;
		System.out.println(a);
		a = 40;
		System.out.println(a);
		
		Sample e1 = new Sample();
		System.out.println(e1);
		e1= new Sample();
		System.out.println(e1);
	}

}