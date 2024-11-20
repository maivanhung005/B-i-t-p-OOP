package baitapc2;

import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập giá bán và phần trăm giảm giá từ bàn phím
        System.out.print("Nhập giá bán: ");
        double giaBan = sc.nextDouble();
        System.out.print("Nhập phần trăm giảm giá: ");
        double phanTramGiamGia = sc.nextDouble();

        // Tính giá bán sau khi giảm
        double giaSauGiam = giaBan - (giaBan * phanTramGiamGia / 100);

        // Hiển thị kết quả
        System.out.println("Giá bán sau khi giảm: " + giaSauGiam);
    }
}
