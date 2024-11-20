package tratudien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();

        while (true) {
            System.out.print("Moi nhap tu can tra: ");
            String word = scanner.nextLine().trim();

            // Kiểm tra nếu người dùng nhập chuỗi rỗng
            if (word.isEmpty()) {
                System.out.println("Chương trình kết thúc.");
                break;
            }

            // Tra từ và hiển thị kết quả
            String meaning = dictionary.lookup(word);
            System.out.println("Nghia cua tu la: " + meaning);
        }

        scanner.close();
    }
}