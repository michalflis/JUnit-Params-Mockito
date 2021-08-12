import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CinemaMain {

    public static void main(String[] args) {

        CinemaHall hall1 = new CinemaHall(CinemaHallName.HALL1, CinemaType.Cinema2D);
        CinemaHall hall2 = new CinemaHall(CinemaHallName.HALL2, CinemaType.Cinema3D);
        CinemaHall hall3 = new CinemaHall(CinemaHallName.HALL3, CinemaType.Cinema3D);
        CinemaHall hall4 = new CinemaHall(CinemaHallName.HALL4, CinemaType.Cinema2D);
        CinemaHall hall5 = new CinemaHall(CinemaHallName.HALL5, CinemaType.Cinema4D);
        CinemaHall hall6 = new CinemaHall(CinemaHallName.HALL6, CinemaType.Cinema4D);
        CinemaHall hall7 = new CinemaHall(CinemaHallName.HALL7, CinemaType.Cinema3D);
        CinemaHall hall8 = new CinemaHall(CinemaHallName.HALL8, CinemaType.Cinema2D);
        CinemaHall hall9 = new CinemaHall(CinemaHallName.HALL9, CinemaType.Cinema2D);
        CinemaHall hall10 = new CinemaHall(CinemaHallName.HALL10, CinemaType.Cinema2D);

        Stream<CinemaHall> cinema = Stream.of(hall1, hall2, hall3, hall4, hall5, hall6, hall7, hall8, hall9, hall10);
        groupHalls(cinema);
    }

    public static void groupHalls(Stream<CinemaHall> cinema) {
        Map<CinemaType, List<CinemaHall>> groupedHalls = cinema.collect(Collectors.groupingBy(CinemaHall::getCinemaType));

        for (CinemaType cinemaType : CinemaType.values()) {
            System.out.println("Sal kinowych typu: " + cinemaType + " jest: " + groupedHalls.get(cinemaType).size());
        }

    }


}
