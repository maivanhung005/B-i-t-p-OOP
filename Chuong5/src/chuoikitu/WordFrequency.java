package chuoikitu;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        // Khởi tạo mảng các chuỗi
        String[] lines = {
            "learn java by example",
            "guide to advance java",
            "example of distributed in java"
        };

        // Khởi tạo HashMap để lưu trữ tần suất xuất hiện của các từ
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Duyệt qua từng dòng trong mảng
        for (String line : lines) {
            // Tách dòng thành các từ
            String[] words = line.split(" ");

            // Đếm số lần xuất hiện của mỗi từ
            for (String word : words) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Hiển thị kết quả
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Tính tổng số ký tự trong các chuỗi của mảng
        int totalCharacters = 0;
        for (String line : lines) {
            totalCharacters += line.replaceAll(" ", "").length();
        }

        System.out.println("Tổng số ký tự: " + totalCharacters);
    }
}