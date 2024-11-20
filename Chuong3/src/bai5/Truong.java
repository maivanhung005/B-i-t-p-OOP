package bai5;

public class Truong {
    private String ten;
    private String diaChi;
    private String hieuTruong;

    // Constructor mặc định
    public Truong() {
    }

    // Constructor có tham số
    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    // Các phương thức getter và setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }

    // Phương thức toString để hiển thị thông tin trường học
    @Override
    public String toString() {
        return "Truong [ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + "]";
    }
}
