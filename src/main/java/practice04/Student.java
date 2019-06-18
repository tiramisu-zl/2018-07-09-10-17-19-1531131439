package practice04;

public class Student extends Person{
    private Number klass;

    public Student(String myName, int myAge, Number myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public Number getKlass() {return klass;}

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Student. I am at Class %s.", getName(), getAge(), klass);
    }
}