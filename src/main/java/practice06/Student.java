package practice06;

public class Student extends Person{
    private Integer klass;

    public Student(String myName, int myAge, Integer myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public Integer getKlass() {return klass;}

    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Student. I am at Class %s.", getName(), getAge(), klass);
    }
}
