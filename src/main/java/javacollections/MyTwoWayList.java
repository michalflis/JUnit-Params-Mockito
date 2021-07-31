package javacollections;
import java.util.Arrays;

public class MyTwoWayList {

    private final String[][] twoWayList;

    public MyTwoWayList(String input) {
        this.twoWayList = new String[][]{{input}, {null}, {null}};
    }

    public MyTwoWayList(String[] input) {
        String[][] twoWayList = new String[3][input.length];
        for (int i = 0; i <= input.length - 1; i++) {
            twoWayList[0][i] = input[i];

            if(i == 0) {
                twoWayList[1][i] = null;
                twoWayList[2][i] = Integer.toString(i + 1);
            } else if (i == input.length - 1){
                twoWayList[1][i] = Integer.toString(i - 1);
                twoWayList[2][i] = null;
            } else {
                twoWayList[1][i] = Integer.toString(i - 1);
                twoWayList[2][i] = Integer.toString(i + 1);
            }
        }
        this.twoWayList = twoWayList;
    }

    public boolean add(String input) {
        for (int i = 0; i <= twoWayList.length - 1; i++ )
            twoWayList[i] = Arrays.copyOf(twoWayList[i], twoWayList[i].length + 1);

        twoWayList[0][twoWayList[0].length - 1] = input;
        twoWayList[1][twoWayList[1].length - 1] = Integer.toString(twoWayList[0].length - 2);
        twoWayList[2][twoWayList[2].length - 1] = null;
        twoWayList[2][twoWayList[2].length - 2] = Integer.toString(twoWayList[0].length - 1);
        return true;
    }

    public boolean add(String input, int index) {
        for (int i = 0; i <= twoWayList.length - 1; i++ )
            twoWayList[i] = Arrays.copyOf(twoWayList[i], twoWayList[i].length + 1);

        for (int i = twoWayList[0].length - 1; i >= index; i--) {
                twoWayList[0][i] = twoWayList[0][i - 1];
        }
        twoWayList[0][index] = input;
        twoWayList[2][twoWayList[2].length - 2] = Integer.toString(twoWayList[2].length - 1);
        twoWayList[1][twoWayList[1].length - 1] = Integer.toString(twoWayList[1].length - 2);
        return true;
    }

    public boolean remove(int index) {
        if (index >= twoWayList.length) {
            throw new IndexOutOfBoundsException();
        } else {
            for (int i = index; i <= twoWayList[0].length - 2; i++) {
                    twoWayList[0][i] = twoWayList[0][i + 1];
            }
            twoWayList[2][twoWayList[2].length - 2] = null;

            for (int i = 0; i <= twoWayList.length - 1; i++ )
                twoWayList[i] = Arrays.copyOf(twoWayList[i], twoWayList[i].length - 1);
            return true;
        }
    }

    public int length() {
        return twoWayList[0].length;
    }
}
