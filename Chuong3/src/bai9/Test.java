package bai9;

public class Test {
    public static void main(String[] args) {
        // Tạo mảng các đối tượng Shape
        Shape[] shapes = new Shape[4];
        shapes[0] = new Rectangle(10, 20);
        shapes[1] = new Triangle(10, 5);
        shapes[2] = new Rectangle(15, 25);
        shapes[3] = new Triangle(20, 10);

        // Hiển thị thông tin của các đối tượng được tạo ra từ lớp Rectangle
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                shape.display();
            }
        }
    }
}
