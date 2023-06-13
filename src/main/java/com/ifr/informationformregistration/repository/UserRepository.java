package com.ifr.informationformregistration.repository;

import com.ifr.informationformregistration.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }
    
    public User getUser(int index) {
        return users.get(index);
    }
    
    public void saveUser(User user) {
        users.add(user);
    }
    
    public void updateUser(int index, User user) {
        users.set(index, user);
    }
    
    public void deleteUser(int index) {
        users.remove(index);
    }

}
