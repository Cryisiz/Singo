package com.singo.Account.user;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User> {

	public User mapRow(ResultSet resultSet, int i) throws SQLException {

		User user = new User();
		user.setId(resultSet.getInt("id"));
		user.setFirstname(resultSet.getString("firstname"));
		user.setLastname(resultSet.getString("lastname"));
		user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setRole(Role.valueOf(resultSet.getString("role")));
		return user;
	}
}
