package OLR;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PeselValidator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj swój numer PESEL");
        String pesel = scan.nextLine();
        if (peselValidate(pesel)) System.out.println("Prawidłowy numer PESEL");
        else System.out.println("Błędny numer PESEL");

    }

    public static boolean peselValidate(String pesel) {

        Pattern pattern = Pattern.compile("\\d{11}");
        Matcher matcher = pattern.matcher(pesel);
        return matcher.matches();

    }

}
