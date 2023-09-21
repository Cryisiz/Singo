package com.singo.Activities;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ActivitiesService {

    @Autowired
    private ActivitiesRepository activitiesRepository;

    //add Activities
    public void addActivitiesFile(ActivitiesModel activities,MultipartFile file)throws IOException{

        //covert file to bytearr
        byte[] image = file.getBytes();
        activities.setActivitiesImage(image);
        activitiesRepository.insertActivities(activities);
    }

    //update Activities
    public void updateActivitiesFile(ActivitiesModel activities,MultipartFile file)throws IOException{

        //covert file to bytearr
        byte[] image = file.getBytes();
        activities.setActivitiesImage(image);
        activitiesRepository.updateActivities(activities);
    }

    //Delete Activites
    public void deleteActivities(int activitiesId){
        activitiesRepository.deleteActivities(activitiesId);
    }

    //getAllActivities
    public Stream<ActivitiesModel> getAllActivities(){
        return activitiesRepository.selectAllActivities().stream();
    }

    //getActivities
    public Stream<ActivitiesModel> getActivities(int activitiesId){
        return activitiesRepository.selectActivities(activitiesId).stream();
    }

    //Get ActivitiesImage data
    public byte[] getActivitiesImage(String name) {
        List<ActivitiesModel> activities = activitiesRepository.findActivitiesImage(name);
        return activities.get(0).getActivitiesImage();
      }
    
}
