import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.NoSuchElementException;

public class Phonebook {

    static List<String> phonebook;

    public static void main(String[] args) throws IOException {
        phonebook = Files.readAllLines(Paths.get("src/main/resources/phonebook.csv"));

        System.out.println(findPerson("Michał", "Flis"));
    }

    public static void addPerson(Person person) throws IOException {
        Files.writeString(Paths.get("src/main/resources/phonebook.csv"),
                person.getName() + ";" + person.getSurname() + ";" + person.getPhoneNumber() + ";" + person.getAddress() + "\n", StandardOpenOption.APPEND);
    }

    public static Person findPerson(String name, String surname) throws IOException {

        for (String line : phonebook) {
            String[] personData = line.split(";");
            if (personData[0].equals(name) && personData[1].equals(surname)) {
                if (personData[2] != null) {
                    return new Person(personData[0], personData[1], Integer.parseInt(personData[2]), personData[3]);
                }
                return new Person(personData[0], personData[1], personData[3]);
            }
        }
        throw new NoSuchElementException();
    }
}
