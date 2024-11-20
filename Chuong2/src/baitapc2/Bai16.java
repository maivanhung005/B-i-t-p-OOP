package baitapc2;

import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số nguyên n từ bàn phím
        System.out.print("Nhập số nguyên n: ");
        int n = sc.nextInt();

        // Tính giai thừa của n
        long giaiThua = 1;
        for (int i = 1; i <= n; i++) {
            giaiThua *= i;
        }

        // Hiển thị kết quả
        System.out.println("Giai thừa của " + n + " là: " + giaiThua);
    }
}
