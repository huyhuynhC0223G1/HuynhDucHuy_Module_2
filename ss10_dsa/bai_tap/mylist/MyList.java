package ss10_dsa.bai_tap.mylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static int DEFAULT_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAULT_CAPACITY];
    }

    public E remove(int index) {
        int i = 0;
        while (i < element.length) {
            if (i == index) {
                for (int j = i; j < element.length - 1; j++) {
                    element[j] = element[j + 1];
                }
            }
            i++;
        }
        return (E) element;
    }

    public boolean add(E e) {
        if (size <= element.length) {
            element[size++] = e;
        }
        return false;
    }

    @Override
    public String toString() {
        return "MyList:" +
                "size=" + size +
                ", element=" + Arrays.toString(element);
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", size " + index);
        }
        return (E) element[index];
    }
}
