import java.util.HashSet;
import java.util.Scanner;

public class App56 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name;
        int n;

        HashSet<String> hashSetString = new HashSet<>();

        hashSetString.add("Truong");
        hashSetString.add("Xuan");
        hashSetString.add("Pham");
    
        System.out.println("Cac phan tu trong hashSetString: ");
        System.out.println(hashSetString);
        System.out.println("nhap so luong phan tu can xoa");
        n = sc.nextInt();
        name = sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Xoa phan tu thu: " + (i+1));
            name = sc.nextLine();
        
        if(hashSetString.contains(name)){
            hashSetString.remove(name);
            System.out.println("Cac phan tu con lai trong hashSetString ");
            System.out.println(hashSetString);
        }else{
            System.out.println("xoa khong thanh cong");
        }
     }}
}
