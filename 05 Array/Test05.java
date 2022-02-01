class Test05 {
	static 	int [] a ;
		public static void main(String[] args){
		for (int i = 0 ;i<10 ;i++ )	{
			a[i] = i * i;
		}
	}
}
//Exception in thread "main" java.lang.NullPointerException:
//Cannot store to int array because "Test05.a" is null