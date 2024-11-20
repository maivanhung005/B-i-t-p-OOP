package baitapc2;

import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = sc.nextInt();
        
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
        }
        
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Tổng các phần tử của mảng: " + sum);
    }
}
