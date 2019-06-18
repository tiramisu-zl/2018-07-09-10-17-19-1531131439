package practice07;

public class Klass {
    private Number number;

    public Klass(Number myNumber) {
        this.number = myNumber;
    }

    public Number getNumber() {
        return number;
    }

    public String getDisplayName() {
        return String.format("Class %s", number);
    }
}
