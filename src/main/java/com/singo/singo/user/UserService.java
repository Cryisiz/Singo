package com.singo.singo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    private final UserDataAccess userDataAccess;

    @Autowired
    public UserService(UserDataAccess userDataAccess) {
        this.userDataAccess = userDataAccess;
    }
    
    //add new user
    void addNewUser(User user) {
        userDataAccess.insertUser(user);
    }
    
    //check login
    boolean checkLogin(User user) {
        User userInfo = userDataAccess.getUser(user.getEmail());
        return(userInfo.getPassword().equals(user.getPassword()) && userInfo.getRole().equals(user.getRole()));
    }
}
