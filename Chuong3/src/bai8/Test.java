package bai8;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle("red", 4, 5);
        shapes[1] = new Triangle("blue", 3, 6);
        shapes[2] = new Rectangle("green", 2, 3);
        shapes[3] = new Triangle("yellow", 4, 5);

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
        for (int i = 0; i < shapes.length - 1; i++) {
            for (int j = i + 1; j < shapes.length; j++) {
                if (shapes[i].getArea() > shapes[j].getArea()) {
                    Shape temp = shapes[i];
                    shapes[i] = shapes[j];
                    shapes[j] = temp;
                }
            }
        }

        // In danh sách các hình sau khi sắp xếp
        System.out.println("\nDanh sách các hình sau khi sắp xếp theo diện tích tăng dần:");
        for (Shape shape : shapes) {
            System.out.println(shape + " with area: " + shape.getArea());
        }
    }
}
