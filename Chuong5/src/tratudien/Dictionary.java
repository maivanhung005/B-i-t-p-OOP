package tratudien;

import java.util.*;

public class Dictionary {
    private HashMap<String, String> dictionary;

    public Dictionary() {
        dictionary = new HashMap<>();
        initializeDictionary();
    }

    // Phương thức để khởi tạo từ điển với các phần tử ban đầu
    private void initializeDictionary() {
        String[] entries = {
            "apple: quả táo",
            "ball: quả bóng",
            "cat: con mèo",
            "dog: con chó",
            "elephant: con voi",
            "fish: con cá",
            "gift: món quà",
            "home: nhà"
        };

        for (String entry : entries) {
            String[] parts = entry.split(":");
            String englishWord = parts[0].trim();
            String vietnameseWord = parts[1].trim();
            dictionary.put(englishWord, vietnameseWord);
        }
    }

    // Phương thức để tra nghĩa của một từ
    public String lookup(String word) {
        return dictionary.getOrDefault(word, "khong tim thay");
    }
}