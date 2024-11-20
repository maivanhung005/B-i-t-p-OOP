package chuoikitu;
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
	             if (input.length() > 30) {
	                 throw new StringTooLongException("Lỗi: Chuỗi quá dài!");
	             }
	             System.out.println("Bạn đã nhập: " + input);
	         } catch (StringTooLongException e) {
	             System.out.println(e.getMessage());
	             System.out.println("Chương trình kết thúc do chuỗi quá dài.");
	             break;
	         }
	     }
	     scanner.close();
	 }
	}