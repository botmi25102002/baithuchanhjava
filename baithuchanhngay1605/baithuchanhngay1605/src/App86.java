import java.util.HashMap;
import java.util.Set;
public class App86{

public static void main(String[] args) {

    // khai báo 1 HashMap có tên là hashMap
    
    // kiểu dữ liệu của key và value là String 
    
    HashMap<String, String> hashMap = new HashMap<>();
    
    
    hashMap.put("CSLT", "Cơ sở lập trình");
    
    hashMap.put("C++", "C++");
    
    hashMap.put("C#", "C Sharp");
    
    hashMap.put("PHP", "PHP");
    
    hashMap.put("Java", "Java");

    
    Set<HashMap.Entry<String, String>> setHashMap = hashMap.entrySet();
    
    System.out.println("Các entry có trong setHashMap:"); 
    System.out.println(setHashMap);
    
    }
}