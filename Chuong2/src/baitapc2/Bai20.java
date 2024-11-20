package baitapc2;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ C: ");
        double celsius = sc.nextDouble();
        
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Nhiệt độ tương ứng ở độ F: " + fahrenheit);
    }
}

