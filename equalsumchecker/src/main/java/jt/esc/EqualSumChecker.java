package jt.esc;

public class EqualSumChecker {

    public static boolean hasEqualSum(int first, int second, int sum) {
        int sumOf = first + second;
        if (sumOf == sum) {
            return true;
        } else {
            return false;
        }
    }
    
}
