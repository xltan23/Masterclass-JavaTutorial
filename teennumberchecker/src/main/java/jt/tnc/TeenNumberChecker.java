package jt.tnc;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int third) {
        if (isTeen(first) || isTeen(second) || isTeen(third)) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isTeen(int age) {
        if ((age >= 13) && (age <= 19)) {
            return true;
        } else {
            return false;
        }
    }
    
}
