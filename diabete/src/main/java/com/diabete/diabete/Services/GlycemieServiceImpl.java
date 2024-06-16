package com.diabete.diabete.Services;

import com.diabete.diabete.Models.Glycemie;
import com.diabete.diabete.Repository.GlycemieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class GlycemieServiceImpl implements GlycemieService{

    @Autowired
    GlycemieRepository glycemieRepository;

    @Override
    public void AddGlycemie(Glycemie glycemie) {
        glycemieRepository.save(glycemie);
    }

    @Override
    public ArrayList<Glycemie> ShowGlycemie() {
        return (ArrayList<Glycemie>) glycemieRepository.findAll();
    }

    @Override
    public ArrayList<Glycemie> searchByMonth(Integer month) {
        return glycemieRepository.findByMonth(month);
    }

    @Override
    public void Delete(Integer id) {
        glycemieRepository.deleteById(id);
    }
}
