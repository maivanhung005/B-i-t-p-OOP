package b2;

public class Test {
    public static void main(String[] args) {
        // Tạo đối tượng DiaChi với constructor có tham số
        DiaChi diaChi = new DiaChi("Thôn Ngọc Lâm", "Xã Tân Kỳ", "Huyện Tứ Kỳ", "Tỉnh Hải Dương");

        // Hiển thị thông tin địa chỉ
        diaChi.hienThiDiaChi();

        // Kiểm tra các phương thức setter
        diaChi.setThon("Thôn An Phòng");
        diaChi.setXa("Xã Quang Phục");
        diaChi.setHuyen("Huyện Tứ Kỳ");
        diaChi.setTinh("Tỉnh Hải Dương");

        // Hiển thị thông tin địa chỉ sau khi thay đổi
        diaChi.hienThiDiaChi();
    }
}

