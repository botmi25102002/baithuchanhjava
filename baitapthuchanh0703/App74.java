import java.util.Scanner;

public class App74 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so phan tu trong mang la: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
        System.out.print("Nhap vao gia tri cho phan tu thu " + ( i + 1 ) + " ");
			arr[i] = sc.nextInt();
		}
        int sum = 0;
        for(int i = 0; i < n; i++){
        if(arr[i] % 2 == 0){
				sum+= arr[i];
        }
    }
        
        System.out.print(sum);
    }
}