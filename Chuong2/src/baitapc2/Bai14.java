package baitapc2;

import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số điện tiêu thụ từ bàn phím
        System.out.print("Nhập số điện tiêu thụ trong tháng (kWh): ");
        int soDien = sc.nextInt();

        // Tính tiền điện theo số điện tiêu thụ dựa trên bảng giá
        double tienDien = 0;
        if (soDien <= 50) {
            tienDien = soDien * 1484;
        } else if (soDien <= 100) {
            tienDien = 50 * 1484 + (soDien - 50) * 1533;
        } else if (soDien <= 200) {
            tienDien = 50 * 1484 + 50 * 1533 + (soDien - 100) * 1786;
        } else {
            tienDien = 50 * 1484 + 50 * 1533 + 100 * 1786 + (soDien - 200) * 2242;
        }

        // Hiển thị kết quả
        System.out.println("Số tiền điện phải thanh toán: " + tienDien + " VNĐ");
    }
}
