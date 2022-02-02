class Example {
	int x = 10;
	int y = 20;
	//Static {
// System.out.println("Example is loaded : ");
	}
//	System.out.println("Example object is created: ");
//	}
//}
// test 
	class Test18	{
		static Example[] e1 = new Example[5];
		Example[] e2 = {new Example(),new Example()};

		public static void main(String[] args){
			System.out.println("Test main");
			Example [] e3 = new Example[2];

			System.out.println("e3 array is created ");

			e1[1] = new Example();
			e1[1] = new Example();
			System.out.println(e1[1].x);
//			System.out.println(e2[1].x);
			System.out.println(e3[1].x);

			Test18 t = new Test18();

			System.out.println(t.e2[1].x);

			System.out.println(e1[0].x);
			System.out.println(t.e2[0].x);
//			System.out.println(e3.e2[0].x);
			System.out.println(t.e1[1].y);
		}

	}