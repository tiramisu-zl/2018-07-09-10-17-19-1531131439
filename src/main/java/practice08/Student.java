package practice08;

public class Student extends Person{
    private Klass klass;

    public Student(int myId, String myName, int myAge, Klass myKlass) {
        super(myId, myName, myAge);
        klass = myKlass;
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
