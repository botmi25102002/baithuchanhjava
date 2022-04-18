package baithuchanhngay1804.model;
import baithuchanhngay1804.util.Configs;
public class NhanVienFullTime extends NhanVien{
    private int NgayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten){
        this.ten=ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten=ten;
        this.NgayLamThem=ngayLamThem;
    }
    public void setLoaiChucVu(int loaiChucVu){
        this.loaiChucVu=loaiChucVu;
    }
}
