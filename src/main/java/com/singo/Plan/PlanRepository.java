package com.singo.Plan;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PlanRepository {
    @Autowired
    private  JdbcTemplate jdbcTemplate;

    //get inserted row
    public List<PlanModel> getAllPlan(int planDayId){
        String sql = "SELECT * FROM Plan WHERE plan_dayid = ? "+
                    "Order by plan_name";
        return jdbcTemplate.query(sql,mapPlan(),planDayId);
    }

    //Insert
    public void insertPlan(int planName,String planType,int planEventId,int planDayId){
        String sql = "INSERT INTO Plan(plan_name,plan_type,plan_eventid,plan_dayid)"+
                    "VALUES(?,?,?,?)";
                    jdbcTemplate.update(sql,planName,planType,planEventId,planDayId);
    }

    //Update plan
    public void updatePlan(String planType,int planEventId,int planId){
        String sql = "UPDATE PLAN SET plan_type=?,plan_eventid=? WHERE plan_id=?";
                    jdbcTemplate.update(sql,planType,planEventId,planId);
    }
    //Delete
    public void deletePlan(int planId){
        String sql = "DELETE FROM PLAN WHERE plan_id = ?";
        jdbcTemplate.update(sql,planId);
    }

    //Mapper
    private RowMapper<PlanModel> mapPlan() {
        return (resultSet, i) -> {
            int planId = resultSet.getInt("plan_id");
            int planName = resultSet.getInt("plan_name");
            String planType = resultSet.getString("plan_type");
            int planEventId = resultSet.getInt("plan_eventid");
            int planDayId = resultSet.getInt("plan_dayid");
            return new PlanModel(planId,planName, planType, planEventId,planDayId);
        };
    }
}
