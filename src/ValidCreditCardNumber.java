import java.util.regex.Pattern;

public class ValidCreditCardNumber {
    public static boolean isValidCreditCardNumber(String creditCardNumber) {
        String creditCardRegex = "^\\d{4}[- ]?\\d{4}[- ]?\\d{4}[- ]?\\d{4}$";
        return Pattern.matches(creditCardRegex, creditCardNumber);
    }

    public static void main(String[] args) {
        String creditCardNumber = "1234-5678-9012-3456";
        System.out.print(creditCardNumber + " ");
        if (isValidCreditCardNumber(creditCardNumber)) {
            System.out.println("is a valid credit card number");
        } else {
            System.out.println("is an invalid credit card number");
        }
    }
}
