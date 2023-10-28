package ss10_dsa.bai_tap.mylist;

import ss10_dsa.bai_tap.mylist.MyList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println(list.toString());
        System.out.println(list.remove(3));
        System.out.println(list.toString());
        System.out.println(list.get(2));
    }
}
