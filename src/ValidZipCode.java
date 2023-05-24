import java.util.regex.Pattern;

public class ValidZipCode {
    public static boolean isValidZipCode(String zipCode) {
        String zipCodeRegex = "^\\d{5}(?:-\\d{4})?$";
        return Pattern.matches(zipCodeRegex, zipCode);
    }
    public static void main(String[] args) {
        String zipCode = "12345";
        System.out.print(zipCode + " ");
        if (isValidZipCode(zipCode)) {
            System.out.println("is a valid ZIP code");
        } else {
            System.out.println("is an invalid ZIP code");
        }
    }
}
