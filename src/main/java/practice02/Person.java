package practice02;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String myName, int myAge) {
        name = myName;
        age = myAge;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }
}

// 构造器，如果没有定义构造器，会有默认的，如果只有自定义构造器就不能直接调用默认构造器
// 自动生成construtor, getter, setter, toString, equals
// 对象类型允许为null, 基础类型不允许