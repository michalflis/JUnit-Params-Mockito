import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.time.Month;

class SeasonNameTest {

    @ParameterizedTest
    @CsvSource(value = {"JANUARY:WINTER","APRIL:SPRING", "JULY:SUMMER", "OCTOBER:AUTUMN" }, delimiter = ':')
    void shouldGetSeasonName(Month input, Season expected) {
        //given
        SeasonName seasonName = new SeasonName();

        //when
        Season result = seasonName.getSeasonName(input);

        //then
        Assertions.assertEquals(expected, result);

    }

}