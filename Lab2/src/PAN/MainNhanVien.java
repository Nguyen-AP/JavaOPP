package PAN;

public class MainNhanVien {
    
    public static void main(String[] args) {
        NVFullTime sep = new NVFullTime("Pham Anh Nguyen");
        sep.setLoaiChucVu(configs.NhanVienSep);
        NVFullTime linh2 = new NhanVienFullTime("acb",3);
        NVFullTime linh1 = new NVFullTime("jdhjf",4);
        NVPartTime thoivu = new NhanVienPartTime("oierrr",240);
        sep.TinhLuong();
        linh1.TinhLuong();
        linh2.TinhLuong();
        thoivu.TinhLuong();
        sep.XuatThongTin();
        linh1.XuatThongTin();
        linh2.XuatThongTin();
    }
}
