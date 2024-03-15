package BaiThucHanh;
import java.util.Scanner;
public class mainSv {
    public String Name;
    public String Age;
    public float DiemA,DiemB,DiemC,DiemTk;
    public String MasinhVien;
    void NhapThongTin(){
        System.out.printf("Nhap Ten Sinh Vien:");
        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();
        System.out.printf("Ma Sinh Vien:");
        MasinhVien = sc.nextLine();
        System.out.printf("Nhap Tuoi:");
        Age = sc.nextLine();
        System.out.printf("Diem A:");
        DiemA = sc.nextFloat();
        System.out.printf("Diem B:");
        DiemB = sc.nextFloat();
        System.out.printf("Diem C:");
        DiemC = sc.nextFloat();
    }
    public  float TinhDiem(){
        DiemTk = DiemA * 0.6f + DiemB * 0.3f + DiemC * 0.1f;
        return DiemTk;
    }
    public void XuatThongTin(){

        System.out.printf(Name + "-"+Age+ "-"+MasinhVien+"-"+TinhDiem());
    }
    
}
