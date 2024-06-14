package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Conseils;
import com.diabete.diabete.Services.ConseilsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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


    @GetMapping("/advice/{valeurGlycemie}")
    public String adv(@PathVariable Integer valeurGlycemie, Model model) {

        if (valeurGlycemie <= 1) {
            List<Conseils> advices = conseils.getConseils();
            List<Conseils> filteredAdvice = advices
                    .stream()
                    .filter(conseil -> "low".equals(conseil.getStatus()))
                    .collect(Collectors.toList());
            model.addAttribute("conseils", filteredAdvice);
            System.out.println(filteredAdvice);
            return "advices";
        }
        else if(valeurGlycemie >1 && valeurGlycemie <= 2 ) {
            List<Conseils> advices = conseils.getConseils();
            List<Conseils> filteredAdvice = advices
                    .stream()
                    .filter(conseil -> "normal".equals(conseil.getStatus())) // Assuming "low" is the status you want to filter by
                    .collect(Collectors.toList());
            model.addAttribute("conseils", filteredAdvice);
            System.out.println(filteredAdvice);
            return "advices";
            // Assuming you have a view named "advices"
        }
        else if(valeurGlycemie >2  ) {List<Conseils> advices = conseils.getConseils();
            List<Conseils> filteredAdvice = advices
                    .stream()
                    .filter(conseil -> "height".equals(conseil.getStatus())) // Assuming "low" is the status you want to filter by
                    .collect(Collectors.toList());
            model.addAttribute("conseils", filteredAdvice);
            return "advices";
             }

        else {
            System.out.println("Your diabetes level is not valid");
            return "redirect:/conseil"; // Redirect to the appropriate page if the condition is not met
        }
    }







}

