package com.diabete.diabete.Controllers;

import com.diabete.diabete.Models.Glycemie;
import com.diabete.diabete.Models.Ingredient;
import com.diabete.diabete.Models.Repas;
import com.diabete.diabete.Services.GlycemieServiceImpl;
import com.diabete.diabete.Services.IngredientService;
import com.diabete.diabete.Services.RepasService;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class Recepies {
    @Autowired
    IngredientService ingredientService;
    @Autowired
    GlycemieServiceImpl glycemieServiceImpl;
    @Autowired
    private RepasService repasService;

    @RequestMapping("/Repas")
    public String Repas(Model model) {

        model.addAttribute("repas", new Repas());

        List<Repas> listrepas = repasService.findRepasByGroupeDiabete(1.1);
        model.addAttribute("listeRepas", listrepas);
        System.out.println(listrepas);

        return "Repashtml";
    }

    @RequestMapping("/tst")
    public String show(Model model) {
        model.addAttribute("repas", new Repas());
        List<Repas> listrepas = repasService.getAllRepas();
        model.addAttribute("listeRepas", listrepas);
        model.addAttribute("Glycemie", new Glycemie());
        model.addAttribute("Glycemies", glycemieServiceImpl.ShowGlycemie());
        return "testPage";
    }

    @RequestMapping("/Addtst")
    public String Add(@ModelAttribute Glycemie glycemie) {
        glycemieServiceImpl.AddGlycemie(glycemie);
        return "redirect:/testPage";

    }

    @GetMapping("/selection-ingredients")
    public String afficherPageSelectionIngredients(@RequestParam(defaultValue = "0") int page,
                                                   @RequestParam(defaultValue = "10") int size, Model model) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Ingredient> ingredientsPage = ingredientService.getIngredients(pageable);
//        List<Ingredient> listeIngredients = ingredientService.getIngredients();
//        model.addAttribute("listeIngredients", listeIngredients);
        model.addAttribute("ingredientsPage", ingredientsPage);






        return "ingredientpage";
    }
}

