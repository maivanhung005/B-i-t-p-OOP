package bai14;
import java.util.Scanner;
public class CNTCN extends CongNhan {
    private int soNgayCong;
    private double luongCoBan;
    private double heSoLuong;

    public CNTCN() {
    }

    public CNTCN(String hoTen, String diaChi, String ngaySinh, String loaiCongNhan, int soNgayCong, double luongCoBan, double heSoLuong) {
        super(hoTen, diaChi, ngaySinh, loaiCongNhan);
        this.soNgayCong = soNgayCong;
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tinhLuong() {
        double thuong = 0;
        if (soNgayCong >= 20) {
            thuong = 1.2 * luongCoBan;
        }
        return luongCoBan * heSoLuong + thuong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày công: ");
        soNgayCong = sc.nextInt();
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
    }
}
