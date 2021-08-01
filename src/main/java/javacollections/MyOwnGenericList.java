package javacollections;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyOwnGenericList<E> implements OwnGenericList<E> {

    private E[] array;

    public MyOwnGenericList (Class<E> e) {
        array = (E[]) Array.newInstance(e, DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(E e) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == null) {
                array[i] = e;
                return true;
            }
        }
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = e;
        return true;
    }

    @Override
    public E get(int index) {
        return array[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == null ){

            } else if (array[i].equals(o)) {
                array[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return array.length;
    }

    public void showArray() {
        for (E e : array) System.out.println(e);
    }
}
