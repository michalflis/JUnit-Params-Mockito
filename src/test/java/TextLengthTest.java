import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class TextLengthTest {

    @ParameterizedTest
    @MethodSource ("provideStringForTextLength")
    void shouldGetTextLength(String input, int expected) {
        //given
        TextLength textLength = new TextLength();
        int result;

        //when
        result = textLength.getTextLength(input);

        //then
        Assertions.assertEquals(expected, result);

    }

    private static Stream<Arguments> provideStringForTextLength() {
        return Stream.of(
                Arguments.of("Test", 4),
                Arguments.of("Hello world", 11),
                Arguments.of("Michal", 6)
        );

    }

}