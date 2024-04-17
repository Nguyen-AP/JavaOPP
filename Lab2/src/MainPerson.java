package BaiThucHanh;
import BaiThucHanh.Fulltime;
import BaiThucHanh.Partime;
import BaiThucHanh.Person;
import BaiThucHanh.Employee1;
public class MainPerson {
    
    public static void main(String[] args) {
        Fulltime p = new Fulltime();
        p.FullTime();
        p.TinhLuong();
        p.Display();
        
        Partime p2 = new Partime();
        p2.PartTime();
        p2.TinhLuong();
        p2.Display();
    }
}

