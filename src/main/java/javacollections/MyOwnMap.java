package javacollections;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyOwnMap implements OwnMap {

    private final String[][] ownMap;

    public MyOwnMap (String key, String value) {
        this.ownMap = new String[][]{{Integer.toString(key.hashCode())}, {value}};
    }

    @Override
    public boolean put(String key, String value) {
        if (containsKey(key)) {
            ownMap[1][findIndex(key)] = value;
        } else {
            ownMap[0] = Arrays.copyOf(ownMap[0], ownMap[0].length + 1);
            ownMap[1] = Arrays.copyOf(ownMap[1], ownMap[1].length + 1);
            ownMap[0][ownMap[1].length - 1] = Integer.toString(key.hashCode());
            ownMap[1][ownMap[1].length - 1] = value;
        }
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        for (String expectedKey : ownMap[0]) {
            if (Integer.toString(key.hashCode()).equals(expectedKey)) return true;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (String expectedValue : ownMap[1]) {
            if (value.equals(expectedValue)) return true;
        }
        return false;
    }

    @Override
    public String remove(String key) {
        String removedItem = ownMap[1][findIndex(key)];
        if (containsKey(key)) {
            for (int i = findIndex(key); i <= ownMap[0].length - 2; i++) {
                ownMap[0][i] = ownMap[0][i + 1];
                ownMap[1][i] = ownMap[1][i + 1];
            }
            ownMap[0] = Arrays.copyOf(ownMap[0], ownMap[0].length - 1);
            ownMap[1] = Arrays.copyOf(ownMap[1], ownMap[1].length - 1);
            return removedItem;
        }
        throw new NoSuchElementException();
    }

    @Override
    public String get(String key) {
        if (containsKey(key)) return ownMap[1][findIndex(key)];
        throw new NoSuchElementException();
    }

    private int findIndex(String key) {
        for (int i = 0; i <= ownMap[0].length - 1; i++)
            if (Integer.toString(key.hashCode()).equals(ownMap[0][i])) return i;
        throw new NoSuchElementException();
    }

    public void showMeTheMap() {
        for (int i = 0; i <= ownMap[0].length - 1; i++)
        System.out.println(ownMap[0][i] + ", " + ownMap[1][i]);
    }
}
