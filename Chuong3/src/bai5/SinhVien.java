package bai5;

public class SinhVien extends Nguoi {
    private String lop;
    private String nganh;
    private Truong truong;

    // Constructor mặc định
    public SinhVien() {
    }

    // Constructor có tham số
    public SinhVien(String ten, int tuoi, char gioiTinh, String lop, String nganh, Truong truong) {
        super(ten, tuoi, gioiTinh);
        this.lop = lop;
        this.nganh = nganh;
        this.truong = truong;
    }

    // Các phương thức getter và setter
    public void setLop(String lop) {
        this.lop = lop;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setTruong(Truong truong) {
        this.truong = truong;
    }

    public String getLop() {
        return lop;
    }

    public String getNganh() {
        return nganh;
    }

    public Truong getTruong() {
        return truong;
    }

    // Phương thức toString để hiển thị thông tin sinh viên
    @Override
    public String toString() {
        return super.toString() + ", SinhVien [lop=" + lop + ", nganh=" + nganh + ", truong=" + truong + "]";
    }
}
