import java.util.regex.Pattern;
public class ValidHexColor {
    public static boolean isValidColorCode(String colorCode) {
        String colorCodeRegex = "^#([a-fA-F0-9]{6})$";
        return Pattern.matches(colorCodeRegex, colorCode);
    }
    public static void main(String[] args) {
        String hexColorCode = "#1abc9f";
        System.out.print(hexColorCode + " ");
        if (isValidColorCode(hexColorCode)) {
            System.out.println("is a valid hexadecimal color code");
        } else {
            System.out.println("is an invalid hexadecimal color code");
        }
    }
}

