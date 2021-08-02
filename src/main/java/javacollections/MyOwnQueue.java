package javacollections;

import java.util.Arrays;

public class MyOwnQueue implements OwnQueue{

    private int[] ownQueue;

    public MyOwnQueue (int ownQueue) {
        this.ownQueue = new int[] {ownQueue};
    }

    @Override
    public boolean add(Integer e) {
        ownQueue = Arrays.copyOf(ownQueue, ownQueue.length + 1);
        ownQueue[ownQueue.length - 1] = e;
        return true;
    }

    @Override
    public Integer remove() {
        int removedItem = ownQueue[0];
        for (int i = 0; i <= ownQueue.length - 2; i++) {
            ownQueue[i] = ownQueue[i + 1];
        }
        ownQueue = Arrays.copyOf(ownQueue, ownQueue.length - 1);
        return removedItem;
    }

    @Override
    public Integer element() {
        return ownQueue[0];
    }
}
