package com.singo.Itinerary;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.singo.Day.DayService;

@Service
public class ItineraryService {

    @Autowired
    private ItineraryRepository itineraryRepository;
    @Autowired
    private DayService dayService;

    //add Itinerary
    public void addItinerary(ItineraryModel itinerary){
        itineraryRepository.insertItinerary(itinerary);
        List<ItineraryModel> modelList = itineraryRepository.getInsertedItinerary(itinerary.getItineraryEmail());
        LocalDate startDate = modelList.get(0).getItineraryStart().toLocalDate();
        LocalDate endDate = modelList.get(0).getItineraryEnd().toLocalDate();
        List<LocalDate> listOfDates = startDate.datesUntil(endDate).collect(Collectors.toList());
        for (int i = 0; i < listOfDates.size();i++){
            dayService.addDay(i+1,Date.valueOf(listOfDates.get(i)),modelList.get(0).getItineraryId());
        }
    }

    //update Itinerary
    public void updateItinerary(ItineraryModel itinerary){
        List<ItineraryModel> modelList = itineraryRepository.getItinerary(itinerary.getItineraryId());
        ItineraryModel model  = modelList.get(0);
        LocalDate startDate = model.getItineraryStart().toLocalDate();
        LocalDate endDate = model.getItineraryEnd().toLocalDate();
        List<LocalDate> listOfDates = startDate.datesUntil(endDate).collect(Collectors.toList());
        LocalDate startDate1 = itinerary.getItineraryStart().toLocalDate();
        LocalDate endDate1 = itinerary.getItineraryEnd().toLocalDate();
        List<LocalDate> listOfDates1 = startDate1.datesUntil(endDate1).collect(Collectors.toList());
        if(listOfDates.size() > listOfDates1.size()){
            for (int i = 0; i < listOfDates1.size();i++){
                dayService.updateDay(i+1,Date.valueOf(listOfDates1.get(i)),itinerary.getItineraryId());
            }   
            for(int i = listOfDates1.size();i<listOfDates.size();i++){
                dayService.deleteDay(i+1,itinerary.getItineraryId());
            }
        }else if(listOfDates.size() < listOfDates1.size()){
            for (int i = 0; i < listOfDates.size();i++){
                dayService.updateDay(i+1,Date.valueOf(listOfDates1.get(i)),itinerary.getItineraryId());
            }
            for(int i = listOfDates.size();i<listOfDates1.size();i++){
                dayService.addDay(i+1,Date.valueOf(listOfDates1.get(i)),itinerary.getItineraryId());
            }
        }else if(listOfDates1.size() == listOfDates.size()){
            for (int i = 0; i < listOfDates.size();i++){
                dayService.updateDay(i+1,Date.valueOf(listOfDates1.get(i)),itinerary.getItineraryId());
            }
        }
        itineraryRepository.updateItinerary(itinerary);
    }

    //Delete Itinerary
    public void deleteItinerary(int itineraryId){
        itineraryRepository.deleteItinerary(itineraryId);

    }

    //get All Itinerary
    public List<ItineraryModel> getAllItinerary(String itineraryEmail){
        return itineraryRepository.selectAllItinerary(itineraryEmail);
    }

    //add user
    public void addUser(int itineraryId,String addUserEmail){
        List<ItineraryModel> modelList = itineraryRepository.getItinerary(itineraryId);
        ItineraryModel model  = modelList.get(0);
        String email = model.getItineraryEmail() + "," + addUserEmail;
        model.setItineraryEmail(email);
        itineraryRepository.updateItinerary(model);
    }
    
}
