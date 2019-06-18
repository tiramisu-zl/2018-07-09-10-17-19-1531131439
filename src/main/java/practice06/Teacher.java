package practice06;

public class Teacher extends Person {
    private Integer klass;

    public Teacher(String myName, int myAge) {
        super(myName, myAge);
    }

    public Teacher(String myName, int myAge, Integer myKlass) {
        super(myName, myAge);
        klass = myKlass;
    }

    public Integer getKlass() {
        return klass;
    }

    public String introduce() {
        if (this.getKlass() != null) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach Class %s.", getName(), getAge(), klass);
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach No Class.", getName(), getAge());
        }
    }
}
