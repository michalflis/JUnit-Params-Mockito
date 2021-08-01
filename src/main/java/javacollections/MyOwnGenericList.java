package javacollections;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MyOwnGenericList<E> implements OwnGenericList{

    private E[] array;

    public MyOwnGenericList (E e) {
        this.array = (E[]) Array.newInstance((Class<E>) e, DEFAULT_CAPACITY);
    }


    public boolean add(e <E>) {
        if (array.length <= DEFAULT_CAPACITY) {
            for (int i = 0; i<= array.length; i++) {
                if (array[i] == null) array[i] = e;
            }


            e = Arrays.copyOf(e, e.length + 1);
            array[array.length - 1] = element;
        }
        return false;
    }

    @Override
    public boolean add(Object o) {
        if (array.length <= DEFAULT_CAPACITY) {
            for (int i = 0; i<= array.length; i++) {
                if (array[i] == null) array[i] = o;
            }
    }

    @Override
    public Object get(int index) {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}
