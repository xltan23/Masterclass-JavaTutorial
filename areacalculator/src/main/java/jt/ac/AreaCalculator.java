package jt.ac;

public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }

        double areaCircle = Math.PI*Math.pow(radius, 2); 
        return areaCircle;
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1;
        }

        double areaRect = x*y;
        return areaRect;
    }
}
