package baithuchanhngay1804;

import baithuchanhngay1804.model.NhanVienFullTime;

import baithuchanhngay1804.model.NhanVienPartTime;

import baithuchanhngay1804.util.Configs;

public class App79 {

    public static void main(String[] args) {

        NhanVienFullTime sep = new NhanVienFullTime("Trần Văn Sếp");

        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);

        NhanVienFullTime linh1 = new NhanVienFullTime("Nguyễn Văn Lính"); 

        NhanVienFullTime linh2 = new NhanVienFullTime("Lê Thị Lính", 3); 
// Công ty đang thuê 1 nhân viên thời vụ​

NhanVienPartTime thoiVu = new NhanVienPartTime("Phan Thị Thời Vụ", 240); // Cô ấy siêng làm lắm​
    }
}
