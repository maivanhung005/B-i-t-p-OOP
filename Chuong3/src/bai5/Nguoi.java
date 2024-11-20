package bai5;

public class Nguoi {
    private String ten;
    private int tuoi;
    private char gioiTinh;

    // Constructor mặc định
    public Nguoi() {
    }

    // Constructor có tham số
    public Nguoi(String ten, int tuoi, char gioiTinh) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
    }

    // Các phương thức getter và setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(char gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public char getGioiTinh() {
        return gioiTinh;
    }

    // Phương thức toString để hiển thị thông tin
    @Override
    public String toString() {
        return "Nguoi [ten=" + ten + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + "]";
    }
}

