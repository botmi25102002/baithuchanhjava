import java.util.Scanner;

public class App47 {

  public static void main(String[] args) {

    int n, sum = 0;

    Scanner scanner = new Scanner(System.in);      

    do {

     System.out.println("Nhập vào số nguyên bất kỳ: ");

       n = scanner.nextInt();

       sum += n;

   } while (sum < 100); 

     System.out.println("Tổng các số nguyên vừa nhập = "+sum);

    } }
