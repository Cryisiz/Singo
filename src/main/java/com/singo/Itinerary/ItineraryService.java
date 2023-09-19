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

    //update Itinery
    public void updateItinerary(ItineraryModel itinerary){
        itineraryRepository.updateItinerary(itinerary);
    }

    //get All Itinerary
    public List<ItineraryModel> getAllItinerary(String itineraryEmail){
        return itineraryRepository.selectAllItinerary(itineraryEmail);
    }
    
}
