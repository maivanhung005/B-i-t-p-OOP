package baitapc2;

public class Bai9 {
    public static void main(String[] args) {
        int tong = 0;

        // Tính tổng các số lẻ từ 1 đến 100
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // Kiểm tra nếu i là số lẻ
                tong += i;
            }
        }

        // Hiển thị kết quả ra màn hình
        System.out.println("Tổng các số lẻ từ 1 đến 100: " + tong);
    }
}
