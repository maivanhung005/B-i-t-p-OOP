package bai8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle("red", 4, 5));
        shapes.add(new Triangle("blue", 3, 6));
        shapes.add(new Rectangle("green", 2, 3));
        shapes.add(new Triangle("yellow", 4, 5));
        
        // In danh sách các hình
        System.out.println("Danh sách các hình:");
        for (Shape shape : shapes) {
            System.out.println(shape + " with area: " + shape.getArea());
        }

        // Tìm kiếm hình theo màu sắc
        String searchColor = "blue";
        System.out.println("\nTìm kiếm hình có màu " + searchColor + ":");
        for (Shape shape : shapes) {
            if (shape.color.equals(searchColor)) {
                System.out.println(shape + " with area: " + shape.getArea());
            }
        }

        // Sắp xếp danh sách các hình theo diện tích tăng dần
        Collections.sort(shapes, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                return Double.compare(s1.getArea(), s2.getArea());
            }
        });

        // In danh sách các hình sau khi sắp xếp
        System.out.println("\nDanh sách các hình sau khi sắp xếp theo diện tích tăng dần:");
        for (Shape shape : shapes) {
            System.out.println(shape + " with area: " + shape.getArea());
        }
    }
}
