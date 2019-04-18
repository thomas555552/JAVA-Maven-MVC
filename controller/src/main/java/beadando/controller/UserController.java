package beadando.controller;

import beadando.modell.User;
import beadando.service.UserServiceInterface;

import java.util.List;

public class UserController {

    private UserServiceInterface userServiceInterface;

    public UserController(UserServiceInterface userServiceInterface)
    {
        this.userServiceInterface = userServiceInterface;
    }

   public List<User> getAllUsers(){
        return userServiceInterface.getAllUsers();
   }

   public User findByUsername(String username){
        return userServiceInterface.findByUsername(username);
   }

   public void add(User user){
        userServiceInterface.add(user);
   }


}
