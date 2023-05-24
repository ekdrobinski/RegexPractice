import java.util.regex.Pattern;

public class ValidEmail {
    public static boolean isValidEmail(String email) {
        String emailRegex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        return Pattern.matches(emailRegex, email);
    }

    public static void main(String[] args) {
        String email = "example@gmail.com";
        System.out.print(email + " ");
        if (isValidEmail(email)) {
            System.out.print("is a valid email address");
        } else {
            System.out.print("is an invalid email address!");
        }
    }
}
