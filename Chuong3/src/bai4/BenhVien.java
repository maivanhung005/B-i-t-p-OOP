package bai4;

public class BenhVien {
    private String ten;
    private String diaChi;
    private String giamDoc;

    // Constructor mặc định
    public BenhVien() {
    }

    // Constructor có tham số
    public BenhVien(String ten, String diaChi, String giamDoc) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.giamDoc = giamDoc;
    }

    // Các phương thức getter và setter
    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setGiamDoc(String giamDoc) {
        this.giamDoc = giamDoc;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getGiamDoc() {
        return giamDoc;
    }

    // Phương thức toString để hiển thị thông tin bệnh viện
    @Override
    public String toString() {
        return "BenhVien [ten=" + ten + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
    }
}

