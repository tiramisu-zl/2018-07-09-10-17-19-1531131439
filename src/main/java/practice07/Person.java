package practice07;

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

    public String introduce() {
        return String.format("My name is %s. I am %s years old.", name, age);
    }
}

