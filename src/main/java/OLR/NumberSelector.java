package OLR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberSelector {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Wybierz rodzaj liczb:\n" +
                "Wybierz 1 dla liczb całkowitych.\n" +
                "Wybierz 2 dla liczb zmiennoprzecinkowych.\n" +
                "wybierz 3 dla liczb w notacji naukowej.");
        int numberType = scan.nextInt();

        for (String string : findString(numberType)) {
            System.out.println(string);
        }
    }

    public static List<String> findString(int numberType) {

        String searchingPattern;
        switch (numberType) {
            case 1:
                searchingPattern = "\\d*";
                break;
            case 2:
                searchingPattern = "\\d*\\.\\d*";
                break;
            case 3:
                searchingPattern = "\\d*\\.\\d*[eE][-+]\\d*";
                break;
            default:
                throw new IndexOutOfBoundsException();
        }

        List<String> givenText = Arrays.asList("342", "5.34", "756", "1.234e+07", "7.234243E-02", "6.09", "3457", "87", "1.0001", "3", "5");
        List<String> list = new ArrayList<>();
        Pattern pattern = Pattern.compile(searchingPattern);
        Matcher matcher;
        for (String string : givenText) {
            matcher = pattern.matcher(string);
            if (matcher.matches()) list.add(string);
        }
        return list;
    }
}
