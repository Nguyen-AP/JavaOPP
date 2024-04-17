package PAN;

public class NhanVien {
    public String ten;
    public long Luong;

    public NhanVien(){
        this.ten = ten;
    }
    protected String LoaiNhanVien(){
        return "";
    }
    public void XuatThongTin(){
        System.out.println("=============== NhanVien: " + ten + "================================");
        System.out.println("- LoaiNhanVien: " + LoaiNhanVien());
        System.out.println(" - Luong : " + Luong +" VND");
    }
}
