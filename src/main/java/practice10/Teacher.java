package practice10;

import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Teacher extends Person{
    private LinkedList<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public List<Number> getKlassNumbers() {
        return  this.getClasses().parallelStream().
                map(Klass::getNumber).
                collect(toList());
    }
    public String introduce() {
        if (this.getClasses() != null) {
            List<Number> klassNumbers = getKlassNumbers();
//            String joinedString = Arrays.stream(klassNumbers.toArray())
//                .collect(joining());
            String numbers = klassNumbers.toString();
            return String.format("My name is %s. I am %s years old. I am a Teacher. I teach Class %s.", getName(), getAge(), numbers.substring(1, numbers.length()-1));
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