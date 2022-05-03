class EXc2 {
	public static void main(String[] args){
		try{
			System.out.println(10/0);
		}catch(Exception e){
			System.out.println("get message");
			System.out.println(e.getMessage());

			System.out.println("toString");
			System.out.println(e.toString());

			System.out.println("printStackTrace");
			e.printStackTrace();

			System.out.println("JVM Default Output");
			throw e;

		}
	}
}