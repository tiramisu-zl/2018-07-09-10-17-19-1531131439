package practice11;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
//        klass.getStudents().add(this);
    }

    public void setKlass(Klass klass) {
//        this.klass.getStudents().remove(this);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }
    public String introduce() {
        if (klass.getLeader() != null && klass.getLeader() == this) {
            return String.format("My name is %s. I am %s years old. I am a Student. I am Leader of Class %s.",  getName(), getAge(), klass.getNumber());
        } else {
            return String.format("My name is %s. I am %s years old. I am a Student. I am at Class %s.", getName(), getAge(), klass.getNumber());
        }
    }
}