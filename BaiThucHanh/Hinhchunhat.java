package BaiThucHanh;

import java.util.Scanner;

public class Hinhchunhat extends Hinhhoc {
    public float dai;
    public float rong;
    public Hinhchunhat() {
        ten = " Hinh Chu Nhat";
      
    }
    public void NhapChieuDai(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai =");
        dai = sc.nextFloat();
    }
    public void NhapChieuRong(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu rong =");
        rong = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = (dai + rong) * 2;
    }
    public void tinhDienTich(){
        DienTich = dai * rong;
    }
}

