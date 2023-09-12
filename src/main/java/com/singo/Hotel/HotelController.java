package com.singo.Hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/hotelController")
@CrossOrigin
public class HotelController {

    @Autowired
    private HotelService hotelService;

    //add Hotel
    @PostMapping("/add")
    public void addHotelFile( @RequestParam("hotelName")String hotelName,@RequestParam("hotelStar") int hotelStar, 
    @RequestParam("hotelLocation")String hotelLocation, @RequestParam("hotelPrice")String hotelPrice,
    @RequestParam("hotelImage") MultipartFile file) throws IOException{
           HotelModel hotel = new HotelModel(hotelName,hotelStar,hotelLocation,Integer.parseInt(hotelPrice));
        hotelService.addHotelFile(hotel,file);
    }

    //get all Hotel
    @GetMapping("/getAll")
    public ResponseEntity<List<HotelModel>> getAllHotel(){
        List<HotelModel> files = hotelService.getAllHotel().map(dbFile -> {
      String fileUri = ServletUriComponentsBuilder
          .fromCurrentContextPath().path("/hotelController/hotelImage/").path(dbFile.getHotelName()).toUriString();
            return new HotelModel(dbFile.getHotelId(),dbFile.getHotelName(),dbFile.getHotelStar(),dbFile.getHotelLocation(),
            dbFile.getHotelPrice(),fileUri);
    }).collect(Collectors.toList());
    return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    //getImage
    @GetMapping("/hotelImage/{name}")
  public ResponseEntity<byte[]> getFile(@PathVariable String name) {
    byte[] data = hotelService.getHotelImage(name);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + name + "\"")
        .body(data);
  }
}

