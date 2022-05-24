public class App114 {
    public static void main(String[] args) {
        int soSinhVien = 2;
        Map<String, String> mapStudents = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String maSinhVien, tenSinhVien;
            
        // thêm thông tin của 2 sinh viên
        // vào trong mapStudents
        // trong đó key là mã sinh viên, còn value là tên của sinh viên đó
        for (int i = 1; i <= soSinhVien; i++) {
            System.out.println("Nhập thông tin của sinh viên thứ " + i);
            System.out.println("Nhập mã sinh viên: ");
            maSinhVien = scanner.nextLine();
            System.out.println("Nhập tên sinh viên: ");
            tenSinhVien = scanner.nextLine();
            mapStudents.put(maSinhVien, tenSinhVien);
        }
            
        // hiển thị danh sách sinh viên sử dụng Iterator
        System.out.println("Danh sách các sinh viên vừa nhập: ");
        System.out.println("Mã sinh viên\tTên sinh viên");
        Iterator<Map.Entry<String, String>> iterator = mapStudents.entrySet().iterator();
        while (iterator.hasNext()) {
            // tạo 1 entry
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.getKey() + "\t\t" + entry.getValue());
        }
            
        // thêm 1 sinh viên mới vào trong mapStudents
        // nếu mã sinh viên đó đã tồn tại thì thông báo mã đã tồn tại
        // ngược lại thêm vào bình thường và thông báo "Thêm thành công"
        // sau đó tăng số sinh viên lên 1
        System.out.println("Nhập mã sinh viên cần thêm: ");
        String maSinhVienMoi = scanner.nextLine();
        System.out.println("Nhập tên sinh viên cần thêm: ");
        String tenSinhVienMoi = scanner.nextLine();
            
        // phương thức containsKey() sẽ kiểm tra mã sinh viên mới nhập vào
        // có tồn tại trong mapStudents hay chưa
        if (mapStudents.containsKey(maSinhVienMoi)) {
            System.out.println("Mã sinh viên = " + maSinhVienMoi + " đã tồn tại!");
        } else {
            mapStudents.put(maSinhVienMoi, tenSinhVienMoi);
            soSinhVien++;
            System.out.println("Danh sách các sinh viên sau khi thêm: ");
            System.out.println("Số sinh viên = " + soSinhVien);
            System.out.println("Mã sinh viên\tTên sinh viên");
            iterator = mapStudents.entrySet().iterator();
            while (iterator.hasNext()) {
                // tạo 1 entry
                Map.Entry<String, String> entry = iterator.next();
                System.out.println(entry.getKey() + "\t\t" + entry.getValue());
            }
        }
    }
}
