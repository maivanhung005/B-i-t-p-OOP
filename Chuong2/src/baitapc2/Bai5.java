package baitapc2;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập một số nguyên
        System.out.print("Nhập một số nguyên: ");
        int soNguyen = sc.nextInt();

        // Nhập một số thực
        System.out.print("Nhập một số thực: ");
        double soThuc = sc.nextDouble();
        sc.nextLine(); // Consume newline left-over

        // Nhập một ký tự
        System.out.print("Nhập một ký tự: ");
        char kyTu = sc.next().charAt(0);
        sc.nextLine(); // Consume newline left-over

        // Nhập một chuỗi ký tự
        System.out.print("Nhập một chuỗi ký tự: ");
        String chuoiKyTu = sc.nextLine();

        // Hiển thị các thông tin nhập được
        System.out.println("Số nguyên: " + soNguyen);
        System.out.println("Số thực: " + soThuc);
        System.out.println("Ký tự: " + kyTu);
        System.out.println("Chuỗi ký tự: " + chuoiKyTu);
    }
}
