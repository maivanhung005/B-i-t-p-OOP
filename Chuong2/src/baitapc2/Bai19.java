package baitapc2;

import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số giờ: ");
        int hours = sc.nextInt();
        System.out.print("Nhập số phút: ");
        int minutes = sc.nextInt();
        System.out.print("Nhập số giây: ");
        int seconds = sc.nextInt();
        
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;
        System.out.println("Tổng số giây: " + totalSeconds);
    }
}
