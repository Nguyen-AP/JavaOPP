package BaiThucHanh;
import java.util.Scanner;
public class Employee1 extends Person{
    public String MaNhanVien;

public void Nhap(){
    super.NhapThongTin();
    super.XuatThongTin();
    Scanner sc = new Scanner(System.in);
    System.out.println("Nhap ma nhan vien:");
    MaNhanVien = sc.nextLine();
   
}
public void In(){
    System.out.println("Ma nhan vien: "+MaNhanVien);
  
}
public void Display(){
    System.out.printf("Luong cua ban la :" + Luong + "dong");
}
}