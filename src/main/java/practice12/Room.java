package practice12;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Manager> managers = new ArrayList<>();

    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        this.users.add(user);
        this.managers.forEach(manager -> manager.update(user));

    }

    public void addManager(Manager manager) {
        this.managers.add(manager);
    }

    public static void main(String[] args) {
        Room room = new Room();
        room.addManager(new Manager("Manager1"));
        room.addManager(new Manager("Manager2"));

        room.addUser(new User("User1"));
        room.addUser(new User("User2"));
    }
}
