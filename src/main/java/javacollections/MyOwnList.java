package javacollections;

import java.util.Arrays;

public class MyOwnList implements OwnList {

    int[] array;

    public MyOwnList (int[] array) {
        this.array = array;
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public boolean isEmpty() {
        return array.length == 0;
    }

    @Override
    public void add(Integer element) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = element;
    }

    @Override
    public Integer get(int i) {
        return array[i];
    }

    @Override
    public void add(int index, Integer element) {
        try {
            array = Arrays.copyOf(array, array.length + 1);
            for (int i = array.length - 1; i >= index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = element;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Nie istnieje pozycja o indeksie " + index);
        }
    }

    @Override
    public void remove(int index) {
        try {
            if (index >= array.length) {
                throw new IndexOutOfBoundsException();
            } else {
                for (int i = index; i <= array.length - 2; i++) {
                    array[i] = array[i + 1];
                }
                array = Arrays.copyOf(array, array.length - 1);
             }
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Nie istnieje pozycja o indeksie " + index);
        }
    }
}
