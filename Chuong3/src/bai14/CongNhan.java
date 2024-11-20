package bai14;

import java.util.Scanner;

public abstract class CongNhan {
    private String hoTen;
    private String diaChi;
    private String ngaySinh;
    private String loaiCongNhan;

    public CongNhan() {
    }

    public CongNhan(String hoTen, String diaChi, String ngaySinh, String loaiCongNhan) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.loaiCongNhan = loaiCongNhan;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập ngày sinh (dd/MM/yyyy): ");
        ngaySinh = sc.nextLine();
        System.out.print("Nhập loại công nhân (CNKSP/CNTCN): ");
        loaiCongNhan = sc.nextLine();
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Loại công nhân: " + loaiCongNhan);
        System.out.println("Lương tháng: " + tinhLuong());
    }
}
