package com.ifr.informationformregistration.repository;

import com.ifr.informationformregistration.POJO.UserInformation;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<UserInformation> users = new ArrayList<>();

    public List<UserInformation> getUsers() {
        return users;
    }
    
    public UserInformation getUser(int index) {
        return users.get(index);
    }
    
    public void saveUser(UserInformation user) {
        users.add(user);
    }
    
    public void updateUser(int index, UserInformation user) {
        users.set(index, user);
    }
    
    public void deleteUser(int index) {
        users.remove(index);
    }

}
