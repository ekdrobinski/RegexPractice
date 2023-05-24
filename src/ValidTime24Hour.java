import java.util.regex.Pattern;

public class ValidTime24Hour {
    public static boolean isValidTime(String time) {
        String timeRegex = "^([01][0-9]|2[0-3]):([0-5][0-9])$";
        return Pattern.matches(timeRegex, time);
    }

    public static void main(String[] args) {
        String time = "13:45";
        System.out.print(time + " ");
        if (isValidTime(time)) {
            System.out.println("is a valid time written in the 24-hour format");
        } else {
            System.out.println("is an invalid time in the 24-hour format");
        }
    }
}
