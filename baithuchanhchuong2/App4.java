import java.util.Scanner;

public class App4 {
    private static Scanner scanner = new Scanner(System.in);
    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        System.out.printf("Cac so nguyen to nho hon %d la :", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (soNguyenTo(i)) {
                System.out.print(" " + i);
            }
        }   
    }
}
