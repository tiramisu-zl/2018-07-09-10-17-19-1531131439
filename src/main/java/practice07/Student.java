package practice07;

public class Student extends Person{
    private Klass klass;

    public Student(String myName, int myAge, Klass myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Student. I am at Class %s.", getName(), getAge(), klass.getNumber());
    }
}
