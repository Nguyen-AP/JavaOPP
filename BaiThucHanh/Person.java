package BaiThucHanh;
import java.util.Scanner;
public class Person {

public class Person {
        public String name;
        public String age;
        public String TheLoai;

}
public void ChonMang(){
    System.out.println("******" + TheLoai + "*****");
}
public void NhapThongTin(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap ten: ");
    name=sc.nextLine();
    System.out.print("Nhap tuoi: ");
    age=sc.nextLine();
}
public void XuatThongTin(){
    System.out.println("Ten: "+name);
    System.out.println("Tuoi: "+age);
}
}