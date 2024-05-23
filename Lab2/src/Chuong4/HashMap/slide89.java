package Chuong4.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
public class slide89{
    public static void main(String[] args) {
        HashMap<String, String> hashMapcity = new HashMap<>();
        hashMapcity.put("QNg", "Quang Ngai");
        hashMapcity.put("QN", "Quang Nam");
        hashMapcity.put("QN", "Quang Ninh");
        hashMapcity.put("HCM", "Thanh Pho Ho Chi Minh");
        System.out.println(" Danh sach cac thanh pho trong hashMapCity : ");
        Set<Map.Entry<String, String>> setCity = hashMapcity.entrySet();
        System.out.println(setCity);
        // lay thanh pho co ma la Qng va hien thi ten thanh pho
        System.out.println("Qng: " + hashMapcity.get("QNg"));
        // lay thanh pho co ma la NT nhung ko co nen hien thi null
        System.out.println("NT: " + hashMapcity.get("NT"));
        // de kiem tra mot thanh pho co trong HashMap hay khong,ta dung containsvalue()
        if(hashMapcity.containsValue("Thanh Pho Ho Chi Minh")){
            System.out.println("Co trong hash map");
        }
    }
}