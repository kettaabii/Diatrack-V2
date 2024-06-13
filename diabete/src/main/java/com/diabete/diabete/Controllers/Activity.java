package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Glycemie;
import com.diabete.diabete.Services.ActivityServiceImp;
import com.diabete.diabete.Services.GlycemieServiceImpl;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Activity {

    @Autowired
    ActivityServiceImp activityServiceImp;
    @RequestMapping("/")
    public String show(Model model){
        model.addAttribute("Activity",new Activity());
        model.addAttribute("Activitys",activityServiceImp.ShowActivity());
        return "Activity";
    }
}
