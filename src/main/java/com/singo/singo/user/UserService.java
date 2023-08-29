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


}
