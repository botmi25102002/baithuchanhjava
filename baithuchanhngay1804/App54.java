package baithuchanhngay1804;
import baithuchanhngay1804.shapes.HinhChuNhat;
import baithuchanhngay1804.shapes.HinhTron;
import baithuchanhngay1804.shapes.HinhTru;
import baithuchanhngay1804.shapes.HinhVuong;
public class App54 {
    public static void main(String[] args){
        // Hinh Tron
        baithuchanhngay1804.shapes.HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inchuVi();
        hinhTron.indienTich();

        // Hinh Tru
        baithuchanhngay1804.shapes.HinhTru hinhTru = new HinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.intheTich();

        // Hinh Chu Nhat
        baithuchanhngay1804.shapes.HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inchuVi();
        hinhChuNhat.indienTich();

        // Hinh vuong
        baithuchanhngay1804.shapes.HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inchuVi();
        hinhVuong.indienTich();
    }
}
