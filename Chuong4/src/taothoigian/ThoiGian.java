package taothoigian;

// Lớp ThoiGian với kiểm tra tính hợp lệ của ngày tháng năm
public class ThoiGian {
    private int ngay;
    private int thang;
    private int nam;

    // Hàm tạo ném ra ngoại lệ InvalidDateException cho các ngày tháng không hợp lệ
    public ThoiGian(int ngay, int thang, int nam) throws InvalidDateException {
        // Kiểm tra tính hợp lệ của ngày
        if (ngay < 1 || ngay > 31) {
            throw new InvalidDateException("Ngày không hợp lệ: " + ngay);
        }
        // Kiểm tra tính hợp lệ của tháng
        if (thang < 1 || thang > 12) {
            throw new InvalidDateException("Tháng không hợp lệ: " + thang);
        }
        // Kiểm tra tính hợp lệ của năm
        if (nam < 0) {
            throw new InvalidDateException("Năm không hợp lệ: " + nam);
        }
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }

    // Phương thức trả về chuỗi đại diện cho đối tượng ThoiGian
    @Override
    public String toString() {
        return "ThoiGian{" +
                "ngay=" + ngay +
                ", thang=" + thang +
                ", nam=" + nam +
                '}';
    }
}