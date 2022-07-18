package jt.dc;

public class Main {
    public static void main(String[] args) {
        boolean isEqual = DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175);
        System.out.println("The values are equal up to 3 decimal: " + isEqual);
    
    }
}
