import java.util.Scanner;

public class App2c {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so can kiem tra a = ");
        int a = sc.nextInt();
        if(a%2 == 0){
            System.out.printf("%d la so chan", a);
        }else{
            System.out.printf("%d la so le", a);
        }
    }
}