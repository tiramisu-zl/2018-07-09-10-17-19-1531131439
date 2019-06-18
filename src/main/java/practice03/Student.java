package practice03;

public class Student extends Person{
    private Number klass;

    public Student(String myName, int myAge, Number myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public Number getKlass() {return klass;}

    public String introduce() {
        return String.format("I am a Student. I am at Class %s.", klass);
    }
}
