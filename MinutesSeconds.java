public class MinutesSeconds {

    // Make a variable constant
    public static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        String time = getDurationString(160, 253);
        System.out.println(time);
        String time2 = getDurationString(698);
        System.out.println(time2);
    }

    public static String getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0) ) {
            return "Invalid value";
        }
        int totalMin = minutes + seconds/60;
        int totalHours = totalMin/60;
        int remainingMin = totalMin % 60;
        int remainingSec = seconds % 60;
        return totalHours + "h " + remainingMin + "m " + remainingSec + "s";
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds/60;
        int remainingSec = seconds % 60;
        return getDurationString(minutes, remainingSec);
        
    }
        

    
}
