package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Conseils;
import com.diabete.diabete.Services.ConseilsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Conseil {
@Autowired
    private ConseilsServiceImpl conseils;


@GetMapping("/conseils")
public String Listconseils(Model model){
    List<Conseils> TheConseils = conseils.getConseils();
    model.addAttribute("conseils", TheConseils);
    return "conseils";
}




}

