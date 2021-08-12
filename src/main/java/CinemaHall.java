public class CinemaHall {

    private CinemaHallName name;
    private CinemaType cinemaType;

    public CinemaHall (CinemaHallName name, CinemaType cinemaType) {
        this.name = name;
        this.cinemaType = cinemaType;
    }

    public CinemaHallName getName() {
        return name;
    }

    public CinemaType getCinemaType() {
        return cinemaType;
    }
}
