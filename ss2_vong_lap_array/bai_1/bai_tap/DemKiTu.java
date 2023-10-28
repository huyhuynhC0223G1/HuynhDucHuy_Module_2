package ss2_vong_lap_array.bai_1.bai_tap;

public class DemKiTu {
    public static void main(String[] args) {
        String string = "nowornever";
        int count = 0;
        char test = 'o';
        for (int i = 0; i < string.length(); i++) {
            if (test == string.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
