package ss2_vong_lap_array.bai_1.bai_tap;

public class TimPhanTuLonNhat {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3}, {4, 7, 6}};
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        System.out.println(max);
    }
}
