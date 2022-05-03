public class EH13 {
	public static void main(String[] args){
		System.out.println(m1());
	}
	static int m1(){
		try{
			System.out.println("In outer try");
			try{
                System.out.println("In inner Try");
				System.out.println(10/0);
       		}
			catch(NullPointerException ee){
				System.out.println("in inner catch");
			}
			finally{
				System.out.println("In inner finally");
				return 20;
			}
		//	System.out.println("After inner try/catch/finally");
		}
		catch(NullPointerException e){
			System.out.println("In outer catch");
		}
		finally{
			System.out.println("in outer finally");
		}
		System.out.println("After outer try/catch/finally");
		return 10;
	}
}