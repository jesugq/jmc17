public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65, 145));
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3945));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Argument seconds (" + seconds + ") of type int must be positive.";
        }

        int secondsToMinutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(secondsToMinutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "Argument minutes (" + minutes + ") of type int must be positive.";
        } else if (seconds < 0) {
            return "Argument seconds (" + seconds + ") of type int must be positive.";
        } else if (seconds > 59) {
            return "Argument seconds (" + seconds + ") of type int must not exceed a minute.";
        }

        int minutesToHours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = seconds;

        return minutesToHours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
    }
}
