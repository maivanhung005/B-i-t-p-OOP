package baitapc2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số sinh viên: ");
        int n = sc.nextInt();
        
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + ": ");
            scores[i] = sc.nextInt();
        }
        
        // Tìm điểm cao nhất
        int maxScore = Arrays.stream(scores).max().getAsInt();
        
        // Sắp xếp mảng điểm tăng dần
        Arrays.sort(scores);
        
        System.out.println("Điểm cao nhất: " + maxScore);
        System.out.println("Các điểm theo thứ tự tăng dần:");
        for (int score : scores) {
            System.out.print(score + " ");
        }
    }
}
