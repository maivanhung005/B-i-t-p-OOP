package b1nhap2so;
import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số nguyên đầu tiên: ");
            int num1 = scanner.nextInt();

            System.out.print("Nhập số nguyên thứ hai: ");
            int num2 = scanner.nextInt();

            // Thực hiện phép chia và hiển thị kết quả
            double result = divide(num1, num2);
            System.out.println("Kết quả: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho số không.");
        } catch (Exception e) {
            System.out.println("Lỗi: Đầu vào không hợp lệ.");
        } finally {
            scanner.close();
        }
    }

    // Phương thức thực hiện phép chia với xử lý ngoại lệ
    public static double divide(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Không thể chia cho số không.");
        }
        return (double) numerator / denominator;
    }
}
