package jt.ac;

public class Main {
    public static void main(String[] args) {
        double area1 = AreaCalculator.area(6);
        System.out.println("Area of circle: " + area1);

        double area2 = AreaCalculator.area(4, 8);
        System.out.println("Area of rectangle: " + area2);
    }
    
}
