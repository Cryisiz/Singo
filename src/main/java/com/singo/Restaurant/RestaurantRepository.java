package com.singo.Restaurant;

import java.util.List;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class RestaurantRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    //Insert
    public void insertRestaurant(RestaurantModel restaurant){
        String sql = "INSERT INTO RESTAURANTS(restaurant_name,restaurant_type,restaurant_location,restaurant_price,restaurant_image)"+
                    "VALUES(?,?,?,?,?)";
                    jdbcTemplate.update(sql,restaurant.getRestaurantName(),restaurant.getRestaurantType(),restaurant.getRestaurantLocation(),
                    restaurant.getRestaurantPrice(),restaurant.getRestaurantImage());
    };

    //GetAll
    public List<RestaurantModel> selectAllRestaurant() {String sql = "SELECT * FROM RESTAURANTS";
        return jdbcTemplate.query(sql, mapRestaurant());
    }

    //GetImage
      public List<RestaurantModel> findRestaurantImage(String name){
        String sql = "SELECT * FROM RESTAURANTS where restaurant_name = ?";
        return jdbcTemplate.query(sql,mapRestaurant(),name);
    }

    //Mapper
    private RowMapper<RestaurantModel> mapRestaurant() {
        return (resultSet, i) -> {
            int restaurantId = resultSet.getInt("restaurant_id");
            String restaurantName = resultSet.getString("restaurant_name");
            String restaurantType = resultSet.getString("restaurant_type");
            String restaurantLocation = resultSet.getString("restaurant_location");
            String restaurantPrice = resultSet.getString("restaurant_price");
            byte[] restaurantImage = resultSet.getBytes("restaurant_image");
            return new RestaurantModel(restaurantId,restaurantName, restaurantType, restaurantLocation, restaurantPrice,restaurantImage);
        };
    }
}
