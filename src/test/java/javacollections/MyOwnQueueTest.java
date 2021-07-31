package javacollections;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyOwnQueueTest {

    @Test
    void shouldAddItemToQueue() {
        //given
        MyOwnQueue myOwnQueue = new MyOwnQueue(1);

        //when
        boolean result = myOwnQueue.add(5);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void shouldRemoveFirstItemFromQueue() {
        //given
        MyOwnQueue myOwnQueue = new MyOwnQueue(1);

        //when
        int result = myOwnQueue.remove();

        //then
        Assertions.assertEquals(1, result);
    }

    @Test
    void shouldRemoveItemFromEmptyQueue() {
        //given
        MyOwnQueue myOwnQueue = new MyOwnQueue(1);
        int result = myOwnQueue.remove();

        //when
        Assertions.assertThrows(IndexOutOfBoundsException.class, myOwnQueue::remove);
    }
    @Test
    void shouldShowFirstItemFromQueue() {
        //given
        MyOwnQueue myOwnQueue = new MyOwnQueue(5);

        //when
        int result = myOwnQueue.element();

        //then
        Assertions.assertEquals(5, result);
    }
}