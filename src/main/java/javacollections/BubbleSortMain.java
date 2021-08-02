package javacollections;

public class BubbleSortMain {

    public static void main(String[] args) {

        Integer[] integers = {1, 2, 7, 3, 15, 4};
        String[] strings = {"pies", "koń", "kot"};
        BubbleSort<Integer> bubbleSortInt = new BubbleSort<>(integers);
        BubbleSort<String> bubbleSortString = new BubbleSort<>(strings);
        bubbleSortInt.sort();
        bubbleSortString.sort();
        for (int i : integers) System.out.println(i);
        for (String s : strings) System.out.println(s);
    }
}
