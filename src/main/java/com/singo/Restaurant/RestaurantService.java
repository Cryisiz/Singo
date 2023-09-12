package com.singo.Restaurant;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    //add Restaurant
    public void addRestaurantFile(RestaurantModel restaurant,MultipartFile file)throws IOException{

        //covert file to bytearr
        byte[] image = file.getBytes();
        restaurant.setRestaurantImage(image);
        restaurantRepository.insertRestaurant(restaurant);
    }

    //getAllRestaurant
    public Stream<RestaurantModel> getAllRestaurant(){
        return restaurantRepository.selectAllRestaurant().stream();
    }

    //Get RestaurantImage data
    public byte[] getRestaurantImage(String name) {
        List<RestaurantModel> restaurant = restaurantRepository.findRestaurantImage(name);
        return restaurant.get(0).getRestaurantImage();
      }
    
}
