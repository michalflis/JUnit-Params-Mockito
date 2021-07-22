import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class NumbersTest {

    @ParameterizedTest
    @ValueSource (ints = { 0, 2, 4, 50})
    void shouldCheckIfNumberCanBeDividedByTwo (int input) {
        //given
        Numbers numbers = new Numbers();
        boolean result;

        //when
        result = numbers.checkIfNumberCanBeDividedByTwo(input);

        //then
        Assertions.assertTrue(result);

    }

    @ParameterizedTest
    @ValueSource (ints = { 1, 3, 15, 99})
    void shouldCheckIfNumberCanNotBeDividedByTwo (int input) {
        //given
        Numbers numbers = new Numbers();

        //when
        boolean result = numbers.checkIfNumberCanBeDividedByTwo(input);

        //then
        Assertions.assertFalse(result);

    }

    @ParameterizedTest
    @CsvSource(value = { "1111:4", "2222:8", "456789:39", "999999:54"}, delimiter = ':')
    void shouldSumAllNumberDigit (int input, int expected) {
        //given
        Numbers numbers = new Numbers();

        //when
        int result = numbers.getSumOfDigits(input);

        //then
        Assertions.assertEquals(result, expected);

    }
}