package com.singo.Hotel;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    //add Hotel
    public void addHotelFile(HotelModel hotel,MultipartFile file)throws IOException{

        //covert file to bytearr
        byte[] image = file.getBytes();
        hotel.setHotelImage(image);
        hotelRepository.insertHotel(hotel);
    }

    //getAllHotel
    public Stream<HotelModel> getAllHotel(){
        return hotelRepository.selectAllHotel().stream();
    }

    //Get HotelImage data
    public byte[] getHotelImage(String name) {
        List<HotelModel> hotel = hotelRepository.findHotelImage(name);
        return hotel.get(0).getHotelImage();
      }
    
}
