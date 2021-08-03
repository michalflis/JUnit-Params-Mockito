package javacollections;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;


class MyTwoWayListTest {

    @Test
    void shouldAddStringAtNotExistingIndex() {
        //given
        MyTwoWayList myTwoWayList = new MyTwoWayList(new String[]{"pies", "kot"});

        //when and then
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()-> myTwoWayList.add("koń", 13));
    }

    @Test
    void shouldRemoveStringFromNonExistingIndex() {
        //given
        MyTwoWayList myTwoWayList = new MyTwoWayList(new String[]{"pies", "kot"});

        //when and then
        Assertions.assertThrows(IndexOutOfBoundsException.class, ()-> myTwoWayList.remove(13));
    }

    @Test
    void shouldCheckLengthOfList_2() {
        //given
        MyTwoWayList myTwoWayList = new MyTwoWayList(new String[]{"pies", "kot"});

        //when
        int result = myTwoWayList.length();

        //then
        Assertions.assertEquals(2, result);
    }

    @ParameterizedTest
    @NullAndEmptySource
    void shouldCheckLengthOfList(String input) {
        //given
        MyTwoWayList myTwoWayList = new MyTwoWayList(input);

        //when
        int result = myTwoWayList.length();

        //then
        Assertions.assertEquals(1, result);
    }
}