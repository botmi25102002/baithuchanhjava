import java.util. TreeSet;

import java.util.Set;

import java.util.Scanner;

public class App69 { 
    public static void main(String[] args) { 
        int number;
        TreeSet<Integer> treeSetInteger = new TreeSet<>(); 
        Scanner scanner = new Scanner(System.in);

        treeSetInteger.add(25);

        treeSetInteger.add(10);

        treeSetInteger.add(2002); 
        
   


        System.out.println("Các phần tử trong treeSetInteger: ");

        System.out.println(treeSetInteger); System.out.println("Nhập phần tử cần thêm: ");

        number = scanner.nextInt();


        if (!treeSetInteger.contains (number)) {

            treeSetInteger.add(number);

            System.out.println("Thêm thành công!");

            System.out.println("Các phần tử trong treeSetInteger sau khi thêm: "); 
            
            System.out.println(treeSetInteger);

            } else {

            System.out.println("Phần tử " + number + " đã tồn tại!");

            }
        }
    }                
