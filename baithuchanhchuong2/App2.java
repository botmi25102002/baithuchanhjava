import java.util.Scanner;

public class App2 {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhap canh thu nhat a = ");
        int a = scanner.nextInt();
        System.out.print("Nhap canh thu hai b = ");
        int b = scanner.nextInt();
        System.out.print("Nhap canh thu ba c = ");
        int c = scanner.nextInt();
        if ((a+b<c)&&(a+c<b)&&(b+c<a)){  
            System.out.print("day khong phai la tam giac, vui long nhap lai!!!"); 
        }else {
            }if( a == b && b == c){
                System.out.print("Day la tam giac deu");
            }else if(a == b || b == c || c == a ){
                    if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
                        System.out.print("Day la tam giac vuong can");
                    }else{
                        System.out.print("Day la tam giac can");
                  }
            }else if(a*a + b*b == c*c || b*b + c*c == a*a || c*c + a*a == b*b){
                System.out.print("Day la tam giac vuong");
            }else{
                System.out.print("Day la tam giac thuong");
            }
    }
}
