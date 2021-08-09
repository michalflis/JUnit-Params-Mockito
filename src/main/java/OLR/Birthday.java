package OLR;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoField;

public class Birthday {

    private final LocalDate birthDate;

    public Birthday(String birthDate) {
        this.birthDate = LocalDate.parse(birthDate);
    }

    public int getAge() {
        LocalDate dateNow = LocalDate.now();
        return Period.between(birthDate, dateNow).getYears();
    }

    public DayOfWeek getBirthdayDayOfWeek() {
        return birthDate.getDayOfWeek();
    }

    public int getBirthdayWeekOfYear() {
        return birthDate.get((ChronoField.ALIGNED_WEEK_OF_YEAR));
    }
}
