package bai10;

public class HocvienDH extends Hocvien {
    private int soBuoi;
    private double donGiaDH;

    public HocvienDH() {
    }

    public HocvienDH(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh, int soBuoi, double donGiaDH) {
        super(hoTen, diaChi, loaiUuTien, loaiChuongTrinh);
        this.soBuoi = soBuoi;
        this.donGiaDH = donGiaDH;
    }

    @Override
    public double hocPhi() {
        double uuTien;
        if (getLoaiUuTien() == 1) {
            uuTien = 1000000;
        } else {
            uuTien = 500000;
        }
        return soBuoi * donGiaDH - uuTien;
    }

    public void nhapThongTin() {
        super.nhapThongTin();
        java.util.Scanner scn = new java.util.Scanner(System.in);
        System.out.print("Nhập số buổi: ");
        soBuoi = scn.nextInt();
        System.out.print("Nhập đơn giá đồ họa: ");
        donGiaDH = scn.nextDouble();
    }
}
