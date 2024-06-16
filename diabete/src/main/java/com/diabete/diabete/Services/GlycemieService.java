package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Glycemie;

import java.util.ArrayList;

public interface GlycemieService {
 void AddGlycemie(Glycemie glycemie);
 ArrayList<Glycemie> ShowGlycemie();
  ArrayList<Glycemie> searchByMonth(Integer month);
 void Delete(Integer id);

}
