package com.singo.Account.Day;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DayService {

    @Autowired
    private DayRepository dayRepository;

    //add Day
    public void addDay(int dayName,Date dayDate,int itineraryId){
        dayRepository.insertDay(dayName,dayDate,itineraryId);
    }

    //getAll Day
    public List<DayModel> getAllDay(int dayItineraryId){
        return dayRepository.selectAllDay(dayItineraryId);
    }
}
