package ss14_sorting_algorithms.thuc_hanh;

public class Demo {

        public static void main(String[] args) {
            StringBuilder sb = new StringBuilder(5);
            String s = "";
            if (sb.equals(s)) {
                System.out.println("Match 1");
            } else if (sb.toString().equals(s.toString())) {
                System.out.println("Match 2");
            } else System.out.println("No match");

            String ta = "A ";
            ta = ta.concat("B ");
            String tb = "C ";
            ta = ta.concat(tb);
            ta.replace("C","D");
            ta=ta.concat(tb);
            System.out.println(ta);

        }
    }

