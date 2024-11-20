package baitapc2;

import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập điểm thi từ bàn phím
        System.out.print("Nhập điểm thi (0-100): ");
        int diemThi = sc.nextInt();

        // Xếp loại theo điểm thi
        String xepLoai;
        if (diemThi >= 90 && diemThi <= 100) {
            xepLoai = "A";
        } else if (diemThi >= 80 && diemThi < 90) {
            xepLoai = "B";
        } else if (diemThi >= 70 && diemThi < 80) {
            xepLoai = "C";
        } else if (diemThi >= 50 && diemThi < 70) {
            xepLoai = "D";
        } else {
            xepLoai = "F";
        }

        // Hiển thị kết quả
        System.out.println("Điểm thi: " + diemThi);
        System.out.println("Xếp loại: " + xepLoai);
    }
}
