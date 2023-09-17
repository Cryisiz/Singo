package com.singo.Hotel;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.singo.Account.user.UserMapper;

@Repository
public class HotelRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    //Insert
    public void insertHotel(HotelModel hotel){
        String sql = "INSERT INTO HOTELS(hotel_name,hotel_star,hotel_location,hotel_price,hotel_image,hotel_address,"+
                    "hotel_description,hotel_phone,hotel_hours)"+
                    "VALUES(?,?,?,?,?,?,?,?,?)";
                    jdbcTemplate.update(sql,hotel.getHotelName(),hotel.getHotelStar(),hotel.getHotelLocation(),
                    hotel.getHotelPrice(),hotel.getHotelImage(),hotel.getHotelAddress(),hotel.getHotelDescription(),
                    hotel.getHotelPhone(),hotel.getHotelHours());
    };

    //GetAll
    public List<HotelModel> selectAllHotel() {String sql = "SELECT * FROM HOTELS";
        return jdbcTemplate.query(sql, mapHotel());
    }

    //GetImage
      public List<HotelModel> findHotelImage(String name){
        String sql = "SELECT * FROM HOTELS where hotel_name = ?";
        return jdbcTemplate.query(sql,mapHotel(),name);
    }

    //Mapper
    private RowMapper<HotelModel> mapHotel() {
        return (resultSet, i) -> {
            int hotelId = resultSet.getInt("hotel_id");
            String hotelName = resultSet.getString("hotel_name");
            int hotelStar = resultSet.getInt("hotel_star");
            String hotelLocation = resultSet.getString("hotel_location");
            int hotelPrice = resultSet.getInt("hotel_price");
            byte[] hotelImage = resultSet.getBytes("hotel_image");
            String hotelAddress = resultSet.getString("hotel_address");
            String hotelDescription = resultSet.getString("hotel_description");
            String hotelPhone = resultSet.getString("hotel_phone");
            String hotelHours = resultSet.getString("hotel_hours");
            return new HotelModel(hotelId,hotelName, hotelStar, hotelLocation, hotelPrice,hotelImage,
                                    hotelAddress,hotelDescription,hotelPhone,hotelHours);
        };
    }
}