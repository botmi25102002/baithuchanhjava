import java.util.Scanner;

public class App35 {
 public static void main(String[] args){
  int a, b; 
  Scanner sc = new Scanner(System.in);
  System.out.println("Nhập vào số thứ nhất: ");
      a = sc.nextInt();
  System.out.println("Nhập vào số thứ hai: ");
      b = sc.nextInt();
   int minNumber = a;
if (a > b) 
      minNumber = b;
  System.out.println("Số nhỏ nhất trong hai số " + a+ " và "+ b+ "là " + minNumber);
    } 
}