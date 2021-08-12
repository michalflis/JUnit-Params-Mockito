import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class Phonebook {

    public static void main(String[] args) throws IOException {

        System.out.println(findPerson("Dupa", "Dupa"));
    }

    public static void addPerson(Person person) throws IOException {
        Files.writeString(Paths.get("src/main/resources/phonebook.csv"),
                person.getName() + ";" + person.getSurname() + ";" + person.getPhoneNumber() + ";" + person.getAddress() + "\n", StandardOpenOption.APPEND);
    }

    private static List<String> importPhonebook() throws IOException {
        return Files.readAllLines(Paths.get("src/main/resources/phonebook.csv"));
    }

    public static Person findPerson(String name, String surname) throws IOException {

        for (String line : importPhonebook()) {
            String[] personData = line.split(";");
            if (personData[0].equals(name) && personData[1].equals(surname)) {
                if (checkPhonenumber(personData[2])) {
                    return new Person(personData[0], personData[1], Integer.parseInt(personData[2]), personData[3]);
                }
                return new Person(personData[0], personData[1], personData[3]);
            }
        }
        throw new

                NoSuchElementException();

    }

    private static boolean checkPhonenumber(String phonenumber) {

        if (phonenumber.equals("") || phonenumber.equals("0")) phonenumber = null;
        return Optional.ofNullable(phonenumber).isPresent();
    }


}
