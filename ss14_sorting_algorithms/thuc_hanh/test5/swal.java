package ss14_sorting_algorithms.thuc_hanh.test5;

public class swal {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Trước swap: a = " + a + ", b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("Sau swap: a = " + a + ", b = " + b);
    }
}

