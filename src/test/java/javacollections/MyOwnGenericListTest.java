package javacollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyOwnGenericListTest {

    @Test
    void shouldAddElementsToTheArray_1_2_3_4_5_6_7_8_9_10_11() {
        //given
        MyOwnGenericList<Integer> myOwnGenericList = new MyOwnGenericList<>(Integer.class);
        for (int i = 0; i <= 9; i++){
            myOwnGenericList.add(i + 1);
        }

        //when
        boolean result = myOwnGenericList.add(11);
        myOwnGenericList.showArray();

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldGetElementFromArray_Pies() {
        //given
        MyOwnGenericList<String> myOwnGenericList = new MyOwnGenericList<>(String.class);
        myOwnGenericList.add("Pies");
        myOwnGenericList.add("Kot");

        //when
        String result = myOwnGenericList.get(0);

        //then
        Assertions.assertEquals("Pies", result);
    }

    @Test
    void shouldRemoveElementFromArray_Char_176() {
        //given
        MyOwnGenericList<Character> myOwnGenericList = new MyOwnGenericList<>(Character.class);
        myOwnGenericList.add('°');
        myOwnGenericList.add('x');
        myOwnGenericList.remove('°');

        //when
        boolean result = myOwnGenericList.remove('x');

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldRemoveElementFromArray_NotExisting() {
        //given
        MyOwnGenericList<Character> myOwnGenericList = new MyOwnGenericList<>(Character.class);
        myOwnGenericList.add('°');
        myOwnGenericList.add('x');

        //when
        boolean result = myOwnGenericList.remove('k');

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void shouldGetArraySize_Default10() {
        //given
        MyOwnGenericList<Boolean> myOwnGenericList = new MyOwnGenericList<>(Boolean.class);

        //when
        int result = myOwnGenericList.size();

        //then
        Assertions.assertEquals(10, result);
    }

    @Test
    void shouldGetArraySize_12() {
        //given
        MyOwnGenericList<Boolean> myOwnGenericList = new MyOwnGenericList<>(Boolean.class);
        for (int i = 0; i <= 11; i++){
            myOwnGenericList.add(true);
        }
        //when
        int result = myOwnGenericList.size();

        //then
        Assertions.assertEquals(12, result);
    }

}