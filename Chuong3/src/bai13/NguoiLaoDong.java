package bai13;

import java.util.Scanner;

public abstract class NguoiLaoDong {
    private String hoTen;
    private String diaChi;
    private String loaiLaoDong;

    public NguoiLaoDong() {
    }

    public NguoiLaoDong(String hoTen, String diaChi, String loaiLaoDong) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiLaoDong = loaiLaoDong;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập loại lao động (Lao động phổ thông/Kĩ sư): ");
        loaiLaoDong = sc.nextLine();
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại lao động: " + loaiLaoDong);
        System.out.println("Lương tháng: " + tinhLuong());
    }
}

