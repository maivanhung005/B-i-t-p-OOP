package bai5;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng Truong
        Truong truong = new Truong("Đại học A", "123 Đường B", "Nguyễn Văn C");

        // Tạo đối tượng SinhVien với constructor có tham số
        SinhVien sinhVien = new SinhVien("Nguyễn Văn A", 20, 'M', "Lớp 1", "Công nghệ thông tin", truong);

        // Hiển thị thông tin sinh viên
        System.out.println(sinhVien);

        // Kiểm tra các phương thức setter
        sinhVien.setLop("Lớp 2");
        sinhVien.setNganh("Kỹ thuật phần mềm");
        truong.setTen("Đại học X");
        truong.setDiaChi("456 Đường Y");
        truong.setHieuTruong("Trần Thị D");
        sinhVien.setTruong(truong);

        // Hiển thị thông tin sinh viên sau khi thay đổi
        System.out.println(sinhVien);
    }
}
