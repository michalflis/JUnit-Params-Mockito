package javacollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.NoSuchElementException;

class MyOwnMapTest {


    @ParameterizedTest
    @CsvSource(value = {"one:pies:true", "two:kot:true"}, delimiter = ':')
    void shouldPutNewKeyAndValueToTheMap(String key, String value, boolean expected) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap(value, key);

        //when
        boolean result = myOwnMap.put(key, value);

        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"pies:pies:true", "kot:kot:true"}, delimiter = ':')
    void shouldPutExistingKeyAndValueToTheMap(String key, String value, boolean expected) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap(value, key);

        //when
        boolean result = myOwnMap.put(value, key);


        //then
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @NullSource
    void shouldPutEmptyKeyAndValueToTheMap(String input) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap("pies", "pies");

        //when
        Assertions.assertThrows(NullPointerException.class, () -> myOwnMap.put(input, "koń"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"pies", "kot"})
    void shouldCheckIfMapContainsTheKey(String input) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap(input, "pies");

        //when
        boolean result = myOwnMap.containsKey(input);

        //then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pies", "słoń"})
    void shouldCheckIfMapDoesNotContainsTheKey(String input) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap("kot", "pies");

        //when
        boolean result = myOwnMap.containsKey(input);

        //then
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pies", "kot"})
    void shouldCheckIfMapContainsTheValue(String input) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap("pies", input);

        //when
        boolean result = myOwnMap.containsValue(input);

        //then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"pies", "słoń"})
    void shouldCheckIfMapDoesNotContainsTheValue(String input) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap("kot", "kot");

        //when
        boolean result = myOwnMap.containsValue(input);

        //then
        Assertions.assertFalse(result);
    }

    @ParameterizedTest
    @CsvSource(value = {"one:pies", "two:kot"}, delimiter = ':')
    void shouldRemoveItemFromTheMap(String key, String value) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap(key, value);

        //when
        String result = myOwnMap.remove(key);

        //then
        Assertions.assertEquals(value, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"one:pies", "two:kot"}, delimiter = ':')
    void shouldRemoveNotExistingItemFromTheMap(String key, String value) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap("1", value);

        //when
        Assertions.assertThrows(NoSuchElementException.class, () -> myOwnMap.remove(key));
    }

    @ParameterizedTest
    @CsvSource(value = {"one:pies", "two:kot"}, delimiter = ':')
    void shouldGetItemFromTheMap(String key, String value) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap(key, value);

        //when
        String result = myOwnMap.get(key);

        //then
        Assertions.assertEquals(value, result);
    }

    @ParameterizedTest
    @CsvSource(value = {"one:pies", "two:kot"}, delimiter = ':')
    void shouldGetNotExistingItemFromTheMap(String key, String value) {
        //given
        MyOwnMap myOwnMap = new MyOwnMap("three", value);

        //when
        Assertions.assertThrows(NoSuchElementException.class, () -> myOwnMap.get(key));
    }
}

