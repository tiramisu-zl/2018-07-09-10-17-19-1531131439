package practice03;

public class Worker extends Person{

    public Worker(String myName, int myAge) {
        super(myName, myAge);
    }


    public String introduce() {
        return String.format("I am a Worker. I have a job.");
    }
}
