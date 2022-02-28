import java.util.Scanner;

public class App1 {
    private static Scanner scanner = new Scanner(System.in);
    public static int USCLN(int a, int b) {
            if (b == 0) return a;
            return USCLN(b, a % b);
        }
    public static void main(String[] args) {
        System.out.print("Nhap so nguyen duong a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen duong b = ");
        int b = scanner.nextInt();
        System.out.println("USCLN của " + a + " và " + b
                + " là: " + USCLN(a, b));
    }
}
