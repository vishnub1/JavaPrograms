// variable declaration simple program

class Sample1 {
	public static void main(String[] args){
		int a = 50;
		System.out.println("First a:"+a);
		a = 70;
		System.out.println("after intializing :"+a);

		Sample1 s1 = new Sample1();
		System.out.println("Object wala :"+s1);

		s1 = new Sample1();
		System.out.println("New Object wala :"+s1);
	}

}