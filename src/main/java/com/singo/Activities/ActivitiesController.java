package com.singo.Activities;

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
@RequestMapping("/activitiesController")
@CrossOrigin
public class ActivitiesController {

    @Autowired
    private ActivitiesService activitiesService;

    //add Activities
    @PostMapping("/add")
    public void addActivitiesFile( @RequestParam("activitiesName")String activitiesName,@RequestParam("activitiesType") String activitiesType, 
    @RequestParam("activitiesLocation")String activitiesLocation, @RequestParam("activitiesPrice")String activitiesPrice,
    @RequestParam("activitiesImage") MultipartFile file,@RequestParam("activitiesAddress") String activitiesAddress,
    @RequestParam("activitiesDescription")String activitiesDescription,@RequestParam("activitiesPhone") String activitiesPhone,
    @RequestParam("activitiesHours") String activitiesHours) throws IOException{
           ActivitiesModel activities = new ActivitiesModel(activitiesName,activitiesType,activitiesLocation,Integer.parseInt(activitiesPrice),
           activitiesAddress,activitiesDescription,activitiesPhone,activitiesHours);
        activitiesService.addActivitiesFile(activities,file);
    }

        //Update Activities
    @PostMapping("/update")
    public void updateActivitiesFile(  @RequestParam("activitiesId")String activitiesId,@RequestParam("activitiesName")String activitiesName,@RequestParam("activitiesType") String activitiesType, 
    @RequestParam("activitiesLocation")String activitiesLocation, @RequestParam("activitiesPrice")String activitiesPrice,
    @RequestParam("activitiesImage") MultipartFile file,@RequestParam("activitiesAddress") String activitiesAddress,
    @RequestParam("activitiesDescription")String activitiesDescription,@RequestParam("activitiesPhone") String activitiesPhone,
    @RequestParam("activitiesHours") String activitiesHours) throws IOException{
           ActivitiesModel activities = new ActivitiesModel(Integer.parseInt(activitiesId),activitiesName,activitiesType,activitiesLocation,Integer.parseInt(activitiesPrice),
           activitiesAddress,activitiesDescription,activitiesPhone,activitiesHours);
        activitiesService.updateActivitiesFile(activities,file);
    }

    //get all Activities
    @GetMapping("/getAll")
    public ResponseEntity<List<ActivitiesModel>> getAllActivities(){
        List<ActivitiesModel> files = activitiesService.getAllActivities().map(dbFile -> {
      String fileUri = ServletUriComponentsBuilder
          .fromCurrentContextPath().path("/activitiesController/activitiesImage/").path(dbFile.getActivitiesName()).toUriString();
            return new ActivitiesModel(dbFile.getActivitiesId(),dbFile.getActivitiesName(),dbFile.getActivitiesType(),dbFile.getActivitiesLocation(),
            dbFile.getActivitiesPrice(),fileUri,dbFile.getActivitiesAddress(),dbFile.getActivitiesDescription(),dbFile.getActivitiesPhone(),dbFile.getActivitiesHours());
    }).collect(Collectors.toList());
    return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    //getImage
    @GetMapping("/activitiesImage/{name}")
  public ResponseEntity<byte[]> getFile(@PathVariable String name) {
    byte[] data = activitiesService.getActivitiesImage(name);
    return ResponseEntity.ok()
        .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=\"" + name + "\"")
        .body(data);
  }
}

