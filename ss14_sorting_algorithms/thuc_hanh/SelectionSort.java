package ss14_sorting_algorithms.thuc_hanh;

public class SelectionSort {
    static double[] list = {2, 3, 5, 6, 9, 7};

    public static void main(String[] args) {
        selectionSort(list);
        for (double v : list) {
            System.out.println(v);
        }
    }

    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            double min = list[i];
            int minindex = i;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minindex = j;
                }
            }
            if (minindex != i) {
                list[minindex] = list[i];
                list[i] = min;
            }
        }
    }
}
