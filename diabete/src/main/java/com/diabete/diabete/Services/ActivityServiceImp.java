package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Activity;
import com.diabete.diabete.Models.Glycemie;
import com.diabete.diabete.Repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ActivityServiceImp implements ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    @Override
    public ArrayList<Activity> ShowActivity() {

        return (ArrayList<Activity>) activityRepository.findAll();
    }
}