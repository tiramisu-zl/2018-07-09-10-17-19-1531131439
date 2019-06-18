package practice01;

public class Person {
    private String name;
    private Number age;

    public Person(String myName, Number myAge) {
        name = myName;
        age = myAge;
    }

    public String getName() { return name; }
    public Number getAge() { return age; }

    public String introduce() {
//        return "My name is " + name + ". I am " + age + " years old.";
        return String.format("My name is %s. I am %s years old.", name, age);
    }
}
