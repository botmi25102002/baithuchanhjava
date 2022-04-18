package baithuchanhngay1804;
import baithuchanhngay1804.app71.HinhTron;
public class App71 {
    public static void main(String[] args){
        HinhTron hinhTron = new HinhTron();
        hinhTron.setBanKinh(10);
        float chuVi = hinhTron.tinhChuVi();
        float dienTich = hinhTron.tinhDienTich();
        System.out.println("Chu vi hinh tron: " + chuVi + "; Va dien tich: " + dienTich);
    }
}
