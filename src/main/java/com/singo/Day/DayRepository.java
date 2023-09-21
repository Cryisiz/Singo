package com.singo.Day;

import java.sql.Date;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DayRepository {
    @Autowired
    private  JdbcTemplate jdbcTemplate;

    //Insert
    public void insertDay(int dayName,Date dayDate,int itineraryId){
        String sql = "INSERT INTO DAY(day_name,day_date,day_itineraryid)"+
                    "VALUES(?,?,?)";
                    jdbcTemplate.update(sql,dayName,dayDate,itineraryId);
    }

    //get all day by itineary id
    public List<DayModel> selectAllDay(int dayItineraryId){
        String sql = "SELECT * FROM DAY WHERE day_itineraryid = ? "+
                     "Order by day_name";
        return jdbcTemplate.query(sql,mapDay(),dayItineraryId);
    }

    //get day by hotel id
    public List<DayModel> selectDay(int dayId){
        String sql = "SELECT * FROM DAY WHERE day_id = ? ";
        return jdbcTemplate.query(sql,mapDay(),dayId);
    }

    //Update hotel
    public void updateDayHotel(int dayId,int hotelId){
        String sql = "UPDATE DAY SET day_hotelid=? WHERE day_id=?";
                    jdbcTemplate.update(sql,hotelId,dayId);
    }

    //Delete hotel
    public void deleteDayHotel(int dayId){
        String sql = "UPDATE DAY SET day_hotelid=? WHERE day_id=?";
                    jdbcTemplate.update(sql,null,dayId);
    }

    
    //Mapper
    private RowMapper<DayModel> mapDay() {
        return (resultSet, i) -> {
            int dayId = resultSet.getInt("day_id");
            int dayName = resultSet.getInt("day_name");
            Date dayDate = resultSet.getDate("day_date");
            int dayItineraryId = resultSet.getInt("day_itineraryid");
            int dayHotelId = resultSet.getInt("day_hotelid");
            return new DayModel(dayId,dayName,dayDate,dayItineraryId,dayHotelId);
        };
    }
}
