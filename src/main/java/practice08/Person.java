package practice08;

import java.util.Objects;

public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int myId, String myName, int myAge) {
        id = myId;
        name = myName;
        age = myAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

// 自己 -> 父类 -> 默认
// klass 和 Student 的关系有点**