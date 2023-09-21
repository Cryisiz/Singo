package com.singo.Day;

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

    //getDay
    public DayModel getDay(int dayId){
        List<DayModel> modelList = dayRepository.selectDay(dayId);
        return modelList.get(0);
    }

    //add Hotel
    public void addDayHotel(int dayId,int hotelId){
        dayRepository.updateDayHotel(dayId,hotelId);
    }

    //delete Hotel
    public void deleteDayHotel(int dayId){
        dayRepository.deleteDayHotel(dayId);
    }

    //update Day
    public void updateDay(int dayName,Date dayDate,int itineraryId){
        dayRepository.updateDay(dayName,dayDate,itineraryId);
    }

    //update Day
    public void deleteDay(int dayName,int itineraryId){
        dayRepository.deleteDay(dayName,itineraryId);
    }
}
