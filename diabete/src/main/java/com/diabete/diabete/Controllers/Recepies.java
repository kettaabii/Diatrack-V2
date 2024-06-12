package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Repas;
import com.diabete.diabete.Services.RepasService;
import com.diabete.diabete.Services.RepasServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Recepies {
    @Autowired
    RepasService repasService;
    @GetMapping ("/Repas")
    public String Repas(Model model) {
        List<Repas> repas=repasService.getAllRepas();
        model.addAttribute("listeRepas",repas );
        return "";

    }



}
