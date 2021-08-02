package javacollections;

public class BubbleSort<E extends Comparable<E>> {

    private E[] e;

    public BubbleSort (E[] e) {
        this.e = e;
    }

    public void sort() {
        int n = e.length;
        do {
            for (int i = 0; i < n - 1; i++) {
                if (e[i].compareTo(e[i + 1]) > 0) {
                    swap(i, e);
                }
            }
            n--;
        }
            while (n > 1);
    }

    private void swap (int i, E[] e) {
        E temp = e[i];
        e[i] = e[i + 1];
        e[i + 1] = temp;
    }
}
