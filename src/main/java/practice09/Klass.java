package practice09;

public class Klass {
    private Number number;
    private Student leader;

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

    public String getDisplayName() {
        return String.format("Class %s", number);
    }

    public void appendMember(Student student) {
        // 该方法意味将一名学生加入该班级。但是没有明确怎么加入, 需要新加一个变量存append student？
        // 在new Student 时传的klass number 不是就可以确认班级了吗？
        // 如果student 有klass number, 但是klass 没有append，那这个学生算不算这个班级的呢？
        System.out.println("append success");
    }

    public void assignLeader(Student student) {
        if (student.getKlass().getNumber() == number) { // 如果有一个studentList属性来存append的student,则判断studentList里面是否包含该学生
            this.setLeader(student);
        } else {
            System.out.println("It is not one of us.");
        }
    }
}
