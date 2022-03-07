import java.util.Scanner;

public class App1c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thu nhat, a = ");
        int a = sc.nextInt();
        System.out.print("Nhap so thu 2, b = ");
        int b = sc.nextInt();
        System.out.println("a + b = " + (a + b));
		System.out.println("a - b = " + (a - b));
		System.out.println("a * b = " + (a * b));
		System.out.println("a / b = " + (a / b));
		System.out.println("a % b = " + (a % b));
        if(a < b){
            System.out.printf("%d be hon % d", a, b);
        }else if(a > b){
            System.out.printf("%d lon hon % d", a, b);
        }else{
            System.out.printf("%d bang % d", a, b);
        }
    }
}