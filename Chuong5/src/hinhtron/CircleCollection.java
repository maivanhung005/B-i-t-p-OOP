package hinhtron;

import java.util.*;

public class CircleCollection {
    private ArrayList<Circle> al;

    public CircleCollection() {
        al = new ArrayList<>();
    }

    public void addCircle(Circle c) {
        al.add(c);
    }

    public Circle getCircle(int pos) {
        if (pos >= 0 && pos < al.size()) {
            return al.get(pos);
        }
        return null;
    }

    public void setCircle(int pos, Circle c) {
        if (pos >= 0 && pos < al.size()) {
            al.set(pos, c);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Circle c : al) {
            sb.append(c.toString()).append("\n");
        }
        return sb.toString();
    }

    public double calcSumArea() {
        double sum = 0;
        for (Circle c : al) {
            sum += c.getArea();
        }
        return sum;
    }

    public double findMinArea() {
        if (al.isEmpty()) {
            return -1;
        }
        double minArea = Double.MAX_VALUE;
        for (Circle c : al) {
            double area = c.getArea();
            if (area < minArea) {
                minArea = area;
            }
        }
        return minArea;
    }

    public double findMaxArea() {
        if (al.isEmpty()) {
            return -1;
        }
        double maxArea = Double.MIN_VALUE;
        for (Circle c : al) {
            double area = c.getArea();
            if (area > maxArea) {
                maxArea = area;
            }
        }
        return maxArea;
    }
}