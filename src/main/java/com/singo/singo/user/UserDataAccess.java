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

    List<User> selectAllUsers() {
        String sql = "" +
                "SELECT " +
                "user_id, " +
                " first_name, " +
                " last_name, " +
                " email " +
                "FROM users";

        return jdbcTemplate.query(sql, mapUserFromDb());
    }

    private RowMapper<User> mapUserFromDb() {
        return (resultSet, i) -> {
            int id = resultSet.getInt("user_id");
            String firstName = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String email = resultSet.getString("email");
            return new User(
                    id,
                    firstName,
                    lastName,
                    email
            );
        };
    }
    
}
