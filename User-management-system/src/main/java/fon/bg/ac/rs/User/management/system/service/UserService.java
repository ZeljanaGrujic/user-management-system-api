package fon.bg.ac.rs.User.management.system.service;

import fon.bg.ac.rs.User.management.system.model.User;

import java.util.List;

public interface UserService {



    User saveUser(User user);

    List<User> getAllUsers();

    User getUserById(Long id);

    boolean deleteUser(Long id);


    User updateUser(Long id, User user);
}
