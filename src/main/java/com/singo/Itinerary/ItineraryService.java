package com.singo.Itinerary;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItineraryService {

    @Autowired
    private ItineraryRepository itineraryRepository;

    //add Itinerary
    public void addItinerary(ItineraryModel itinerary){
        itineraryRepository.insertItinerary(itinerary);
    }

    //update Itinerary
    public void updateItinerary(ItineraryModel itinerary){
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
