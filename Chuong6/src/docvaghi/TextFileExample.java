package docvaghi;

import java.io.*;

public class TextFileExample {
    public static void main(String[] args) {
        // Ghi dữ liệu vào file exp.txt
        try (PrintWriter writer = new PrintWriter(new FileWriter("exp.txt"))) {
            writer.println("Hello, World!");
            writer.println('A');
            writer.println(123);
            writer.println(45.67);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file exp.txt
        try (BufferedReader reader = new BufferedReader(new FileReader("exp.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}