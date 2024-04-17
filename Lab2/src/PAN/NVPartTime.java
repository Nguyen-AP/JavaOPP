package PAN;

public class NVPartTime extends NhanVien{
    public int GioLamViec;
    public void  NhanVienPartTime(String ten, GioLamViec int){
        this.ten = ten;
        this.GioLamViec = GioLamViec; 
    }
    @Override
    public void LoaiNhanVien(){
 return "Nhan Vien Thoi Vu";
    }
    public void TinhLuong(){
        luong = Config.LuongNhanVienPartTime *GioLamViec; 
    }
}
