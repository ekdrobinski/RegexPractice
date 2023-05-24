import java.util.regex.Pattern;

public class ValidPhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String phoneRegex = "^\\(\\d{3}\\) \\d{3}-\\d{4}$"; //only works with this format "(123) 456-7890"
        return Pattern.matches(phoneRegex, phoneNumber);
    }
    public static void main(String[] args) {
        String phoneNumber = "(123) 456-7890"; //only this format
        System.out.print(phoneNumber + " ");
        if (isValidPhoneNumber(phoneNumber)) {
            System.out.println("is a valid phone number");
        } else {
            System.out.println("is an invalid phone number");
        }
    }
}
