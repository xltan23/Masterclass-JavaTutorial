package jt.pc;

public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (temperature < 25 || temperature > 45) {
            return false;
        }
        if (temperature >= 25 && temperature <= 35) {
            return true;
        } else if (temperature > 35 && summer) {
            return true;
        } else {
            return false;
        }
    }
}
