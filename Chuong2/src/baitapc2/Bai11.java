package baitapc2;

import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập bán kính của hình tròn từ bàn phím
        System.out.print("Nhập bán kính của hình tròn: ");
        double banKinh = sc.nextDouble();

        // Tính diện tích và chu vi của hình tròn
        double dienTich = Math.PI * banKinh * banKinh;
        double chuVi = 2 * Math.PI * banKinh;

        // Hiển thị diện tích và chu vi ra màn hình
        System.out.println("Diện tích của hình tròn: " + dienTich);
        System.out.println("Chu vi của hình tròn: " + chuVi);
    }
}
