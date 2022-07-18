public class FeetInchesCenti {
    public static void main(String[] args) {
        double centimeter = calcFeetAndInchesToCentimeters(15, 6);
        System.out.println("Inches to: " + centimeter + "cm");
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || (inches < 0 || inches > 12)) {
            return -1;
        }
        double toCm = (feet*12+inches)*2.54;
        return toCm;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            return -1;
        } 
        double toFeet = inches/12;
        return toFeet;
    }

}
