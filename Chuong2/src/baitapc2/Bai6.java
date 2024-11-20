package baitapc2;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào hai số nguyên từ bàn phím
        System.out.print("Nhập số nguyên thứ nhất: ");
        int soNguyen1 = sc.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int soNguyen2 = sc.nextInt();

        // Tính toán tổng, hiệu, tích và thương
        int tong = soNguyen1 + soNguyen2;
        int hieu = soNguyen1 - soNguyen2;
        int tich = soNguyen1 * soNguyen2;
        float thuong = (float) soNguyen1 / soNguyen2; // Ép kiểu để cho kết quả chính xác

        // Hiển thị kết quả ra màn hình
        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.println("Thương: " + thuong);
    }
}

