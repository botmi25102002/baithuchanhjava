import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class App22 {
    public static void main(String[] agrs){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner p = new Scanner(in);
        int number;
        System.out.println("Nhap so phan tu cua mang: ");
        int n = p.nextInt();
        for(int i=0; i<n; i++){
            System.out.print("nhap phan tu thu "+ i + ":");
            number = p.nextInt();
            arrListInteger.add(number);
        }
        int max = arrListInteger.get(0);
        for(int i=1;i<n;i++){
            while(max<arrListInteger.get(i)){
                max = arrListInteger.get(i);
            }
        }
        System.out.print("Phan tu lon nhat trong mang la: "+max);
    }
}