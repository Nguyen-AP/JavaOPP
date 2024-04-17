package BaiThucHanh;
import java.util.Scanner;

public class PartTime extends Employee {
    public float Luong,Thuong;
    public double SoGiolam;
    public final double Luong1h = 20000;
    }
    public PartTime(){
       TheLoai = "PARTIME";
    }
    public void EnterData(){
        Scanner sc = new Scaner(System.out);
        System.out.print("Nhập Số Giờ Làm: ");
        Luong = sc.nextFloat();
        System.out.print("Nhập Thưởng: ");
    }
    public float TinhLuong(){
      Luong = SoGiolam * Luong1h + Thuong;
        return Luong; 
      
    }


