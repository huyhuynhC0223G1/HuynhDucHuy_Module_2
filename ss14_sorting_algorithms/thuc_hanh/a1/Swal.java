package ss14_sorting_algorithms.thuc_hanh.a1;

public class Swal {
    public static void main(String[] args) {
            int a = 5;
            int b = 10;
            System.out.println("Trước swap: a = " + a + ", b = " + b);
            a = a + b;
            b = a - b;
            a = a - b;
            System.out.println("Sau swap: a = " + a + ", b = " + b);
        }
    }

