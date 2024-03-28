package BaiThucHanh;
import java.util.Scanner;
    public class FullTime extends Employee {
        public final double Luongfull = 30000;
    
    public FullTime(){
    TheLoai = " FULL TIME";
    }
    public float TinhLuong(){
        Luong = SoGiolam * Luongfull + Thuong;
          return Luong; 
    }
    }