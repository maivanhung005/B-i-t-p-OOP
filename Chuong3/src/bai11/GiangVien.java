package bai11;

import java.util.Scanner;

public abstract class GiangVien {
    private String hoTen;
    private String diaChi;
    private String loaiGiangVien;

    public GiangVien() {
    }

    public GiangVien(String hoTen, String diaChi, String loaiGiangVien) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiGiangVien = loaiGiangVien;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập loại giảng viên (Cơ hữu/Thỉnh giảng): ");
        loaiGiangVien = sc.nextLine();
    }

    public abstract double tinhLuong();

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại giảng viên: " + loaiGiangVien);
        System.out.println("Lương tháng: " + tinhLuong());
    }
}
