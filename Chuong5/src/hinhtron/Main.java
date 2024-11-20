package hinhtron;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        CircleCollection circleCollection = new CircleCollection();
        Random rand = new Random();

        // Tạo danh sách các hình tròn với bán kính ngẫu nhiên
        for (int i = 0; i < 10; i++) {
            double radius = 1 + rand.nextDouble() * 19; // Bán kính ngẫu nhiên từ 1 đến 20
            Circle circle = new Circle(radius);
            circleCollection.addCircle(circle);
        }

        // Hiển thị thông tin của các hình tròn trong danh sách
        System.out.println("Danh sách các hình tròn:");
        System.out.println(circleCollection);

        // Tính tổng diện tích của các hình tròn
        double totalArea = circleCollection.calcSumArea();
        System.out.println("Tổng diện tích của các hình tròn: " + totalArea);

        // Hiển thị diện tích lớn nhất
        double maxArea = circleCollection.findMaxArea();
        System.out.println("Diện tích lớn nhất: " + maxArea);

        // Hiển thị thông tin của hình tròn có diện tích nhỏ nhất
        double minArea = circleCollection.findMinArea();
        System.out.println("Diện tích nhỏ nhất: " + minArea);
        for (int i = 0; i < 10; i++) {
            Circle circle = circleCollection.getCircle(i);
            if (circle != null && circle.getArea() == minArea) {
                System.out.println("Vị trí trong danh sách: " + i + ", Bán kính: " + circle);
                break;
            }
        }
    }
}