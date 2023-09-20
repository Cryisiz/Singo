package com.singo.Account.Day;

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

    
    //Mapper
    private RowMapper<DayModel> mapDay() {
        return (resultSet, i) -> {
            int dayId = resultSet.getInt("day_id");
            int dayName = resultSet.getInt("day_name");
            Date dayDate = resultSet.getDate("day_date");
            int dayItineraryId = resultSet.getInt("day_itineraryid");
            return new DayModel(dayId,dayName,dayDate,dayItineraryId);
        };
    }
}
