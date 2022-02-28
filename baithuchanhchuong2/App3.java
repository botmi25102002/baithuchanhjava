import java.util.Scanner;

public class App3 {
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
        System.out.print("Nhap so nguyen duong n = ");
        int n = scanner.nextInt();
        if(soNguyenTo(n)){
            System.out.println(n+" la so nguyen to");
        } else {
            System.out.println(n+" khong la so nguyen to");
        }
       
    }
}
