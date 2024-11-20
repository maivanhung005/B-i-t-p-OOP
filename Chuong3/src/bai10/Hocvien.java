package bai10;

import java.util.Scanner;

public abstract class Hocvien {
    private String hoTen;
    private String diaChi;
    private int loaiUuTien;
    private String loaiChuongTrinh;

    public Hocvien() {
    }

    public Hocvien(String hoTen, String diaChi, int loaiUuTien, String loaiChuongTrinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiUuTien = loaiUuTien;
        this.loaiChuongTrinh = loaiChuongTrinh;
    }

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
        System.out.print("Nhập loại ưu tiên (1 hoặc 2): ");
        loaiUuTien = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Nhập loại chương trình (đồ họa hoặc lập trình): ");
        loaiChuongTrinh = sc.nextLine();
    }

    public abstract double hocPhi();

    public void inThongTin() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Loại ưu tiên: " + loaiUuTien);
        System.out.println("Loại chương trình đăng kí học: " + loaiChuongTrinh);
        System.out.println("Học phí: " + hocPhi());
    }

    public int getLoaiUuTien() {
        return loaiUuTien;
    }
}

