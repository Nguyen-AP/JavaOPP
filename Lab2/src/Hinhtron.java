package BaiThucHanh;
import java.util.Scanner;
public class Hinhtron extends Hinhhoc{
    public float r;
       
    public void Hinhtron() {
        ten = "Hinh Tron";
    }
    public void nhapBankinh(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Nhap ban kinh = ");
        r = sc.nextFloat();
    }
    public void tinhChuVi(){
        ChuVi = 2*Pi*r;
    }
    public void tinhDienTich(){
        DienTich = 4*Pi*r*r;
    }
}
