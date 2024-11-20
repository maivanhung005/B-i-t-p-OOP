package chuoikitu20;

import java.util.Scanner;
//Lớp Test để kiểm tra ngoại lệ
public class Test {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   String input;

   while (true) {
       System.out.print("Nhập một chuỗi ký tự (hoặc nhập 'DONE' để kết thúc): ");
       input = scanner.nextLine();

       // Kiểm tra xem người dùng có nhập "DONE" không
       if (input.equals("DONE")) {
           System.out.println("Chương trình kết thúc.");
           break;
       }

       try {
           // Kiểm tra độ dài của chuỗi
           if (input.length() > 20) {
               throw new StringTooLongException("Lỗi: Chuỗi quá dài! Vui lòng nhập chuỗi ngắn hơn 20 ký tự.");
           }
           System.out.println("Bạn đã nhập: " + input);
       } catch (StringTooLongException e) {
           System.out.println(e.getMessage());
       }
   }
   	scanner.close();
	}
}
