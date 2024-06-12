package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Repas;
import com.diabete.diabete.Services.RepasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class Recepies {
   @Autowired
   private RepasService repasService;
    @GetMapping ("/Repas")
    public String Repas(Model model) {

        model.addAttribute("repas",new Repas());
        List<Repas> listrepas=repasService.getAllRepas();
        model.addAttribute("listeRepas",listrepas );
        return "Repashtml";




}
