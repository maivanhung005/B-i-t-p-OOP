package baitapc2;

import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số ngày lưu trú và đơn giá ngày từ bàn phím
        System.out.print("Nhập số ngày lưu trú: ");
        int soNgay = sc.nextInt();
        System.out.print("Nhập đơn giá ngày: ");
        double donGiaNgay = sc.nextDouble();

        // Tính tiền phòng phải thanh toán theo bảng giá
        double tienPhong = 0;
        if (soNgay == 1) {
            tienPhong = donGiaNgay;
        } else if (soNgay >= 2 && soNgay <= 4) {
            tienPhong = donGiaNgay * soNgay * 0.8; // Giảm 20%
        } else if (soNgay >= 5 && soNgay <= 10) {
            tienPhong = donGiaNgay * soNgay * 0.6; // Giảm 40%
        } else {
            tienPhong = donGiaNgay * soNgay * 0.4; // Giảm 60%
        }

        // Hiển thị kết quả
        System.out.println("Số tiền phòng phải thanh toán: " + tienPhong + " VNĐ");
    }
}
