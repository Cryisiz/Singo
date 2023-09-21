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
        String sql = "INSERT INTO RESTAURANTS(restaurant_name,restaurant_type,restaurant_location,restaurant_price,"+
                    "restaurant_image,restaurant_address,restaurant_description,restaurant_phone,restaurant_hours)"+
                    "VALUES(?,?,?,?,?,?,?,?,?)";
                    jdbcTemplate.update(sql,restaurant.getRestaurantName(),restaurant.getRestaurantType(),restaurant.getRestaurantLocation(),
                    restaurant.getRestaurantPrice(),restaurant.getRestaurantImage(),restaurant.getRestaurantAddress(),
                    restaurant.getRestaurantDescription(),restaurant.getRestaurantPhone(),restaurant.getRestaurantHours());
    }

    //Update
    public void updateRestaurant(RestaurantModel restaurant){
        String sql = "UPDATE RESTAURANTS SET restaurant_name=?,restaurant_type=?,restaurant_location=?,restaurant_price=?,"+
                    "restaurant_image=?,restaurant_address=?,restaurant_description=?,restaurant_phone=?,restaurant_hours=? "+
                    "WHERE restaurant_id=?";
                    jdbcTemplate.update(sql,restaurant.getRestaurantName(),restaurant.getRestaurantType(),restaurant.getRestaurantLocation(),
                    restaurant.getRestaurantPrice(),restaurant.getRestaurantImage(),restaurant.getRestaurantAddress(),
                    restaurant.getRestaurantDescription(),restaurant.getRestaurantPhone(),restaurant.getRestaurantHours(),restaurant.getRestaurantId());
    }

    //Delete
    public void deleteRestaurant(int restaurantId){
        String sql = "DELETE FROM RESTAURANTS WHERE restaurant_id = ?";
        jdbcTemplate.update(sql,restaurantId);
    }

    //GetAll
    public List<RestaurantModel> selectAllRestaurant() 
    {String sql = "SELECT * FROM RESTAURANTS";
        return jdbcTemplate.query(sql, mapRestaurant());
    }

    //GetImage
      public List<RestaurantModel> findRestaurantImage(String name){
        String sql = "SELECT * FROM RESTAURANTS where restaurant_name = ?";
        return jdbcTemplate.query(sql,mapRestaurant(),name);
    }

    //Get Restaurant
    public List<RestaurantModel> selectRestaurant(int restaurantId)
     {String sql = "SELECT * FROM RESTAURANTS WHERE restaurant_id = ?";
        return jdbcTemplate.query(sql, mapRestaurant(),restaurantId);
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
            String restaurantAddress = resultSet.getString("restaurant_address");
            String restaurantDescription = resultSet.getString("restaurant_Description");
            String restaurantPhone = resultSet.getString("restaurant_Phone");
            String restaurantHours = resultSet.getString("restaurant_hours");
            return new RestaurantModel(restaurantId,restaurantName, restaurantType, restaurantLocation, restaurantPrice,
            restaurantImage,restaurantAddress,restaurantDescription,restaurantPhone,restaurantHours);
        };
    }
}
