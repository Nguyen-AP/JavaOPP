package ABC;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrList {
    public static void main(String[] args) {
         int n;
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap n:");
        n = sc.nextInt();
        ArrayList<Person> arrlist = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            Person ps = new Person();
            ps.NhapThongTin();
           arrlist.add(ps);
    }
    System.out.printf("--------------------------------\n");
    for(int i = 0; i < arrlist.size(); i++) {
        
        arrlist.get(i).XuatThongTin();
    }
}
}
