package bai10;

public class HocvienLT extends Hocvien {
    private int soBuoi;
    private double donGiaLT;

    public HocvienLT() {
    }

    public HocvienLT(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi, double donGiaLT) {
        super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGiaLT = donGiaLT;
    }

    @Override
    public double hocPhi() {
        double uuTien;
        if (getLoaiUuTien() == 1) {
            uuTien = 1000000;
        } else {
            uuTien = 800000;
        }
        return soBuoi * donGiaLT - uuTien;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Nhập số buổi: ");
        soBuoi = sc.nextInt();
        System.out.print("Nhập đơn giá lập trình: ");
        donGiaLT = sc.nextDouble();
    }
}
