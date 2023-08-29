package com.singo.singo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDataAccess {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDataAccess(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    //add new user
    void insertUser(User user){
        String sql = "INSERT INTO USERS (first_name,last_name,email,password,role)"+
                     "VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword(),user.getRole());
    }


}
