package BaiThucHanh;

import java.util.Scanner;

public class Hinhtru extends Hinhtron {
    public float ChieuCao;
    public void Hinhtru() {
        ten = "Hinh Tru";
    }
    public void nhapChieuCao(){
        nhapBankinh();
         Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap Chieu Cao =");
        ChieuCao = sc.nextFloat();
    }
    public void tinhTheTich(){
         tinhDienTich();
         TheTich = DienTich * ChieuCao;
    }
}
