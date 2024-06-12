package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Glycemie;

import com.diabete.diabete.Services.GlycemieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Glycemies {
    @Autowired
    GlycemieServiceImpl glycemieServiceImpl;
    @RequestMapping("/")
    public String show(Model model){
        model.addAttribute("Glycemie",new Glycemie());
        model.addAttribute("Glycemies",glycemieServiceImpl.ShowGlycemie());
        return "Glycemie";
    }
    @RequestMapping("/Add")
    public String Add(@ModelAttribute Glycemie glycemie){
       glycemieServiceImpl.AddGlycemie(glycemie);
        return "redirect:/";
    }


}
