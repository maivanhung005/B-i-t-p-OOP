package bai9;

public class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor mặc định
    public Triangle() {
    }

    // Constructor có tham số
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Các phương thức getter và setter
    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return (base * height) / 2;
    }

    // Phương thức hiển thị thông tin
    @Override
    public void display() {
        System.out.println("Triangle [base=" + base + ", height=" + height + ", area=" + getArea() + "]");
    }
}
