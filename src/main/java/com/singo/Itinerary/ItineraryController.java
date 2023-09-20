package com.singo.Itinerary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.util.List;


@RestController
@RequestMapping("/itineraryController")
@CrossOrigin
public class ItineraryController {

    @Autowired
    private ItineraryService itineraryService;

    //add Itinerary
    @PostMapping("/add")
    public void addItineraryFile( @RequestParam("itineraryName")String itineraryName,@RequestParam("itineraryStart") Date itineraryStart, 
    @RequestParam("itineraryEnd") Date itineraryEnd, @RequestParam("itineraryAdult") String itineraryAdult,
    @RequestParam("itineraryChild") String itineraryChild,@RequestParam("itineraryEmail") String itineraryEmail){
           ItineraryModel itinerary = new ItineraryModel(itineraryName,itineraryStart,itineraryEnd,
           Integer.parseInt(itineraryAdult),Integer.parseInt(itineraryChild),itineraryEmail);
           itineraryService.addItinerary(itinerary);
    }

    //update Itinerary
     @PostMapping("/update")
    public void updateItineraryFile( @RequestParam("itineraryId") String itineraryId,@RequestParam("itineraryName")String itineraryName,
    @RequestParam("itineraryStart") Date itineraryStart, @RequestParam("itineraryEnd") Date itineraryEnd, 
    @RequestParam("itineraryAdult") String itineraryAdult,@RequestParam("itineraryChild") String itineraryChild,
            @RequestParam("itineraryEmail") String itineraryEmail){
           ItineraryModel itinerary = new ItineraryModel(Integer.parseInt(itineraryId),itineraryName,itineraryStart,itineraryEnd,
           Integer.parseInt(itineraryAdult),Integer.parseInt(itineraryChild),itineraryEmail);
           itineraryService.updateItinerary(itinerary);
    }

    //add User
     @PostMapping("/addUser")
    public void addUserItinerary( @RequestParam("itineraryId") String itineraryId,@RequestParam("addUserEmail") String addUserEmail){
           itineraryService.addUser(Integer.parseInt(itineraryId),addUserEmail);
    }

    //delete Itinerary
    @PostMapping("/delete")
    public void deleteItineraryFile(@RequestParam("itineraryId")String itineraryId){
      itineraryService.deleteItinerary(Integer.parseInt(itineraryId));
    }

    //get all itinerary by user
    @PostMapping("/getAll")
    public ResponseEntity<List<ItineraryModel>> getAllItinerary(@RequestParam("itineraryEmail") String itineraryEmail){
    return ResponseEntity.status(HttpStatus.OK).body(itineraryService.getAllItinerary(itineraryEmail));
    }
}

