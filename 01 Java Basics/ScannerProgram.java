import java.util.Scanner;

public class ScannerProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter Fno");
        int fno = sc.nextInt();

        System.out.print("enter Sno:");
        int sno = sc.nextInt();

        int addition = fno + sno;
        System.out.print("Addition is :" + addition);
    }
}
