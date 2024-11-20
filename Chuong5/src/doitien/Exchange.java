package doitien;

import java.util.*;

public class Exchange {
    private ArrayList<Rate> rates;

    public Exchange() {
        rates = new ArrayList<>();
        // Khởi tạo mảng MonArr
        String[] monArr = {
            "USD;IDN;15789",
            "USD;EUR;0.83",
            "CAD;IDN;16869"
        };
        // Thêm các đối tượng Rate vào danh sách
        for (String s : monArr) {
            String[] parts = s.split(";");
            String code1 = parts[0].trim();
            String code2 = parts[1].trim();
            double rate = Double.parseDouble(parts[2].trim());
            rates.add(new Rate(code1, code2, rate));
        }
    }

    public double convert(String code1, String code2, double amount) {
        for (Rate r : rates) {
            if (r.getCode1().equals(code1) && r.getCode2().equals(code2)) {
                return amount * r.getRate();
            }
        }
        return -1; // Trường hợp không tìm thấy tỷ giá
    }
}