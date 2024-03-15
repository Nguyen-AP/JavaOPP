package BaiThucHanh;
import java.util.Scanner;
public class employee {
    public String name;
    public String Age;
    public float Luong,Trocap,TraTien;

    void EnterDate(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap Ten:");
        name = sc.nextLine();
        System.out.printf("Nhap Tuoi:");
        Age = sc.nextLine();
        System.out.printf("Nhap Luong:");
        Luong = sc.nextFloat();
        System.out.printf("Luong Tro Cap:");
        Trocap = sc.nextFloat();
    }
    public float TinhLuong(){
      TraTien = 30f *Luong +Trocap;
       return TraTien;
    }
    void Display(){
        System.out.printf("Luong cua ban la :"+TinhLuong());
    }

}
