package bai7;

public class Test {
    public static void main(String[] args) {
        ResizableCircle resizableCircle = new ResizableCircle(5.0);

        System.out.println("Before resize:");
        System.out.println("ResizableCircle: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        // Resize by 25%
        resizableCircle.resize(25);
        System.out.println("\nAfter resize by 50%:");
        System.out.println("ResizableCircle: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());

        // Resize by -60%
        resizableCircle.resize(-60);
        System.out.println("\nAfter resize by -20%:");
        System.out.println("ResizableCircle: " + resizableCircle);
        System.out.println("Area: " + resizableCircle.getArea());
        System.out.println("Perimeter: " + resizableCircle.getPerimeter());
    }
}