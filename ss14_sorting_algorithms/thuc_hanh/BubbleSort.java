package ss14_sorting_algorithms.thuc_hanh;

public class BubbleSort {
    static int[] list = {2, 4, 6, 3, 1, 5, 8, 9, 7};

    public static void main(String[] args) {
        bubbleSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i] + "");
        }
    }

    public static void bubbleSort(int[] list) {
        boolean flag = true;
        for (int k = 1; k < list.length && flag; k++) {
            flag = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list[i + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}

