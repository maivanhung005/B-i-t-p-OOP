package bai3;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng DiaChi
        DiaChi diaChi = new DiaChi("Thôn Nghi Khê", "Xã Tân Kỳ", "Huyện Tứ Kỳ", "Tỉnh Hải Dương");

        // Tạo đối tượng NhanVien với constructor có tham số
        NhanVien nhanVien = new NhanVien("Nguyễn Công Linh", diaChi, "01/03/2005", 'M');

        // Hiển thị thông tin nhân viên
        System.out.println(nhanVien);

        // Kiểm tra các phương thức setter
        nhanVien.setName("Nguyễn Thị Hồng");
        nhanVien.setDob("03/02/2005");
        nhanVien.setGender('F');
        diaChi.setThon("Thôn Nhũ");
        diaChi.setXa("Xã Quang Khải");
        diaChi.setHuyen("Huyện Tứ Kỳ");
        diaChi.setTinh("Tỉnh Hải Dương");
        nhanVien.setAddress(diaChi);

        // Hiển thị thông tin nhân viên sau khi thay đổi
        System.out.println(nhanVien);
    }
}
