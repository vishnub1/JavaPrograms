import java.util.Scanner;
class  Addition{
	public static void main(String[] args) 	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int x = sc.nextInt();
		System.out.println("Enter the Second number: ");
		int y = sc.nextInt();

		int z = x + y;
		System.out.println("Result: "+ z);
	}
}
