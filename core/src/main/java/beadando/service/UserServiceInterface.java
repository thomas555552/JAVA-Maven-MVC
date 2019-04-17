package beadando.service;

import beadando.modell.User;
import java.util.List;

public interface UserServiceInterface {

    List<User> findAll();

    User findByUsername (String username);

    void add(User user);


}
