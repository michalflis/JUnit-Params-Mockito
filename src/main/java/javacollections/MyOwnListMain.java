package javacollections;

public class MyOwnListMain {

    public static void main(String[] args) {

        int[] array = {1,3,4};
        MyOwnList myOwnList = new MyOwnList(array);

        System.out.println(myOwnList.size());
        System.out.println(myOwnList.isEmpty());
        myOwnList.add(15);
        System.out.println(myOwnList.get(3));
        myOwnList.add(2,9);
        myOwnList.remove(700);

    }

}
