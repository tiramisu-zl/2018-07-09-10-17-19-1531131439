package practice11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Observer;

public class Klass {
    private Number number;
    private Student leader;
    private LinkedList<Student> students = new LinkedList<Student>();
    private List<Observer> observers
            = new ArrayList<Observer>();

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

    public void setStudents(LinkedList<Student> students) {
        this.students = students;
    }

    public String getDisplayName() {
        return String.format("Class %s", number);
    }

    public void appendMember(Student student) {
        LinkedList<Student> tempStudents = this.getStudents();

        tempStudents.add(student);
        this.setStudents(tempStudents);
        this.notifyAllObservers(student);
        // 需要add observer 吗？
    }

    public void assignLeader(Student student) {
        if (students != null && students.contains(student)) {
            this.setLeader(student);
        } else {
            System.out.println("It is not one of us.");
        }
    }

    public void notifyAllObservers(Student student){
        for (Observer observer : observers) {
            observer.update(o, student);
        }
    }
}
