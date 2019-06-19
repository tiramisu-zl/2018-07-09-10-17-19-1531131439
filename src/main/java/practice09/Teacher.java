package practice09;

public class Teacher extends Person{
    private Klass klass;

    public Teacher(int myId, String myName, int myAge) {
        super(myId, myName, myAge);
    }

    public Teacher(int myId, String myName, int myAge, Klass myKlass) {
        super(myId, myName, myAge);
        klass = myKlass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        if (this.getKlass() != null) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach Class %s.", getName(), getAge(), klass.getNumber());
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach No Class.", getName(), getAge());
        }
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == klass.getNumber()) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach %s.", getName(), getAge(), student.getName());
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I don't teach %s.", getName(), getAge(), student.getName());
        }
    }
}
