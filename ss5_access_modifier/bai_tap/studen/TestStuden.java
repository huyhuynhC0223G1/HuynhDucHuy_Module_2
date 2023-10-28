package ss5_access_modifier.bai_tap.studen;

public class TestStuden {
    public static void main(String[] args) {
        Studen studen = new Studen();
        studen.setName("huy");
        studen.setClasses("C02");
        System.out.println(studen.getName());
        System.out.println(studen.getClasses());
    }
}
