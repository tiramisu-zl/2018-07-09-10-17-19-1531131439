package practice04;

public class Worker extends Person{
    public Worker(String myName, int myAge) {
        super(myName, myAge);
    }


    public String introduce() {
        return String.format("My name is %s. I am %s years old. I am a Worker. I have a job.", getName(), getAge());
    }
}
