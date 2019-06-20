package practice12;

public class Manager implements Observer<User> {

    private String name;

    public Manager(String name) {
        this.name = name;
    }

    @Override
    public void update(User object) {
        System.out.println(String.format("Manager: %s, User: %s", this.name, object.getUsername()));
    }
}
