import java.util.LinkedList;

public class App37 {
    public static void main(String[] agrs){
        LinkedList<String> list = new LinkedList<>();
        list.add("Dat");
        list.add("la");
        list.add("con");
        list.add("khi");
        showlist(list);
        System.out.println("Vi du su dung phuong thuc addAll()");
        System.out.println("===================");
        LinkedList<String> listA = new LinkedList<>();
        listA.addAll(list);
        System.out.println("listA: ");
        showlist(listA);
        System.out.println("\n vi du su dung phuong thuc retainAll");
        System.out.println("\t\t\t=======================================");
        LinkedList<String> listB = new LinkedList<>();
        listB.add("Dat");
        listA.retainAll(listB);
        System.out.println("listA: ");
        showlist(listA);
        System.out.println("\n vi du su dung phuong thuc removeAll");
        System.out.println("\t\t\t=======================================");
        list.removeAll(listB);
        System.out.println("líst: ");
        showlist(list);
    }
    public static void showlist(LinkedList<String> list){
        for(String obj : list){
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}
