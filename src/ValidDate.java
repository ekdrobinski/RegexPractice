import java.util.regex.Pattern;

public class ValidDate {
    public static boolean isValidDate(String date) {
        String dateRegex = "^(0[1-9]|1[0-2])/(0[1-9]|1\\d|2\\d|3[01])/\\d{4}$";
        return Pattern.matches(dateRegex, date);
    }
    public static void main(String[] args) {
        String date = "06/10/2020";
        System.out.print(date + " ");
        if (isValidDate(date)) {
            System.out.println("is a valid date");
        } else {
            System.out.println("is an invalid date");
        }
    }
}
