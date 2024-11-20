package songoaiphamvi;

import java.util.Scanner;
//Lớp Test để kiểm tra ngoại lệ
public class Test {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);

   try {
       System.out.print("Nhập vào lương: ");
       double salary = scanner.nextDouble();

       // Kiểm tra xem lương có nằm trong phạm vi cho phép không
       if (salary < 5000000 || salary > 20000000) {
           throw new OutOfRangeException("Lỗi: Lương không nằm trong phạm vi từ 5.000.000 đến 20.000.000.");
       }

       System.out.println("Lương của bạn là: " + salary);
   } catch (OutOfRangeException e) {
       System.out.println(e.getMessage());
   } catch (Exception e) {
       System.out.println("Lỗi nhập dữ liệu.");
   } finally {
       scanner.close();
   }
}
}