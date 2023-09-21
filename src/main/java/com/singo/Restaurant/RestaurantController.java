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
    @RequestParam("restaurantImage") MultipartFile file,@RequestParam("restaurantAddress") String restaurantAddress,
    @RequestParam("restaurantDescription")String restaurantDescription,@RequestParam("restaurantPhone") String restaurantPhone,
    @RequestParam("restaurantHours") String restaurantHours) throws IOException{
           RestaurantModel restaurant = new RestaurantModel(restaurantName,restaurantType,restaurantLocation,restaurantPrice,
           restaurantAddress,restaurantDescription,restaurantPhone,restaurantHours);
        restaurantService.addRestaurantFile(restaurant,file);
    }

        //Update Restaurant
    @PostMapping("/update")
    public void updateRestaurantFile(  @RequestParam("restaurantId")String restaurantId,@RequestParam("restaurantName")String restaurantName,@RequestParam("restaurantType") String restaurantType, 
    @RequestParam("restaurantLocation")String restaurantLocation, @RequestParam("restaurantPrice")String restaurantPrice,
    @RequestParam("restaurantImage") MultipartFile file,@RequestParam("restaurantAddress") String restaurantAddress,
    @RequestParam("restaurantDescription")String restaurantDescription,@RequestParam("restaurantPhone") String restaurantPhone,
    @RequestParam("restaurantHours") String restaurantHours) throws IOException{
           RestaurantModel restaurant = new RestaurantModel(Integer.parseInt(restaurantId),restaurantName,restaurantType,restaurantLocation,restaurantPrice,
           restaurantAddress,restaurantDescription,restaurantPhone,restaurantHours);
        restaurantService.updateRestaurantFile(restaurant,file);
    }

    //Delete Restaurant
    @PostMapping("/delete")
    public void deleteActvitiesFile(@RequestParam("restaurantId")String restaurantId){
      restaurantService.deleteRestaurant(Integer.parseInt(restaurantId));
    }

    //get all Restaurant
    @GetMapping("/getAll")
    public ResponseEntity<List<RestaurantModel>> getAllRestaurant(){
        List<RestaurantModel> files = restaurantService.getAllRestaurant().map(dbFile -> {
      String fileUri = ServletUriComponentsBuilder
          .fromCurrentContextPath().path("/restaurantController/restaurantImage/").path(dbFile.getRestaurantName()).toUriString();
            return new RestaurantModel(dbFile.getRestaurantId(),dbFile.getRestaurantName(),dbFile.getRestaurantType(),dbFile.getRestaurantLocation(),
            dbFile.getRestaurantPrice(),fileUri,dbFile.getRestaurantAddress(),dbFile.getRestaurantDescription(),dbFile.getRestaurantPhone(),dbFile.getRestaurantHours());
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

      //get Restaurant
    @PostMapping("/getRestaurant")
    public ResponseEntity<List<RestaurantModel>> getRestaurant(@RequestParam("restaurantId")String restaurantId){
        List<RestaurantModel> files = restaurantService.getRestaurant(Integer.parseInt(restaurantId)).map(dbFile -> {
      String fileUri = ServletUriComponentsBuilder
          .fromCurrentContextPath().path("/restaurantController/restaurantImage/").path(dbFile.getRestaurantName()).toUriString();
            return new RestaurantModel(dbFile.getRestaurantId(),dbFile.getRestaurantName(),dbFile.getRestaurantType(),dbFile.getRestaurantLocation(),
            dbFile.getRestaurantPrice(),fileUri,dbFile.getRestaurantAddress(),dbFile.getRestaurantDescription(),dbFile.getRestaurantPhone(),dbFile.getRestaurantHours());
    }).collect(Collectors.toList());
    return ResponseEntity.status(HttpStatus.OK).body(files);
    }
}


