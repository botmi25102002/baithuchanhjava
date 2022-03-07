import java.util.Scanner;

public class App81 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so hang: ");
        int n = sc.nextInt();
        System.out.print("Nhap so cot: ");
        int m = sc.nextInt();
		int[][] arr = new int[n][m];
		for(int i = 0; i < n; i++){
           for(int j = 0; j < m; j++){
               System.out.print("Nhap vao gia tri cho phan tu thu ["+i+","+j+"] :");
              arr[i][j] = sc.nextInt(); 
           } 
		}
       int max = 0;
       for(int i = 0; i < n; i++){
        for(int j = 0; j < m; j++){
            if (arr[i][j] > max){
                max = arr[i][j];
            }
        } 
    }
    System.out.printf("Max of array is: %d", max);
}
}