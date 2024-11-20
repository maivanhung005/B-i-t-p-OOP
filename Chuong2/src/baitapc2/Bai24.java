package baitapc2;

import java.util.Scanner;

public class Bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        
        int[] englishScores = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập điểm thi tiếng Anh của sinh viên thứ " + (i + 1) + ": ");
            englishScores[i] = sc.nextInt();
        }
        
        System.out.print("Nhập điểm thi cần tìm: ");
        int searchScore = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (englishScores[i] == searchScore) {
                System.out.println("Sinh viên thứ " + (i + 1) + " có điểm bằng " + searchScore);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("Không tìm thấy sinh viên nào có điểm bằng " + searchScore);
        }
    }
}

