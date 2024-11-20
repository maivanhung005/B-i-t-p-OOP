package bai11;
import java.util.Scanner;
public class GVThinhGiang extends GiangVien {
    private int soTietDay;
    private double donGia;

    public GVThinhGiang() {
    }

    public GVThinhGiang(String hoTen, String diaChi, String loaiGiangVien, int soTietDay, double donGia) {
        super(hoTen, diaChi, loaiGiangVien);
        this.soTietDay = soTietDay;
        this.donGia = donGia;
    }

    @Override
    public double tinhLuong() {
        double thuNhap = soTietDay * donGia;
        return thuNhap - thuNhap * 0.15;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiết dạy: ");
        soTietDay = sc.nextInt();
        System.out.print("Nhập đơn giá: ");
        donGia = sc.nextDouble();
    }
}

