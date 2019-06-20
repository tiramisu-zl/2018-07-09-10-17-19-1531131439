package practice10;

import java.util.LinkedList;

public class Klass {
    private Number number;
    private Student leader;
    private LinkedList<Student> students = new LinkedList<Student>();

    public Klass(Number number) {
        this.number = number;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student getLeader() {
        return leader;
    }

    public Number getNumber() {
        return number;
    }

    public LinkedList<Student> getStudents() {
        return students;
    }

    public String getDisplayName() {
        return String.format("Class %s", number);
    }

    public void appendMember(Student student) {
        students.add(student);
        System.out.println("append success");
    }

    public void assignLeader(Student student) {
        if (students != null && students.contains(student)) {
            this.setLeader(student);
        } else {
            System.out.println("It is not one of us.");
        }
    }
}
