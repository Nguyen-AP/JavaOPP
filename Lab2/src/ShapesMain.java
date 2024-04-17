package BaiThucHanh;
import BaiThucHanh.Hinhhoc;
import BaiThucHanh.Hinhtron;
import BaiThucHanh.Hinhtru;
import BaiThucHanh.Hinhchunhat;
import BaiThucHanh.HinhVuong;
public class ShapesMain {
    
public static void main(String[] args) {
    Hinhtron hinhTron = new Hinhtron();
    hinhTron.Hinhtron();
    hinhTron.XuatTen();
    hinhTron.nhapBankinh();
    hinhTron.tinhChuVi();
    hinhTron.tinhDienTich();
    hinhTron.inChuVi();
    hinhTron.inDienTich();

    Hinhtru hinhtru = new Hinhtru();
    hinhtru.Hinhtru(); 
    hinhtru.XuatTen();
    hinhtru.nhapChieuCao();
    hinhtru.tinhTheTich();
    hinhtru.inDienTich();

    Hinhchunhat hinhchunhat = new Hinhchunhat();
    hinhchunhat.XuatTen();
    hinhchunhat.NhapChieuDai();
    hinhchunhat.NhapChieuRong();
    hinhchunhat.tinhChuVi();
    hinhchunhat.tinhDienTich();
    hinhchunhat.inChuVi();
    hinhchunhat.inDienTich();

    HinhVuong hinhVuong = new HinhVuong();
    hinhVuong.XuatTen();
    hinhVuong.nhapCanh();
    hinhVuong.nhapCanh();
    hinhVuong.tinhChuVi();
    hinhVuong.tinhDienTich();
    hinhVuong.inChuVi();
    hinhVuong.inDienTich();
}
}
