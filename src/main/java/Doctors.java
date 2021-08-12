import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Doctors {

    public static void main(String[] args) {
        List<String> doctors = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra",
                "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");

        doctors.stream()
                .map(doctor -> doctor.split(":"))
                .flatMap(array -> Arrays.stream(array).skip(1))
                .distinct()
                .forEach(System.out::println);
    }
}


