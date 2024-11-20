package bai9;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor mặc định
    public Rectangle() {
    }

    // Constructor có tham số
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Các phương thức getter và setter
    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return length * width;
    }

    // Phương thức hiển thị thông tin
    @Override
    public void display() {
        System.out.println("Rectangle [length=" + length + ", width=" + width + ", area=" + getArea() + "]");
    }
}
