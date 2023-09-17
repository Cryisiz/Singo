package com.singo.Restaurant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.HttpHeaders;

@RestController
@RequestMapping("/restaurantController")
@CrossOrigin
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    //add Restaurant
    @PostMapping("/add")
    public void addRestaurantFile( @RequestParam("restaurantName")String restaurantName,@RequestParam("restaurantType") String restaurantType, 
    @RequestParam("restaurantLocation")String restaurantLocation, @RequestParam("restaurantPrice")String restaurantPrice,
    @RequestParam("restaurantImage") MultipartFile file) throws IOException{
           RestaurantModel restaurant = new RestaurantModel(restaurantName,restaurantType,restaurantLocation,restaurantPrice);
        restaurantService.addRestaurantFile(restaurant,file);
    }

    //get all Restaurant
    @GetMapping("/getAll")
    public ResponseEntity<List<RestaurantModel>> getAllRestaurant(){
        List<RestaurantModel> files = restaurantService.getAllRestaurant().map(dbFile -> {
      String fileUri = ServletUriComponentsBuilder
          .fromCurrentContextPath().path("/restaurantController/restaurantImage/").path(dbFile.getRestaurantName()).toUriString();
            return new RestaurantModel(dbFile.getRestaurantId(),dbFile.getRestaurantName(),dbFile.getRestaurantType(),dbFile.getRestaurantLocation(),
            dbFile.getRestaurantPrice(),fileUri);
    }).collect(Collectors.toList());
    return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    //getImage
    @GetMapping("/restaurantImage/{name}")
  public ResponseEntity<byte[]> getFile(@PathVariable String name) {
    byte[] data = restaurantService.getRestaurantImage(name);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + name + "\"")
        .body(data);
  }
}


