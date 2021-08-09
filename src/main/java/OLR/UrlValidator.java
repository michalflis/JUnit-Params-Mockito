package OLR;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlValidator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź adres URL");
        String pesel = scan.nextLine();
        if (urlValidate(pesel)) System.out.println("Prawidłowy adres URL");
        else System.out.println("Błędny adres URL");

    }

    private static final Pattern PATTERN = Pattern.compile("https?://[0-9A-z-_~.]*");

    public static boolean urlValidate(String pesel) {

        Matcher matcher = PATTERN.matcher(pesel);
        return matcher.matches();

    }

}
