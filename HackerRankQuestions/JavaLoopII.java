public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
      int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int sum = a;
            for (int j = 0; j < n; j++) {
                sum += b * Math.pow(2, j);
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
// output
//2 6 14 30 62 126 254 510 1022 2046 
//8 14 26 50 98 
