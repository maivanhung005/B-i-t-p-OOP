package b2;

public class DiaChi {
    private String thon;
    private String xa;
    private String huyen;
    private String tinh;

    // Constructor mặc định
    public DiaChi() {
    }

    // Constructor có tham số
    public DiaChi(String thon, String xa, String huyen, String tinh) {
        this.thon = thon;
        this.xa = xa;
        this.huyen = huyen;
        this.tinh = tinh;
    }

    // Các phương thức getter và setter
    public void setThon(String thon) {
        this.thon = thon;
    }

    public void setXa(String xa) {
        this.xa = xa;
    }

    public void setHuyen(String huyen) {
        this.huyen = huyen;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getThon() {
        return thon;
    }

    public String getXa() {
        return xa;
    }

    public String getHuyen() {
        return huyen;
    }

    public String getTinh() {
        return tinh;
    }

    // Phương thức hiển thị thông tin địa chỉ
    public void hienThiDiaChi() {
        System.out.println("Địa chỉ: " + thon + ", " + xa + ", " + huyen + ", " + tinh);
    }
}

