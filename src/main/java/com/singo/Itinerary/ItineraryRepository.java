package com.singo.Itinerary;

import java.sql.Date;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class ItineraryRepository {
    @Autowired
    private  JdbcTemplate jdbcTemplate;

    //Insert
    public void insertItinerary(ItineraryModel itinerary){
        String sql = "INSERT INTO ITINERARY(itinerary_name,itinerary_start,itinerary_end,itinerary_adult,"+
                    "itinerary_child,itinerary_email)"+
                    "VALUES(?,?,?,?,?,?)";
                    jdbcTemplate.update(sql,itinerary.getItineraryName(),itinerary.getItineraryStart(),itinerary.getItineraryEnd(),
                                        itinerary.getItineraryAdult(),itinerary.getItineraryChild(),itinerary.getItineraryEmail());
    }

    public List<ItineraryModel> selectAllItinerary(String itineraryEmail){
        String sql = "SELECT * FROM ITINERARY WHERE itinerary_email = ?";
        return jdbcTemplate.query(sql,mapItinerary(),itineraryEmail);

    }

    //Mapper
    private RowMapper<ItineraryModel> mapItinerary() {
        return (resultSet, i) -> {
            int itineraryId = resultSet.getInt("itinerary_id");
            String itineraryName = resultSet.getString("itinerary_name");
            Date itineraryStart = resultSet.getDate("itinerary_start");
            Date itineraryEnd = resultSet.getDate("itinerary_end");
            int itineraryAdult = resultSet.getInt("itinerary_adult");
            int itineraryChild = resultSet.getInt("itinerary_child");
            String itineraryEmail = resultSet.getString("itinerary_email");
            return new ItineraryModel(itineraryId,itineraryName, itineraryStart, itineraryEnd, itineraryAdult,
                                itineraryChild,itineraryEmail);
        };
    }
    
}
