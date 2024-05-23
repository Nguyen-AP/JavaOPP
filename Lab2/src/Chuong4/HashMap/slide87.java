package Chuong4.HashMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
public class slide87 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        // thêm giá trị vào trong HashMap với Key tương ứng ta dùng method put()
        hashMap.put("CSLT", "Co So Lap Trinh");
        hashMap.put("C++", "C++");
        hashMap.put("C#", "C Sharp");
        hashMap.put("PHP", "PHP");
        hashMap.put("Java","Java");

        // "khóa", "giatri"
        Set <Map.Entry<String, String>> setHashMap = hashMap.entrySet();
        System.out.println(" Các entry có trong SetHashMap :");
        System.out.println(setHashMap);
    }  
} 
