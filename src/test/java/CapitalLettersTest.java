import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

class CapitalLettersTest {

    @ParameterizedTest
    @ValueSource (strings = {"text", "Text", "tExT"})
    void shouldConvertTextToCapitalLetters(String input) {
        //given
        CapitalLetters capitalLetters = new CapitalLetters();
        String result;

        //when
        result = capitalLetters.convertToCapitalLetters(input);

        //then
        Assertions.assertEquals("TEXT", result);

    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldConvertStringToCapitalLetters_Empty(String input) {
        //given
        CapitalLetters capitalLetters = new CapitalLetters();
        String result;

        //when
        result = capitalLetters.convertToCapitalLetters(input);

        //then
        Assertions.assertEquals("", result);

    }

}