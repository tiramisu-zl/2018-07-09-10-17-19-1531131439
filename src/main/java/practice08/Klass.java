package practice08;

public class Klass {
    private Number number;
    private Student leader;

    public Klass(Number myNumber) {
        this.number = myNumber;
    }

    public Number getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public String getDisplayName() {
        return String.format("Class %s", number);
    }

    public void assignLeader(Student student) {
        this.setLeader(student);
    }
}
