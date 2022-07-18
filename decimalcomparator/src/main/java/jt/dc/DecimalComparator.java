package jt.dc;


public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double first, double second) {
    
        double firstRound;
        double secondRound;

        if (first > 0 && second > 0) {
            firstRound = (double)Math.round(Math.floor(first*1000));
            secondRound = (double)Math.round(Math.floor(second*1000));
        } else if (first < 0 && second < 0) {
            firstRound = (double)Math.round(Math.ceil(first*1000));
            secondRound = (double)Math.round(Math.ceil(second*1000));
        } else {
            firstRound = first;
            secondRound = second;
        }

        if (firstRound == secondRound) {
            return true;
        } else {
            return false;
        }
    }
    
}
