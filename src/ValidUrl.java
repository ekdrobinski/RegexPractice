import java.util.regex.Pattern;

public class ValidUrl {
    public static boolean isValidUrl(String url) {
        String urlRegex = "^(http|https):+([//]+[w.])+[A-Za-z0-9.]+[a-z]{3}$";
        return Pattern.matches(urlRegex, url);
    }

    public static void main(String[] args) {
        String url = "https://www.test.com";
        System.out.print(url + " ");
        if (isValidUrl(url)) {
            System.out.println("is a valid URl");
        } else {
            System.out.println("is an invalid Url");
        }
    }
}

