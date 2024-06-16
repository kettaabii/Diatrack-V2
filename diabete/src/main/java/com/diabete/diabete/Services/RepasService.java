package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Repas;


import java.util.List;


public interface RepasService {

    public List<Repas> getAllRepas();

    public List<Repas> findRepasByGroupeDiabete(Double valeurGlicemie);
}
