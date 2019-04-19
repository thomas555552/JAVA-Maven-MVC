package beadando.service;

import beadando.modell.User;

import java.util.ArrayList;
import java.util.List;

public class UserService implements UserServiceInterface {

    List<User> users= new ArrayList<User>();


    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User findByUsername(String username) {
        for(User user:users) {
            if (user.getName().equals(username))
                return user;
        }
        return null;
    }

    @Override
    public void add(String name, String address, int age) {
        User user= new User(name,address,age);
        users.add(user);

    }
}
