import java.util.HashSet;
import java.util.Scanner;

public class App54{
    public static void main(String[] args){
        int number;
        int n;
        HashSet<Integer> hashSetInteger = new HashSet<>();
        Scanner scanner = new Scanner(System.in);


        hashSetInteger.add(2);
        hashSetInteger.add(1);
        hashSetInteger.add(6);
        

        System.out.println(" Cac phan tu co trong hashSetInterger: ");
        System.out.println(hashSetInteger);
        System.out.println("Nhap so phan tu can them:");
        n = scanner.nextInt();
        //System.out.println("Nhap phan tu can them: ");
        //number = scanner.nextInt();

    for(int i = 0; i < n; i++){
        System.out.println(" Nhap phan tu thu " + (i+1));
        number = scanner.nextInt();
    
        if(!hashSetInteger.contains(number)){
            hashSetInteger.add(number);
            System.out.println(" Them thanh cong");
            System.out.println(" Cac phan tu trong hashSetInteger sau khi them: ");
            System.out.println(hashSetInteger);
        }else{
            System.out.println("Phan tu " + number + " da ton tai!");
        }
    }
    }}
