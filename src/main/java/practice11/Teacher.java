package practice11;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

import static java.util.stream.Collectors.toList;

public class Teacher extends Person implements Observer {
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public void update(Observable o, Object arg) {

//        Class clazz = arg.getClass();
//        if (clazz == Student.class)

        if (arg instanceof Student) {
            Student student = (Student) arg;
            String string = "I am %s. I know %s has joined Class %d.\n";
            System.out.printf(string, getName(), student.getName(), student.getKlass().getNumber());
        } else if (arg instanceof Klass) {
            Klass klass = (Klass) arg;
            String string = "I am %s. I know %s become Leader of Class %d.\n";
            System.out.printf(string, getName(), klass.getLeader().getName(), klass.getNumber());
        }
    }


    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        classes.forEach(kc -> kc.addObserver(this));
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public List<Number> getKlassNumbers() {
        return this.getClasses().parallelStream().
                map(Klass::getNumber).
                collect(toList());
    }

    public String introduce() {
        if (this.getClasses() != null) {
            List<Number> klassNumbers = getKlassNumbers();
            String numbers = klassNumbers.toString();
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach Class %s.", getName(), getAge(), numbers.substring(1, numbers.length() - 1));
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach No Class.", getName(), getAge());
        }
    }

    public boolean isTeaching(Student student) {
        List<Number> klassNumbers = getKlassNumbers();
        return klassNumbers.contains(student.getKlass().getNumber());
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach %s.", getName(), getAge(), student.getName());
        } else {
            return String.format("My name is %s. I am %s years old. I am a Teacher. I don't teach %s.", getName(), getAge(), student.getName());
        }
    }
}