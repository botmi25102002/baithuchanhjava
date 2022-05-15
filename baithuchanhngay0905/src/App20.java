import java.util.ArrayList;
public class App20 {
    public static void main(String[] agrs){
        ArrayList<String> arrListString = new ArrayList<>();
        arrListString.add("Dat");
        arrListString.add("chơi");
        arrListString.add("game");
        arrListString.add("gioi");
        arrListString.add("ghe");
        for(String Number : arrListString){
            System.out.print(Number + " ");
        }
        arrListString.remove("gioi");
        arrListString.set(3,"hay");
        System.out.println();
        for(String number : arrListString){
            System.out.print(number + " ");
        }
    }
}