package javacollections;

public class MyTwoWayListMain {

    public static void main(String[] args) {

        String[] testList = {"kot", "pies", "mysz"};

        MyTwoWayList myTwoWayList = new MyTwoWayList(testList);

        myTwoWayList.add("chomik");
        myTwoWayList.add("żbik");
        myTwoWayList.add("sarna");

        myTwoWayList.add("jeleń", 1);
        myTwoWayList.remove(15);

        System.out.println(myTwoWayList.length());


    }

}
