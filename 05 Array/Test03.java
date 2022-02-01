class Test03 {
	public static void main(String[] args){
		int [] a ;
		for (int i = 0 ;i<10 ;i++ )	{
			a[i] = i * i;
		}
	}
}

//Test03.java:5: error: variable a might not have been initialized
//                        a[i] = i * i;