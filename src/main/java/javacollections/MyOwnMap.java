package javacollections;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyOwnMap implements OwnMap {

    private String[] ownMap;

    public MyOwnMap(String key, String value) {
        this.ownMap = new String[key.hashCode() + 1];
        ownMap[key.hashCode()] = value;
    }

    @Override
    public boolean put(String key, String value) {
        if (ownMap.length <= key.hashCode()) {
            ownMap = Arrays.copyOf(ownMap, key.hashCode() + 1);
        }
        ownMap[key.hashCode()] = value;
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        if (ownMap.length >= key.hashCode() + 1) {
            return ownMap[key.hashCode()] != null;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (String expectedValue : ownMap) {
            if (value.equals(expectedValue)) return true;
        }
        return false;
    }

    @Override
    public String remove(String key) {
        if (containsKey(key)) {
            String removedItem = ownMap[key.hashCode()];
            ownMap[key.hashCode()] = null;
            return removedItem;
        }
        throw new NoSuchElementException();
    }

    @Override
    public String get(String key) {
        if (containsKey(key)) return ownMap[key.hashCode()];
        throw new NoSuchElementException();
    }
}
