package javacollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class MyOwnListTest {

    @Test
    void shouldReturnSizeOfList_1_2_3() {
        //given
        int[] array = {1, 2, 3};
        MyOwnList myOwnList = new MyOwnList(array);

        //when
        int result = myOwnList.size();

        //then
        Assertions.assertEquals(result, 3);
    }

    @Test
    void ShouldCheckIfListIsEmpty_1_2_3() {
        //given
        int[] array = {1, 2, 3};
        MyOwnList myOwnList = new MyOwnList(array);

        //when
        boolean result = myOwnList.isEmpty();

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void ShouldCheckIfListIsEmpty_Empty() {
        //given
        int[] array = {};
        MyOwnList myOwnList = new MyOwnList(array);


        //when
        boolean result = myOwnList.isEmpty();

        //then
        Assertions.assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2})
    void shouldGetValueFromIndexOfList(int input) {
        //given
        int[] array = {1, 2, 3};
        MyOwnList myOwnList = new MyOwnList(array);

        //when
        int result = myOwnList.get(input);

        //then
        Assertions.assertEquals(result, array[input]);

    }

}