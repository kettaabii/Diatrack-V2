package com.diabete.diabete.Controllers;

import com.diabete.diabete.Services.ActivityService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Activity {

    @Autowired
    ActivityService activityService;
    @RequestMapping("/Activity")
    public String show(Model model){
        model.addAttribute("Activity",new Activity());
        model.addAttribute("Activitys",activityService.ShowActivity());
        return "ActivityHome";
    }
}
