package docchuoikitu;

import java.io.*;

public class BinaryFileExample {
    public static void main(String[] args) {
        // Ghi dữ liệu vào file exp.dat
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("exp.dat"))) {
            dos.writeUTF("Hello, World!");
            dos.writeChar('A');
            dos.writeInt(123);
            dos.writeDouble(45.67);
        } catch (IOException e) {
            System.err.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc dữ liệu từ file exp.dat
        try (DataInputStream dis = new DataInputStream(new FileInputStream("exp.dat"))) {
            System.out.println(dis.readUTF());
            System.out.println(dis.readChar());
            System.out.println(dis.readInt());
            System.out.println(dis.readDouble());
        } catch (IOException e) {
            System.err.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}