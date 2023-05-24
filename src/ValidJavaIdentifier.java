import java.util.regex.Pattern;
//this one was haaard
public class ValidJavaIdentifier {
    public static boolean isValidIdentifier(String identifier) {
        String identifierRegex = "^[a-zA-Z_$][a-zA-Z0-9_$]*$";
        return Pattern.matches(identifierRegex, identifier);
    }
    public static void main(String[] args) {
        String javaIdentifier = "newBook_1";
        System.out.print(javaIdentifier + " ");
        if (isValidIdentifier(javaIdentifier)) {
            System.out.println("is a valid Java identifier");
        } else {
            System.out.println("is an invalid Java identifier");
        }
    }
}
