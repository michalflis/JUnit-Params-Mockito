package OLR;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj hasło");
        String password = scan.nextLine();
        if (passwordValidate(password)) System.out.println("Prawidłowe hasło");
        else System.out.println("Błędne hasło");

    }

    private static final Pattern PATTERN_INCLUDES = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{7,}");
    private static final Pattern PATTERN_EXCLUDES = Pattern.compile("((?!.*21.*)(?!.*2021.*).)*");

    public static boolean passwordValidate(String password) {

        Matcher matcher1 = PATTERN_INCLUDES.matcher(password);
        if (matcher1.matches()) {
            Matcher matcher2 = PATTERN_EXCLUDES.matcher(password);
            return matcher2.matches();
        }
        return false;
    }

}
