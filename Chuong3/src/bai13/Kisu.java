package bai13;
import java.util.Scanner;
public class Kisu extends NguoiLaoDong {
    private double luongCoBan;
    private double heSoLuong;
    private int soNgayCong;

    public Kisu() {
    }

    public Kisu(String hoTen, String diaChi, String loaiLaoDong, double luongCoBan, double heSoLuong, int soNgayCong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
        this.soNgayCong = soNgayCong;
    }

    @Override
    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 2000000;
        } else if (soNgayCong > 15) {
            thuong = 1000000;
        } else {
            thuong = 500000;
        }
        return luongCoBan * heSoLuong + thuong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
        System.out.print("Nhập số ngày công: ");
        soNgayCong = sc.nextInt();
    }
}
