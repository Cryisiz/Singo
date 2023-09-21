package com.singo.Day;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping("/dayController")
@CrossOrigin
public class DayController {

    @Autowired
    private DayService dayService;

    //get all day by itineary id
    @PostMapping("/getAll")
    public ResponseEntity<List<DayModel>> getAllDay(@RequestParam("dayItineraryId") String dayItineraryId){
    return ResponseEntity.status(HttpStatus.OK).body(dayService.getAllDay(Integer.parseInt(dayItineraryId)));
    }

        //get day
    @PostMapping("/getDay")
    public ResponseEntity<DayModel> getDay(@RequestParam("dayId") String dayId){
    return ResponseEntity.status(HttpStatus.OK).body(dayService.getDay(Integer.parseInt(dayId)));
    }

    // add hotel
    @PostMapping("/addHotel")
    public void addDayHotel( @RequestParam("dayId")String dayId,@RequestParam("hotelId") String hotelId){
           dayService.addDayHotel(Integer.parseInt(dayId),Integer.parseInt(hotelId));
    }

    // delete hotel 
    @PostMapping("/deleteHotel")
    public void deleteDayHotel( @RequestParam("dayId")String dayId){
           dayService.deleteDayHotel(Integer.parseInt(dayId));
    }
}
