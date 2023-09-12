package com.singo.Activities;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ActivitiesRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;

    //Insert
    public void insertActivities(ActivitiesModel activities){
        String sql = "INSERT INTO ACTIVITIES(activities_name,activities_type,activities_location,activities_price,activities_image)"+
                    "VALUES(?,?,?,?,?)";
                    jdbcTemplate.update(sql,activities.getActivitiesName(),activities.getActivitiesType(),activities.getActivitiesLocation(),
                    activities.getActivitiesPrice(),activities.getActivitiesImage());
    };

    //GetAll
    public List<ActivitiesModel> selectAllActivities() {String sql = "SELECT * FROM ACTIVITIES";
        return jdbcTemplate.query(sql, mapActivities());
    }

    //GetImage
      public List<ActivitiesModel> findActivitiesImage(String name){
        String sql = "SELECT * FROM ACTIVITIES where activities_name = ?";
        return jdbcTemplate.query(sql,mapActivities(),name);
    }

    //Mapper
    private RowMapper<ActivitiesModel> mapActivities() {
        return (resultSet, i) -> {
            int activitiesId = resultSet.getInt("activities_id");
            String activitiesName = resultSet.getString("activities_name");
            String activitiesType = resultSet.getString("activities_type");
            String activitiesLocation = resultSet.getString("activities_location");
            int activitiesPrice = resultSet.getInt("activities_price");
            byte[] activitiesImage = resultSet.getBytes("activities_image");
            return new ActivitiesModel(activitiesId,activitiesName, activitiesType, activitiesLocation, activitiesPrice,activitiesImage);
        };
    }
}