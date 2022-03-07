import java.util.Scanner;
public class App8c {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0; i<= n; i++){
            sum += i;
        }
        System.out.printf("tbc cua day so la: %d", sum / n);
    }
}