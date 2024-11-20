package baitapc2;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập vào hai cạnh của hình chữ nhật
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        double chieuRong = sc.nextDouble();

        // Tính diện tích và chu vi của hình chữ nhật
        double dienTich = chieuDai * chieuRong;
        double chuVi = 2 * (chieuDai + chieuRong);

        // Hiển thị diện tích và chu vi ra màn hình
        System.out.println("Diện tích của hình chữ nhật: " + dienTich);
        System.out.println("Chu vi của hình chữ nhật: " + chuVi);
    }
}
