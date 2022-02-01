class Test07_01 {
	public static void main(String[] args){
		//array variable declaration
		//String [] sal;
		//array object creation 
		//sal = new String[5];
		
		String [] sal = new String[5];
		
		System.out.println(sal[0]);
		System.out.println(sal[1]);
		System.out.println(sal[2]);
		System.out.println(sal[3]);
		System.out.println(sal[4]);

		// initializing the array opbject 
		sal[0] = "Hk";  
		sal[1] = "Vishnu";  
		sal[2] = "Harsh";  
		sal[3] = "Mangesh";  
		sal[4] = "Sanket";
		
		//displaying the arry using for loop

		for (int i = 0 ;i<sal.length ;i++ )	{
			System.out.println("Friends Name:"+ sal[i]);
		}
			System.out.println();

			sal[1] = sal [1].toUpperCase();
			System.out.println(java.util.Arrays.toString(sal));
	}
}