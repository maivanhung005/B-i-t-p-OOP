package bai4;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng BenhVien
        BenhVien benhVien = new BenhVien("Bệnh viện AB", "123 Đường C", "Nguyễn Văn Linh");

        // Tạo đối tượng BenhNhan với constructor có tham số
        BenhNhan benhNhan = new BenhNhan("Nguyễn Văn Công", 30, 'M', "Cảm cúm", "Bệnh cảm cúm thông thường", benhVien);

        // Hiển thị thông tin bệnh nhân
        System.out.println(benhNhan);

        // Kiểm tra các phương thức setter
        benhNhan.setTenSu("Viêm họng");
        benhNhan.setChanDoan("Bệnh viêm họng mãn tính");
        benhVien.setTen("Bệnh viện BM");
        benhVien.setDiaChi("456 Đường HHT");
        benhVien.setGiamDoc("Trần Thị Hương");
        benhNhan.setBenhVien(benhVien);

        // Hiển thị thông tin bệnh nhân sau khi thay đổi
        System.out.println(benhNhan);
    }
}

