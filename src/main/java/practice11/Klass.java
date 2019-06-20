package practice11;

import java.util.*;

public class Klass extends Observable {
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

    public boolean isIn (Student student) {
        return students.contains(student);
    }

    public void appendMember(Student student) {
        students.add(student);
        student.setKlass(this);

        this.setChanged();
        this.notifyObservers(student);
    }

    public void assignLeader(Student student) {
        if (students != null && isIn(student)) {
            this.setLeader(student);
            this.setChanged();
            this.notifyObservers(this);
        } else {
            System.out.println("It is not one of us.");
        }
    }
}
