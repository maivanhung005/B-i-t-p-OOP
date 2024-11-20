package baitapc2;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập hai số thực từ bàn phím
        System.out.print("Nhập số thực thứ nhất: ");
        double soThuc1 = sc.nextDouble();
        System.out.print("Nhập số thực thứ hai: ");
        double soThuc2 = sc.nextDouble();
        sc.nextLine(); // Consume newline left-over

        // Nhập ký tự từ bàn phím
        System.out.print("Nhập ký tự (A, S, M, D): ");
        char kyTu = sc.next().charAt(0);

        // Thực hiện phép tính dựa vào ký tự nhập vào và hiển thị kết quả
        switch (kyTu) {
            case 'A':
                double tong = soThuc1 + soThuc2;
                System.out.println("Tổng: " + tong);
                break;
            case 'S':
                double hieu = soThuc1 - soThuc2;
                System.out.println("Hiệu: " + hieu);
                break;
            case 'M':
                double tich = soThuc1 * soThuc2;
                System.out.println("Tích: " + tich);
                break;
            case 'D':
                if (soThuc2 != 0) {
                    double thuong = soThuc1 / soThuc2;
                    System.out.println("Thương: " + thuong);
                } else {
                    System.out.println("Không thể chia cho 0");
                }
                break;
            default:
                System.out.println("Ký tự vừa nhập không hợp lệ");
        }
    }
}

