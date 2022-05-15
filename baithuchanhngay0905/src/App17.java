import java.util.ArrayList;
public class App17 {
    public static void main(String [] agrs){
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        arrListInteger.add(2);
        arrListInteger.add(5);
        arrListInteger.add(10);
        arrListInteger.add(2002);
        System.out.println("Cac phan tu co trong arrListInteger la: ");
        for(int number : arrListInteger){
            System.out.print(number + " ");
        }
    }
}