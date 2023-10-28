package ss5_access_modifier.bai_tap.studen;

public class Studen {
    private String name = "john";
    private String classes = "C02";

    public Studen() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }
}
