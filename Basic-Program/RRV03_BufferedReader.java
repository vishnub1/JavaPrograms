import java.io.BufferedReader;

class RRV03_BufferedReader {
	public static void main(String[] args) throws io exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Fno:");
		int x = Integer.parseInt(br.readline());

		System.out.print("Enter Sno:");
		int y = Integer.parseInt(br.readline());

		int z = x + y;
		System.out.println("Result :" +z);
	}
}