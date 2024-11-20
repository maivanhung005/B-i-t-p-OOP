package bai13;
import java.util.Scanner;
public class LaoDongPhothong extends NguoiLaoDong {
    private int soNgayCong;
    private double donGiaNgayCong;

    public LaoDongPhothong() {
    }

    public LaoDongPhothong(String hoTen, String diaChi, String loaiLaoDong, int soNgayCong, double donGiaNgayCong) {
        super(hoTen, diaChi, loaiLaoDong);
        this.soNgayCong = soNgayCong;
        this.donGiaNgayCong = donGiaNgayCong;
    }

    @Override
    public double tinhLuong() {
        double thuong;
        if (soNgayCong >= 25) {
            thuong = 1000000;
        } else if (soNgayCong > 15) {
            thuong = 700000;
        } else {
            thuong = 0;
        }
        return soNgayCong * donGiaNgayCong + thuong;
    }

    @Override
    public void nhapThongTin() {
        super.nhapThongTin();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số ngày công: ");
        soNgayCong = sc.nextInt();
        System.out.print("Nhập đơn giá ngày công: ");
        donGiaNgayCong = sc.nextDouble();
    }
}
