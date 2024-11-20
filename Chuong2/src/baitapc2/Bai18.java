package baitapc2;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập một số nguyên: ");
        int num = sc.nextInt();
        if (isPrime(num)) {
            System.out.println(num + " là số nguyên tố.");
        } else {
            System.out.println(num + " không phải là số nguyên tố.");
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
