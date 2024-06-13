package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Activity;
import com.diabete.diabete.Repository.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityService {

    @Autowired
    ActivityRepository activityRepository;

    public List<Activity> ShowActivity() {
        return  activityRepository.findAll();
    }
}