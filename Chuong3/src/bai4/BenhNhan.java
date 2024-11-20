package bai4;

public class BenhNhan extends Nguoi {
    private String tenSu;
    private String chanDoan;
    private BenhVien benhVien;

    // Constructor mặc định
    public BenhNhan() {
    }

    // Constructor có tham số
    public BenhNhan(String ten, int tuoi, char gioiTinh, String tenSu, String chanDoan, BenhVien benhVien) {
        super(ten, tuoi, gioiTinh);
        this.tenSu = tenSu;
        this.chanDoan = chanDoan;
        this.benhVien = benhVien;
    }

    // Các phương thức getter và setter
    public void setTenSu(String tenSu) {
        this.tenSu = tenSu;
    }

    public void setChanDoan(String chanDoan) {
        this.chanDoan = chanDoan;
    }

    public void setBenhVien(BenhVien benhVien) {
        this.benhVien = benhVien;
    }

    public String getTenSu() {
        return tenSu;
    }

    public String getChanDoan() {
        return chanDoan;
    }

    public BenhVien getBenhVien() {
        return benhVien;
    }

    // Phương thức toString để hiển thị thông tin bệnh nhân
    @Override
    public String toString() {
        return super.toString() + ", BenhNhan [tenSu=" + tenSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
    }
}

